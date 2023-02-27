package com.jsp.hotel.controller;

import com.jsp.hotel.dto.LandLord;
import com.jsp.hotel.service.LandlordService;

public class TestSaveLandlord {
	public static void main(String[] args) {
		LandLord landLord = new LandLord();
		landLord.setName("MR DIPESH");
		landLord.setAddress("KANDIVALI");
		landLord.setStatus("approved");

		LandLord landLord1 = new LandLord();
		landLord1.setName("MR VIKAS");
		landLord1.setAddress("BORIVALI");
		landLord.setStatus("approved");

		LandLord landLord2 = new LandLord();
		landLord2.setName("MR NIKHIL");
		landLord2.setAddress("NAVI MUMBAI");
		landLord.setStatus("approved");

		LandlordService landlordService = new LandlordService();
		landlordService.create(landLord);
		landlordService.create(landLord1);
		landlordService.create(landLord2);

	}

}
