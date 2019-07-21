package mysql_sistema.cap_04_introduccion_mysql;

import java.sql.*;

public class actualiza {

    public static void main(String[] args) {
         try {
            Connection con = conexiondb.obtieneConexion();
            Statement st = con.createStatement();
            
            // enviar sentencia SQL
            st.executeUpdate("UPDATE categoria SET nombre='frutas' WHERE codigo=2");
            System.out.println("actualizo OK");
            
        } catch (Exception e) {
            System.out.println("revisar error"+e);
        }
    }
    
}
