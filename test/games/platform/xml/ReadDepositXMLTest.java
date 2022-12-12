package games.platform.xml;

import games.platform.models.Deposit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReadDepositXMLTest {
    
    public ReadDepositXMLTest() {
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
     * Test of getDepositFromFile method, of class ReadDepositXML.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetDepositFromFile() throws Exception {
        System.out.println("getDepositFromFile");
        String filename = "deposit.xml";
        float expResult = (float) 150.5;
        Deposit result = ReadDepositXML.getDepositFromFile(filename);
        assertEquals(expResult, result.getDepositValue(), 10);
    }
    
}
