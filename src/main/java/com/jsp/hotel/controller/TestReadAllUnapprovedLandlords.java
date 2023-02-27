package com.jsp.hotel.controller;

import java.util.List;

import com.jsp.hotel.dto.LandLord;
import com.jsp.hotel.service.AdminService;

public class TestReadAllUnapprovedLandlords {
	public static void main(String[] args) {
		AdminService adminService = new AdminService();
		List<LandLord> landLords = adminService.readAllUnapprovedLandlords();
		for (LandLord landLord : landLords) {
			System.out.println(landLord.getId());
			System.out.println(landLord.getName());
			System.out.println(landLord.getAddress());
			System.out.println(landLord.getStatus());
			System.out.println();
		}
	}
}
