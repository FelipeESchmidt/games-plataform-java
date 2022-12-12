package games.platform.fitters;

import games.platform.dbModels.Clients;
import games.platform.models.Client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ClientsFitter {
    
    /**
     * Get all Clients registered as ArrayList
     *
     * @param client_id client id
     * @param connection database Connection
     * @return an ArrayList with all Clients
     */
    public static Client getClient(int client_id, Connection connection) throws SQLException {
        Client client = null;
        
        //Obtém os metadados do resultado
        try {
            PreparedStatement clientPdStt = Clients.getClient(client_id, connection);
            ResultSet resultSet = clientPdStt.executeQuery();
            
            //percorre os dados retornados pela consulta exibindo-os
            while (resultSet.next()) {
                client = new Client((int) resultSet.getObject(1), (String) resultSet.getObject(2), (float) resultSet.getObject(3));
            }
            
            resultSet.close();
            clientPdStt.close();
        }
        catch(Exception e){
            
        }
        
        return client;
    }
    
    /**
     * Get all Clients registered as ArrayList
     *
     * @param connection database Connection
     * @return an ArrayList with all Clients
     */
    public static ArrayList<Client> getAllClients(Connection connection) throws SQLException {
        ArrayList<Client> allClients = new ArrayList<>();
        
        Statement stmt = connection.createStatement();
        
        //Obtém os metadados do resultado
        try (ResultSet resultSet = stmt.executeQuery(Clients.getClients())) {
            //Obtém os metadados do resultado
            
            //percorre os dados retornados pela consulta exibindo-os
            while (resultSet.next()) {
                allClients.add(new Client((int) resultSet.getObject(1), (String) resultSet.getObject(2), (float) resultSet.getObject(3)));
            }
            
            resultSet.close();
            stmt.close();
        }
        
        return allClients;
    }
    
}
