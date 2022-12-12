package games.platform.utils;

import games.platform.models.User;

public class UserConnected {
    
    private static User user;
    
    /**
     * Validate is has an user logged
     *
     * @return has user logged
     */
    public static boolean hasUserConnected(){
        return user != null;
    }
    
    /**
     * Set new logged user
     *
     * @param user new logged user
     */
    public static void setUser(User user){
        UserConnected.user = user;
    }
    
    /**
     * Get logged user
     *
     * @return logged user
     */
    public static User getUser(){
        return user;
    }
    
}
