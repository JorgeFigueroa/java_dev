package mysql_sistema.cap_04_introduccion_mysql;


import java.sql.*;

public class insertardatos {

    public static void main(String[] args) {

        try {
            Connection con = conexiondb.obtieneConexion();
            Statement st = con.createStatement();

            // enviar sentencia SQL       
            st.executeUpdate("insert into categoria values (4, 'verduras', 'cccccc')");
            System.out.println("guardo OK");


        } catch (Exception e) {
            System.out.println("revisar error" + e);
        }
    }

}
