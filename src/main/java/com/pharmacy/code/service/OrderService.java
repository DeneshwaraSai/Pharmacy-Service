package com.pharmacy.code.service;

import com.pharmacy.code.dto.OrderRequest;
import com.pharmacy.code.dto.OrderResponse;
import com.pharmacy.code.dto.PharmaContext;
import com.pharmacy.code.entity.OrderInfo;
import org.springframework.web.bind.annotation.RequestParam;

public interface OrderService {
	public OrderInfo findByOrderNumber(String orderNumber);

	public OrderResponse save(OrderRequest orderRequest);

	public OrderInfo update(OrderInfo orderInfo);

	public PharmaContext createPharmaContext(String orderNumber, Integer uhid);
}
