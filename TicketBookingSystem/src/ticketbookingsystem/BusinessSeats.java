package src.ticketbookingsystem;


/**
 * Store information specific to business class seats.
 *
 * @Author Mathias �stensen
 * @version 1.0, 27.05.2018
 */
public class BusinessSeats extends Seats
{
    private int price;

    /**
     * Initialize the price of business class seat objects.
     */
    public BusinessSeats()
    {
        price = 10000;
    }
    
    /**
     * Return the price of the seat.
     * @return The price of the seat.
     */
    public int getPrice(){
        return price;
    } 
}