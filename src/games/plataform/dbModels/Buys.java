package games.plataform.dbModels;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Buys {
    
    public static PreparedStatement getBuyStatement(int clientId, int gameId, Connection dbConnection) throws SQLException{
        PreparedStatement pstmt = dbConnection.prepareStatement("INSERT INTO buy VALUES (null, ?, ?) ");

        // Setando o valor ao parâmetro 
        pstmt.setInt(1, clientId);
        pstmt.setInt(2, gameId);
        
        return pstmt;
    }
    
}
