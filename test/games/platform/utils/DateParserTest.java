package games.platform.utils;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DateParserTest {
    
    public DateParserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of parseDateToDatabaseFormat method, of class DateParser.
     */
    @Test
    public void testParseDateToDatabaseFormat() {
        System.out.println("parseDateToDatabaseFormat");
        Date date = new Date(122, 2, 10);
        String expResult = "2022-03-10";
        String result = DateParser.parseDateToDatabaseFormat(date);
        assertEquals(expResult, result);
    }

    /**
     * Test of parseDateFromDatabaseFormat method, of class DateParser.
     */
    @Test
    public void testParseDateFromDatabaseFormat() {
        System.out.println("parseDateFromDatabaseFormat");
        String date = "2022-03-10";
        int expResult = 2022;
        Date result = DateParser.parseDateFromDatabaseFormat(date);
        assertNotNull(result);
        assertEquals(expResult, result.getYear() + 1900);
    }

    /**
     * Test of parseDateToBrazilianFormat method, of class DateParser.
     */
    @Test
    public void testParseDateToBrazilianFormat() {
        System.out.println("parseDateToBrazilianFormat");
        Date date = new Date(122, 2, 10);
        String expResult = "10/03/2022";
        String result = DateParser.parseDateToBrazilianFormat(date);
        assertEquals(expResult, result);
    }
    
}
