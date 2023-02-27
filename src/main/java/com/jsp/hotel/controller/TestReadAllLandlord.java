package com.jsp.hotel.controller;

import java.util.List;

import com.jsp.hotel.dto.LandLord;
import com.jsp.hotel.service.LandlordService;


public class TestReadAllLandlord {
	public static void main(String[] args) {
		LandlordService landlordService = new LandlordService();
		List<LandLord> landLord = landlordService.readAllLandlord();
		for (LandLord landLord2 : landLord) {
			System.out.println(landLord2.getId());
			System.out.println(landLord2.getName());
			System.out.println(landLord2.getAddress());
			System.out.println(landLord2.getStatus());
			System.out.println();
		}
	}
}
