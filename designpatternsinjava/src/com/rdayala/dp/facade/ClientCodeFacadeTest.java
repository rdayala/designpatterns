package com.rdayala.dp.facade;

import java.util.Date;

// Client code deals with high level interface from Facade

public class ClientCodeFacadeTest {

	public static void main(String[] args) {

		TravelFacade facade = new TravelFacade();
		Date from = null;
		Date to = null;
		System.out.println("Client only calls Facade interface..");
		facade.getFlightsAndHotels(from, to);
	}
}