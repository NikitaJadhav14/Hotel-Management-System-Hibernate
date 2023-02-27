package com.jsp.hotel.controller;

import com.jsp.hotel.dto.LandLord;
import com.jsp.hotel.service.LandlordService;

public class TestUpdateLandlord {
public static void main(String[] args) {
	LandLord landLord= new LandLord();
	landLord.setId(2);
	landLord.setName("madhu");
	
	LandlordService landlordService= new LandlordService();
	landlordService.update(landLord);
}
}
