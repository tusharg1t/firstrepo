package com.lti.model;

public class Booking {
	int bookingNo;
	Flight flight;
	public Booking(int bookingNo, Flight flight) {
		super();
		this.bookingNo = bookingNo;
		this.flight = flight;
	}
	public int getBookingNo() {
		return bookingNo;
	}
	public void setBookingNo(int bookingNo) {
		this.bookingNo = bookingNo;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
}
