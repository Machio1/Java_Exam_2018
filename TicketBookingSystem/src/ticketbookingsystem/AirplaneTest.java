package src.ticketbookingsystem;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AirplaneTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AirplaneTest
{
    private src.ticketbookingsystem.Airplane airplane1;

    /**
     * Default constructor for test class AirplaneTest
     */
    public AirplaneTest()
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
        airplane1 = new src.ticketbookingsystem.Airplane("LHR - KIX", "11:30", "ANA 23", "15");
        airplane1.setPasSeat("Success Name", "Seat23");
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
    public void pasListFailTest(){
        System.out.println("Test failure of call to passenger list.");
        airplane1.getPasSeat("Fail Name");
        System.out.println();
    }
    
    @Test
    public void pasListTest(){
        System.out.println("Test Success of passenger list.");
        airplane1.getPasSeat("Success Name");
        System.out.println();
    }
}
