package games.platform.run;

import games.platform.gui.LoginForm;
import games.platform.utils.DbGlobal;
import games.platform.utils.LoggerGlobal;

public class Main {

    public static void main(String[] args) {
        
        LoggerGlobal.generateLogger();
        DbGlobal.generateDb();
        
        LoginForm window = new LoginForm(null, false);
        window.setVisible(true);
        
    }
    
}
