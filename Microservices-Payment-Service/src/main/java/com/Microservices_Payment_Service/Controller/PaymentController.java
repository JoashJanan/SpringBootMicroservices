package com.Microservices_Payment_Service.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	 @GetMapping("/{orderId}")
	 public String payment(@PathVariable int orderId) {

	  return "Payment Successful for Order " + orderId;
	 }
}
