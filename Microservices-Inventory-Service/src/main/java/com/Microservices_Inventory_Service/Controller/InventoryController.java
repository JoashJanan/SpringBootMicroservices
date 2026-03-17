package com.Microservices_Inventory_Service.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class InventoryController {


	 @GetMapping("/{id}")
	 public String getProduct(@PathVariable int id) {

	  return "Product: Laptop | Price: 50000";
	 }
}
