package games.platform.models;

public class User {
    
    private final int id;
    private String username;
    private int password;
    private boolean is_adm;

    public User(int id, String username, int password, boolean is_adm) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.is_adm = is_adm;
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
    public int getPassword() {
        return password;
    }
    
    /**
     * Set the value of password
     *
     * @param password the value of password
     */
    public void setPassword(int password) {
        this.password = password;
    }

    /**
     * Get the value of is_adm
     *
     * @return the value of is_adm
     */
    public boolean isIsAdm() {
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
    
    
}
