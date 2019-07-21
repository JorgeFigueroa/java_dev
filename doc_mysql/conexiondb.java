package utilitarios;
//Importar las clases
import java.sql.*;

public class conexiondb {
    
    public static Connection conetarbd(){
         Connection cn=null;
         
        try {  
            Class.forName("com.mysql.jdbc.Driver");
            //Conexion a base de datos
            cn = DriverManager.getConnection("jdbc:mysql://localhost/ventas","root","123");
            System.out.println("Conexion Ok");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return cn;
    }
    
    
}
