package com.rdayala.dp.facade;

import java.util.Date;

// Facade class provides simplified interface to the client
// It internally may use multiple sub systems

// Provide a unified interface to a set of interfaces in a subsystem.

public class TravelFacade {

	private HotelBooker hotelBooker = new HotelBooker();
	private FlightBooker flightBooker = new FlightBooker();

	public void getFlightsAndHotels(Date from, Date to) {
		flightBooker.getFlightsFor(from, to);
		hotelBooker.getHotelNamesFor(from, to);
		// process and return
	}
}
