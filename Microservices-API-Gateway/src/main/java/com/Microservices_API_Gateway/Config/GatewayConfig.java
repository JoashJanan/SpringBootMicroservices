package com.Microservices_API_Gateway.Config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

	 @Bean
	 public RouteLocator routes(RouteLocatorBuilder builder) {

	  return builder.routes()

	   .route("product-service",
	    r -> r.path("/product/**")
	     .uri("lb://PRODUCT-SERVICE"))

	   .route("order-service",
	    r -> r.path("/order/**")
	     .uri("lb://ORDER-SERVICE"))

	   .route("payment-service",
	    r -> r.path("/payment/**")
	     .uri("lb://PAYMENT-SERVICE"))

	   .build();
	 }
}
