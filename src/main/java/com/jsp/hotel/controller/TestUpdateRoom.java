package com.jsp.hotel.controller;

import com.jsp.hotel.dto.Room;
import com.jsp.hotel.service.RoomService;

public class TestUpdateRoom {
	public static void main(String[] args) {
		Room room= new Room();
		room.setRoom_id(1);
		room.setRoom_price(5000.00);
		
		RoomService roomService= new RoomService();
		roomService.update(room);
	}
}
