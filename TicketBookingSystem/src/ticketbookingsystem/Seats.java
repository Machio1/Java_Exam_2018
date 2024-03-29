package src.ticketbookingsystem;


/**
 * Store price and occupancy status of seats.
 *
 * @Author Mathias �stensen
 * @version 1.0, 27.05.2018
 */
public abstract class Seats
{
    private int price;
    private boolean occupied;
    
    /**
     * Initialize seat status as unoccupied.
     */
    public Seats()
    {
        occupied = false;
    }
    
    /**
     * Set price of seat.
     * @param price Price of seat.
     */
    public void setPrice(int price) {
        this.price = price;
    }
    
    /**
     * Return the price of the seat.
     * @return The price of the seat.
     */
    public abstract int getPrice(); 
    
    /**
     * Set status of seat.
     * @param occupied Whether the seat is occupied/unoccupied.
     */
    public void setStatus(boolean occupied) {
        this.occupied = occupied;
    } 
    
    /**
     * Return seat status.
     * @return Seat status.
     */
    public boolean getStatus() {
        return occupied;
    }
}
