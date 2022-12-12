package games.platform.actions;

import games.platform.dbModels.Users;
import games.platform.exceptions.CantFindThisUserException;
import games.platform.fitters.ClientsFitter;
import games.platform.logger.AppLogger;
import games.platform.models.Client;
import games.platform.models.User;
import games.platform.utils.LoggerGlobal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserActions {

    public static User login(String username, String password, Connection dbConnection) throws CantFindThisUserException {
        try {
            PreparedStatement loginPdStt = Users.getExistLoginStatement(username, password, dbConnection);

            ResultSet resultSet = loginPdStt.executeQuery();
            resultSet.next();

            if ((long) resultSet.getObject(1) == 1) {
                int clientId = (int) resultSet.getObject(6);
                Client client = ClientsFitter.getClient(clientId, dbConnection);
                
                User user = new User(
                        (int) resultSet.getObject(2),
                        (String) resultSet.getObject(3),
                        (String) resultSet.getObject(4),
                        (boolean) resultSet.getObject(5),
                        client
                );
                loginPdStt.close();
                return user;
            } else {
                throw new CantFindThisUserException("Usuário Incorreto");
            }

        } catch (SQLException ex) {
            LoggerGlobal.getLogger().addLog(AppLogger.getSevereLevel(), "Erro em: " + ex.getMessage());
            return null;
        }
    }

}
