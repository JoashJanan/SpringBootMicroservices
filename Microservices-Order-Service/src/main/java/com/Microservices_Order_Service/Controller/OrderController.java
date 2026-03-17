package com.Microservices_Order_Service.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

	 @Autowired
	 RestTemplate restTemplate;

	 @GetMapping("/{id}")
	 public String placeOrder(@PathVariable int id) {

	  String product =
	   restTemplate.getForObject(
	   "http://PRODUCT-SERVICE/product/1",
	   String.class);

	  String payment =
	   restTemplate.getForObject(
	   "http://PAYMENT-SERVICE/payment/" + id,
	   String.class);

	  return "Order Placed\n" + product + "\n" + payment;
	 }

}
