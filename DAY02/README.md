Day 02 - Dependency Injection + Conditional Bean Loading
📌 What I Learned

Today I learned how Spring Boot automatically injects objects (Beans) using Constructor Injection and how to load different implementations based on application properties using @ConditionalOnProperty.

📂 Project Structure
PaymentService (Interface)
▲
│
┌───────────────┐
│               │
PhonepayService  RazorpayPaymentService
▲               ▲
└───────┬───────┘
│
Day02Application
1️⃣ PaymentService (Interface)
public interface PaymentService {
String pay();
}
Explanation
This is an interface.
It defines a common method pay().
Any payment provider (PhonePe, Razorpay, Paytm, etc.) can implement this interface.
This follows the Open/Closed Principle, making it easy to add new payment providers without changing existing code.
2️⃣ RazorpayPaymentService
@Component
@ConditionalOnProperty(
name = "payment.provider",
havingValue = "razor"
)
Explanation
@Component tells Spring to create this class as a Bean.
@ConditionalOnProperty loads this bean only if
payment.provider=razor

is present in application.properties.

So Spring creates this bean only when Razorpay is selected.

3️⃣ PhonepayService
@Controller
@ConditionalOnProperty(
name = "payment.provider",
havingValue = "phonepe"
)
Explanation

This class works exactly like the Razorpay service but is loaded only when

payment.provider=phonepe

Although @Controller is used here, it still becomes a Spring Bean.

For service classes, @Service is the recommended annotation, but @Controller, @Component, and @RestController are also Spring-managed stereotypes.

4️⃣ Constructor Injection
private final PaymentService paymentService;

public Day02Application(PaymentService paymentService) {
this.paymentService = paymentService;
}
Explanation

Spring automatically injects the correct implementation into the constructor.

If

payment.provider=razor

Spring injects

RazorpayPaymentService

If

payment.provider=phonepe

Spring injects

PhonepayService
Why Constructor Injection?

✅ Recommended by Spring

✅ Works with final variables

✅ Makes objects immutable

✅ Easier to test

Better than field injection (@Autowired on fields).

5️⃣ CommandLineRunner
public class Day02Application
implements CommandLineRunner
Explanation

CommandLineRunner runs automatically after the Spring Boot application starts.

@Override
public void run(String... args) {
String payment = paymentService.pay();
System.out.println("Payment done : " + payment);
}

This is useful for

Testing
Running startup logic
Loading initial data

without creating REST APIs.

6️⃣ application.properties
payment.provider=razor

This property decides which payment service Spring should load.

Example
payment.provider=razor

Output

Payment from: Razorpay Payment
Payment done: Razorpay Payment

Change to

payment.provider=phonepe

Output

Payment From: Phonepe Payment
Payment done: Phonepe Payment
7️⃣ Environment Variables

Instead of changing application.properties, you can override the value using environment variables.

Example

PAYMENT_PROVIDER=phonepe

Spring automatically maps

PAYMENT_PROVIDER

to

payment.provider

This is useful when deploying applications to servers or Docker containers.

🔑 Key Concepts Learned
Spring Beans
@Component
@Controller
Constructor Injection
final dependency injection
CommandLineRunner
Interfaces for loose coupling
@ConditionalOnProperty
Configuration using application.properties
Overriding properties with environment variables

🚀 Learning Outcome

This project demonstrates how Spring Boot uses Dependency Injection to inject the correct implementation at runtime. By simply changing a configuration property, the application switches between different payment providers without modifying the application code. This makes the application loosely coupled, scalable, and easy to maintain.