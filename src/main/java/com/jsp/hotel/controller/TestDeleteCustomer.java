package com.jsp.hotel.controller;

import com.jsp.hotel.service.CustomerService;

public class TestDeleteCustomer {
	public static void main(String[] args) {
		int customer_id = 1;
		CustomerService customerService = new CustomerService();
		customerService.delete(customer_id);

	}
}
