package com.jsp.hotel.controller;

import com.jsp.hotel.dto.Room;
import com.jsp.hotel.service.RoomService;

public class TestReadRoomById {
	public static void main(String[] args) {
		int room_id = 2;

		RoomService roomService = new RoomService();

		Room room = roomService.readById(room_id);
		System.out.println(room.getRoom_id());
		System.out.println(room.getRoom_price());
		System.out.println(room.getRoom_status());
		System.out.println("Property id is " + room.getProperty());
		System.out.println("Customer id is " + room.getCustomer());
	}

}
