package com.jsp.hotel.controller;

import com.jsp.hotel.service.RoomService;

public class TestDeleteRoom {
	public static void main(String[] args) {
		int room_id=1;
		
		RoomService roomService= new RoomService();
		roomService.deleteById(room_id);
	}
}
