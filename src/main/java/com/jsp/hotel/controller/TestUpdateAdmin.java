package com.jsp.hotel.controller;

import com.jsp.hotel.dto.Admin;
import com.jsp.hotel.service.AdminService;

public class TestUpdateAdmin {
	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.setAdmin_id(1);
		admin.setAdmin_name("NAUSHAD");
		
		
		AdminService adminService = new AdminService();
		adminService.update(admin);
	}
}
