package mysql_sistema.cap_04_introduccion_mysql;

//1 importar las librerias JDBC

import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;


public class conexiondb {
    //2. crear un procedimiento para conectarnos ala base de datos
    
    public static Connection obtieneConexion(){
        Connection cn = null;
        
        // a. controlador de errores
        try {  //  zona de evaluacion de errores
           
            Class.forName("com.mysql.jdbc.Driver");  // cargar el driver  JDBC

            //cn = DriverManager.getConnection("jdbc:mysql://localhost/almacen_mysql", "root", "123");     // establecer la cadena de conecion
            cn = DriverManager.getConnection("jdbc:mysql://localhost/java_almacen", "root", "yategane");     // establecer la cadena de conecion

            System.out.println("conexion satisfactoria");
            
        } catch (Exception e) {  // zona son acciones si hay error
            System.out.println("Error"+  e);        
        }
                
        // retornar la conexion
        return cn;
        
    }


}
