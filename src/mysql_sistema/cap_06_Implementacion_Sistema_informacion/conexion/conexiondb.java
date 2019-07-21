package mysql_sistema.cap_06_Implementacion_Sistema_informacion.conexion;//Importar las clases
import java.sql.*;

public class conexiondb {
    
    public static Connection conetarbd(){
         Connection cn=null;
         
        try {  
            Class.forName("com.mysql.jdbc.Driver");
            //Conexion a base de datos
            cn = DriverManager.getConnection("jdbc:mysql://localhost/java_bdtottus","root","yategane");
            System.out.println("Conexion Ok");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return cn;
    }
    
    
}
