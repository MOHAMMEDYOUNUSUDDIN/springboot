package com.example.DAY02;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

//all anotation are samep;
//@Component
//@Service
//@RestController
@Controller
@ConditionalOnProperty(name = "payment.provider",havingValue = "phonepe")

public class PhonepayService implements PaymentService{
    public String pay(){
        String payment="Phonepe Payment";
        System.out.println("Payment From:"+payment);
        return payment;
    }
}
