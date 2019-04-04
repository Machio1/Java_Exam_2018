package src.ticketbookingsystem;


/**
 * Store information specific to economy class seats.
 *
 * @Author Mathias �stensen
 * @version 1.0, 27.05.2018
 */
public class EconomySeats extends Seats
{
    private int price;
    
    /**
     * Initialize the price of economy class seat objects.
     */
    public EconomySeats() {
        this.price = 3000;
    }
    
    /**
     * Return the price of the seat.
     * @return The price of the seat.
     */
    public int getPrice(){
        return price;
    }
}
