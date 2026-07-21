package com.example.DAY02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day02Application implements CommandLineRunner {

//	@Autowired

	private final PaymentService paymentService;

	//final is only allowed in contructor not in autowired contructor is better

	//contructor injection of been
    public Day02Application(PaymentService paymentService) {
        this.paymentService = paymentService;
    }




    public static void main(String[] args) {

		SpringApplication.run(Day02Application.class, args

		);
	}
	@Override
	public void run(String... args) throws Exception {
       String payment = paymentService.pay();
	   System.out.println("Payment done :"+payment);
	}

}
