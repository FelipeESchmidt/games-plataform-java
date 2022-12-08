/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package games.platform.actions;

import games.platform.connection.DataBase;
import java.sql.Connection;
import games.platform.models.Client;
import games.platform.models.Deposit;
import games.platform.models.Game;
import games.platform.utils.LoggerGlobal;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author felip
 */
public class ClientActionsTest {

    private Connection connection;
    
    public ClientActionsTest() {
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

    /**
     * Test of buyOneGame method, of class ClientActions.
     */
    @Test
    public void testBuyOneGameWithoutCash() {
        System.out.println("buyOneGame");
        Client client = new Client(1, "Felipe", 20);
        Game game = new Game(1, "", "", new Date(), 30, 1, "");
        Connection dbConnection = this.connection;
        String expResult = "Cliente não tem saldo suficiente para compra";
        String result = ClientActions.buyOneGame(client, game, dbConnection);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of buyOneGame method, of class ClientActions.
     */
    @Test
    public void testBuyOneGameWithCash() {
        System.out.println("buyOneGame");
        Client client = new Client(1, "Felipe", 30);
        Game game = new Game(1, "", "", new Date(), 20, 1, "");
        Connection dbConnection = this.connection;
        String expResult = "Compra Finalizada";
        String result = ClientActions.buyOneGame(client, game, dbConnection);
        assertEquals(expResult, result);
    }

    /**
     * Test of addCash method, of class ClientActions.
     */
    @Test
    public void testAddCash() {
        System.out.println("addCash");
        Deposit deposit = new Deposit(1, 10);
        Connection dbConnection = this.connection;
        String expResult = "Crédito adicionado";
        String result = ClientActions.addCash(deposit, dbConnection);
        assertEquals(expResult, result);
    }

}
