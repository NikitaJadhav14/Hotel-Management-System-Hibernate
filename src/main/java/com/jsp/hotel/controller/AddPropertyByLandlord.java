package com.jsp.hotel.controller;

import com.jsp.hotel.dto.LandLord;
import com.jsp.hotel.service.LandlordService;

public class AddPropertyByLandlord {
	public static void main(String[] args) {
		LandLord landLord = new LandLord();
		landLord.setId(3);

		int property_id = 3;
		LandlordService landlordService = new LandlordService();
		landlordService.addPropertyById(property_id, landLord);

	}
}
