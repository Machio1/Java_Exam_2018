/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.ticketbookingsystem;

/**
 * @Author Mathias Østensen
 * @version 1.0, 27.05.2018
 */
public class TicketBookingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BookingSystem booking1 = new BookingSystem();
        booking1.newFlight("LHR - KIX", "11:30", "ANA 23", "Gate 23");
    }
    
}
