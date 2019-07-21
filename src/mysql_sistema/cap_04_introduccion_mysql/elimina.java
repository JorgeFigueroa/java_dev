package mysql_sistema.cap_04_introduccion_mysql;


import java.sql.*;
public class elimina {

    public static void main(String[] args) {
        try {
            Connection con = conexiondb.obtieneConexion();
            Statement st = con.createStatement();
            
            st.executeUpdate("DELETE FROM categoria WHERE codigo=2");
            System.out.println("elimino ok");
 
        } catch (Exception e) {
            System.out.println("revisar" + e);
        }
    }
    
}
