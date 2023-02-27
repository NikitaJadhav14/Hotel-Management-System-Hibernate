package com.jsp.hotel.controller;

import com.jsp.hotel.dto.LandLord;
import com.jsp.hotel.service.LandlordService;

public class TestReadLandlordById {
	public static void main(String[] args) {
		int landlord_id = 2;

		LandlordService landlordService = new LandlordService();
		LandLord landLord = landlordService.readById(landlord_id);
		System.out.println(landLord.getId());
		System.out.println(landLord.getName());
		System.out.println(landLord.getAddress());
		System.out.println(landLord.getStatus());
	}
}
