package com.jsp.hotel.controller;

import com.jsp.hotel.dto.Admin;
import com.jsp.hotel.service.AdminService;

public class TestSaveAdmin {
	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.setAdmin_name("MR NAUSHAD");
		admin.setEmail_id("NAUSHAD@GMAIL.COM");

		AdminService adminService = new AdminService();
		adminService.create(admin);

	}
}
