package mysql_sistema.cap_03_jdbc;
import java.sql.*;

public class Jdbc {

    
    public static void main(String[] args) {
        
        try{
        System.out.println("Intento conectarme a la base de datos...");
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/agendatelefonica","root","yategane");
        System.out.println("La conexion se ha realizado con exito");
        
        //Devolver la agenda telefonica
        Statement estado = con.createStatement();
        ResultSet resultado = estado.executeQuery("SELECT * FROM agenda ORDER BY id ASC");
        
        System.out.println("ID \t Nombre \t Telefono");
        while(resultado.next()){
            System.out.println(resultado.getString("id")+"\t"+resultado.getString("nombre")+"\t\t"+resultado.getString("telefono"));
        }
        
        }
        catch(SQLException ex){
            System.out.println("Error de mysql");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
            
        }
        catch(Exception e){
            System.out.println("Se ha encontrado un error que es: "+e.getMessage());
        }
    }
}
