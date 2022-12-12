package games.platform.actions;

import games.platform.connection.DataBase;
import games.platform.exceptions.CantFindThisUserException;
import games.platform.models.User;
import games.platform.utils.LoggerGlobal;
import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserActionsTest {
    
    private Connection connection;
    
    public UserActionsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.connection = new DataBase().getConnection();
        LoggerGlobal.generateLogger();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of login method, of class UserActions.
     */
    @Test
    public void testLoginValid() throws Exception {
        System.out.println("login válido");
        String username = "Felipe";
        String password = "12345";
        String expResult = "Felipe Schmidt";
        User result = UserActions.login(username, password, connection);
        assertNotNull(result.getClient());
        assertEquals(expResult, result.getClient().getName());
    }
    
    /**
     * Test of login method, of class UserActions.
     */
    @Test(expected = CantFindThisUserException.class)
    public void testLoginInvalid() throws Exception {
        System.out.println("login inválido");
        String username = "Inexistente";
        String password = "00000";
        UserActions.login(username, password, connection);
    }
    
}
