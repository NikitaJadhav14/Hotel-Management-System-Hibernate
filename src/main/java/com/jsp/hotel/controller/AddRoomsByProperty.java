package com.jsp.hotel.controller;

import com.jsp.hotel.dto.Property;
import com.jsp.hotel.service.PropertyService;

public class AddRoomsByProperty {
	public static void main(String[] args) {
		Property property = new Property();
		property.setProperty_id(3);

		int room_id=9;
		PropertyService propertyService = new PropertyService();
		propertyService.addRoomsByPropertyId(room_id, property);
	}
}