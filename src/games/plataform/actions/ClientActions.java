package games.plataform.actions;

import games.plataform.dbModels.Buys;
import games.plataform.dbModels.Clients;
import games.plataform.models.Client;
import games.plataform.models.Game;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClientActions {

    public static String buyOneGame(Client client, Game game, Connection dbConnection) {
        if (client.getBalance() < game.getPrice()) {
            return ("Cliente não tem saldo suficiente para compra");
        }
        try{
            dbConnection.setAutoCommit(false);
            
            PreparedStatement balancePdStt = Clients.getClientBalanceDecreaseStatement(client.getId(), game.getPrice(), dbConnection);
            PreparedStatement buyPdStt = Buys.getBuyStatement(client.getId(), game.getId(), dbConnection);
            
            balancePdStt.executeUpdate();
            buyPdStt.executeUpdate();
            
            dbConnection.commit();
            dbConnection.setAutoCommit(true);
            
            balancePdStt.close();
            buyPdStt.close();
            
            return ("Compra Finalizada");
        } catch(SQLException ex) {
            return ("Erro em: " + ex.getMessage());
        }
    }

}
