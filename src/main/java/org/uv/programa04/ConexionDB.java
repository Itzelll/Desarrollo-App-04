/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Itzel
 */
public class ConexionDB {
    //singleton
    private static ConexionDB cx = null;

    private Connection con = null;

    public static ConexionDB getInstance() {
        if (cx == null) {
            cx = new ConexionDB();
        }
        return cx;
    }

    public ConexionDB() {
        try {
            String url = "jdbc:postgresql://localhost:5432/ejemplo";
            String pwd = "123456";
            String user = "postgres";
            con = DriverManager.getConnection(url, user, pwd);
            Logger.getLogger(Programa04.class.getName()).log(Level.INFO, "Se conectó...");
        } catch (SQLException ex) {
            Logger.getLogger(Programa04.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //inyeccion de dependencias
    public boolean execute(String sql){
        return true;
    }
    
    //metodo sobrecargado de EXECUTE
    public boolean execute(TransaccionDB tdb){
        return tdb.execute(con);
    }
}
