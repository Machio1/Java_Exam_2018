package src.ticketbookingsystem;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TicketTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TicketTest
{
    private src.ticketbookingsystem.Ticket ticket1;

    /**
     * Default constructor for test class TicketTest
     */
    public TicketTest()
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
        ticket1 = new src.ticketbookingsystem.Ticket("Failure Name");
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
    /**
    @Test
    public void failGetSeatTest()
    {
        ticket1.getSeatNum();
    }
    
    @Test
    public void failGetFlightTest()
    {
        ticket1.getFlight();
    }*/
}

