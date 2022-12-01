package games.platform.dbModels;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Users {
    
    public static PreparedStatement getExistLoginStatement(String username, String password, Connection dbConnection) throws SQLException{
        PreparedStatement pstmt = dbConnection.prepareStatement("SELECT count(id), id, username, password, is_adm, client_id FROM user WHERE username = ? AND password = ?");

        pstmt.setString(1, username);
        pstmt.setString(2, password);
        
        return pstmt;
    }

}
