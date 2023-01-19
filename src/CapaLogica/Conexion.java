
package CapaLogica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    
    static Connection conn =null;
    
    public static Connection conectar(){
        String url="jdbc:sqlserver://localhost\\DESKTOP-RJMH60N\\SERVIDOR:1280;databaseName=db_ventas";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("error de sql " + e.getMessage());
        }
        
        try {
            conn=DriverManager.getConnection(url,"sa","1234");
        } catch (SQLException e) {
            System.out.println("herror de conexion del  driver "+ e.getMessage());
        }
        return conn;
    }
}
 