/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package games.platform.utils;

import games.platform.connection.DataBase;

public class DbGlobal {

    private static DataBase db;

    /**
     * Get the Database
     *
     * @return database
     */
    public static DataBase getDb() {
        return db;
    }

    /**
     * Generate the Database and store it as static
     *
     */
    public static void generateDb() {
        DbGlobal.db = new DataBase();
    }

}
