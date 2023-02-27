package com.jsp.hotel.controller;

import com.jsp.hotel.dto.Admin;
import com.jsp.hotel.service.AdminService;

public class ApproveLandlord {
	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.setAdmin_id(1);
		
		int Landlord_id = 3;

		AdminService adminService = new AdminService();
		adminService.approveLandlordById(Landlord_id, admin);
	}

}
