package com.abhishek.lld.facade;

// Step 3: Use the Facade Pattern

public class FacadeDemo {
	
    public static void main(String[] args) {
    	 VacationFacade vacationFacade = new VacationFacade();
         vacationFacade.bookVacation();
         vacationFacade.cancelVacation();
    }
}
