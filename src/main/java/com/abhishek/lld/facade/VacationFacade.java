package com.abhishek.lld.facade;

// Step 2: Create the Facade Class ::: Facade Class

public class VacationFacade {
	
	private FlightBooking flightBooking;
    private HotelBooking hotelBooking;
    private CarRental carRental;
    private InsuranceBooking insuranceBooking;

    public VacationFacade() {
        this.flightBooking = new FlightBooking();
        this.hotelBooking = new HotelBooking();
        this.carRental = new CarRental();
        this.insuranceBooking = new InsuranceBooking();
    }

    public void bookVacation() {
        flightBooking.bookFlight();
        hotelBooking.bookHotel();
        carRental.bookCar();
        insuranceBooking.bookInsurance();
        System.out.println("Vacation booked successfully.");
    }
    
    public void cancelVacation() {
        System.out.println("Vacation cancelled successfully.");
    }
}
