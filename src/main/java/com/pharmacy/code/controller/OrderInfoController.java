package com.pharmacy.code.controller;

import com.pharmacy.code.dto.PharmaContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pharmacy.code.dto.OrderRequest;
import com.pharmacy.code.dto.OrderResponse;
import com.pharmacy.code.entity.OrderInfo;
import com.pharmacy.code.service.OrderService;

@CrossOrigin
@RestController
public class OrderInfoController {
	
	private OrderService orderService;
	
	@Autowired
	public OrderInfoController(OrderService orderService) {
		this.orderService = orderService;
	}
	
	@PostMapping("/order/create")
		public OrderResponse save(@RequestBody OrderRequest orderRequest) {
		// TODO Auto-generated method stub
		return orderService.save(orderRequest);
	}

	@GetMapping("/order/pharmaContext")
	public PharmaContext createPharmaContext(@RequestParam(name = "orderNumber") String orderNumber,
											 @RequestParam(name = "uhid") Integer uhid) {
		return orderService.createPharmaContext(orderNumber, uhid);
	}
}
