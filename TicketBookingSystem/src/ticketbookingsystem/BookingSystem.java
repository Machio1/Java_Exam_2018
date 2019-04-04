package src.ticketbookingsystem;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * Create an Airplane object.
 * Create a list with Ticket objects with information about tickets.
 *
 * @Author Mathias Østensen
 * @version 1.0, 27.05.2018
 */
public class BookingSystem
{    
    private HashMap<String, Ticket> ticketList; 
    private ArrayList<Integer> ticketsSold;
    private Ticket ticket;
    private Airplane flight;
    
    
    /**
     * Create new HashMap with Ticket objects with String as key, and new ArrayList that registers price of tickets sold.
     */
    public BookingSystem()
    {
        ticketList = new HashMap<>();
        ticketsSold = new ArrayList<>();
    }
    
    /**
     * Create Airplane object.
     * @param flightRoute The route the flight travels.
     * @param flightTime The time the plane leaves.
     * @param flightName The name of the flight.
     * @param flightGate The gate the flight leaves from.
     */
    public void newFlight(String flightRoute, String flightTime, String flightName, String flightGate){
        flight = new Airplane(flightRoute, flightTime, flightName, flightGate);
    } 
    
    /**
     * Create new ticket to flight in passenger's name, and reserve seat if it's unoccupied.
     * Register ticket in ticketList and ticketSold.
     * @param seatRow The row where the seat is located.
     * @param seatCol The collum where the seat is located.
     * @param passengerName Name of passenger
     */
    public void newTicket(int seatRow, int seatCol, String passengerName){        
        //reserves seat
        this.flight.reserveSeat(seatRow, seatCol, passengerName); 
            
        //creates ticket and registers information to the Ticket object
        this.ticket = new Ticket(passengerName);
        this.ticket.setSeatNum(flight.getPasSeat(passengerName));
        this.ticket.setFlight("FLIGHT: " + flight.getName() + " ROUTE: " + flight.getRoute() +
                           "   " + flight.getTime() + "  "+ " GATE "+ flight.getGate());
            
        //put passenger name and ticket into ticket list
        //register price paid into list of tickets sold
        ticketList.put(passengerName, ticket);
        ticketsSold.add(flight.getPrice(seatRow, seatCol));
    }    
    
    /** 
     * Find and print ticket in passenger's name.
     * @param passengerName Name of passenger the ticket is registered to.
     */
    public void printTicket(String passengerName)
    {
        //gets ticket in passengers name and calls the object's printTicket method
        Ticket t = ticketList.get(passengerName);
        t.printTicket();
    }
    
    /** 
     * Find ticket number registered in passenger's name.
     * @param passengerName Name of passenger the ticket is registered to.
     * @return Ticket number as String.
     */
    public String search(String passengerName){
        //gets ticket in passengers name and calls the object's printTicket method
        Ticket t = ticketList.get(passengerName);
        return t.getTicketString();
    }
    
    /** 
     * Print complete list of price of all tickets sold, and adds them together. 
     */
    public void printSales(){
        //interates over ticketSold and prints out every element
        int total = 0;
        for(Integer ticket : ticketsSold){
            System.out.print(ticket);
            System.out.println();
            total += ticket;
        }
        //adds together all elements and prints the total
        System.out.println("Total: " + total);
    }
    
    /**
     * Print list of all passengers registered for the flight.
     */
    public void printPassengerList(){
        flight.printPassengerList();
    }
}
