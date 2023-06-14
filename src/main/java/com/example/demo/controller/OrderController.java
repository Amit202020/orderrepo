package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Order;

@RestController
public class OrderController {
	
	List<Order>    list = Arrays.asList(
			new  Order(1001,"foolball","yellow color"),
			new  Order(1002,"ipod","sea gray color"),
			new  Order(1003,"iot device","sensor enabled")
			);
	
	
	
	@GetMapping("/allOrders")
	public  List<Order>   getAllOrder() {
		
		return  list;
		
	}

}
