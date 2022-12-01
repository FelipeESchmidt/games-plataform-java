package games.platform.models;

public class User {
    
    private final int id;
    private String username;
    private String password;
    private boolean is_adm;
    private final int client_id;

    public User(int id, String username, String password, boolean is_adm, int client_id) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.is_adm = is_adm;
        this.client_id = client_id;
    }

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Get the value of username
     *
     * @return the value of username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Set the value of username
     *
     * @param username the value of username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Get the value of password
     *
     * @return the value of password
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * Set the value of password
     *
     * @param password the value of password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get the value of is_adm
     *
     * @return the value of is_adm
     */
    public boolean isAdm() {
        return is_adm;
    }

    /**
     * Set the value of is_adm
     *
     * @param is_adm the value of is_adm
     */
    public void setIsAdm(boolean is_adm) {
        this.is_adm = is_adm;
    }
    
    /**
     * Get the value of client_id
     *
     * @return the value of client_id
     */
    public int getClientId() {
        return client_id;
    }
}
