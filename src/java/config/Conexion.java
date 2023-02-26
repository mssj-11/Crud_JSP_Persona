package config;

import java.sql.*;
/**
 * @author HP
 */

//  Clase Conexion
public class Conexion {
    
    //  Variable de tipo Connection
    Connection conn;
    
    //  Metodo Conexion
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_jsp", "root", "");
            
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " +e);
        }
    }
    
    //  Retornando la conexion
    public Connection getConnection(){
        return conn;
    }
    
}