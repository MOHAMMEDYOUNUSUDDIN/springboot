package com.example.DAY02;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "payment.provider",havingValue = "razor")
public class RazorpayPAymentService implements PaymentService {

    public String pay(){
        String payment = "Razorpay Payment";
        System.out.println("Payment from:"+payment);
        return payment;
    }

}
