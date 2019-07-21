package mysql_sistema.cap_04_introduccion_mysql;

// 1. importar las clases

import java.sql.*;

public class consulta {
    public static void main(String[] args) {
        // 2. Controladro de errores
        
        try {
            // a. llamar al objeto conexion
            Connection cone = conexiondb.obtieneConexion();
            
            //b. Crear el objeto statement
            Statement st = cone.createStatement();
            //c. crear la consulta SQL
            //d. Almancenar en el Resulset(array)
            ResultSet rs = st.executeQuery("SELECT * FROM categoria");
            
            // e. recorrer por cada fila
            while (rs.next()){
            System.out.println(rs.getInt("codigo")+ " "+rs.getString("nombre")+"\n");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
