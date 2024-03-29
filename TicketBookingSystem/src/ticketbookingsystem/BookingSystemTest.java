package src.ticketbookingsystem;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 *
 * @Author Mathias �stensen
 * @version 1.0, 27.05.2018
 */
public class BookingSystemTest
{
    private src.ticketbookingsystem.BookingSystem bookingS1;

    /**
     * Default constructor for test class BookingSystemTest
     */
    public BookingSystemTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        bookingS1 = new src.ticketbookingsystem.BookingSystem();
        bookingS1.newFlight("LHR - KIX", "11:30", "ANA 23", "15");
        System.out.println("Setup flight done.");
        bookingS1.newTicket(15, 5, "Bobby Lee");
        System.out.println("Setup Bobby done.");
        bookingS1.newTicket(25, 3, "Khalyla Lee");
        System.out.println("Setup Khalyla done.");
        System.out.println();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void seatOccupiedTest()
    {        
        System.out.println("Test double booking seat.");
        System.out.println("Trying to book George in Bobby's seat");
        bookingS1.newTicket(15, 5, "George Pink");
        System.out.println();
    }
    
    @Test
    public void printTest(){
        System.out.println("Test print ticket.");
        bookingS1.printTicket("Bobby Lee");
        System.out.println();
        
        System.out.println("Test run finished");
        System.out.println();
    }
    
    @Test
    public void printTest2(){        
        System.out.println("Test print 2 ticket.");
        bookingS1.printTicket("Khalyla Lee");
        System.out.println();
        
        System.out.println("Test run finished");
        System.out.println();
    }
    
    @Test
    public void searchTest1(){
        System.out.println("Test search.");
        bookingS1.search("Bobby Lee");
        System.out.println();
        
        System.out.println("Test run finished");
        System.out.println();
    }
    
    @Test
    public void searchTest2(){
        System.out.println("Test search.");
        bookingS1.search("Khalyla Lee");
        System.out.println();
        
        System.out.println("Test run finished");
        System.out.println();
    }
    
    @Test
    public void printSalesTest(){
        System.out.println("Test print sales.");
        bookingS1.printSales();
        System.out.println();
    }
    
    @Test
    public void pasListTest(){
        System.out.println("Test print passenger list.");
        bookingS1.printPassengerList();
        System.out.println();
    }        
}





