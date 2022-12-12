package games.platform.utils;

import games.platform.models.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserConnectedTest {
    
    public UserConnectedTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        UserConnected.setUser(null);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of hasUserConnected method, of class UserConnected.
     */
    @Test
    public void testHasUserConnected() {
        System.out.println("hasUserConnected");
        boolean expResult = false;
        boolean result = UserConnected.hasUserConnected();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUser method, of class UserConnected.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        User user = new User(1, "Felipe", "12345", true, null);
        UserConnected.setUser(user);
        boolean expResult = true;
        boolean result = UserConnected.hasUserConnected();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUser method, of class UserConnected.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        User user = new User(1, "Felipe", "12345", true, null);
        UserConnected.setUser(user);
        User result = UserConnected.getUser();
        assertEquals(user.getUsername(), result.getUsername());
    }
    
}
