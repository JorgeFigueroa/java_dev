
package cap_02_clases;
import java.io.*;
import java.util.*;


public class Archivos {

    
    public static void main(String[] args) {
        File archivo = new File("C://pruebas//archivo.txt");
        final Formatter nuevoarchivo;
        Scanner x;
        
        
        if(archivo.exists()){
            if(archivo.canWrite()){
                System.out.println("El archivo existe y puedo escribir");
                x = new Scanner("archivo.txt");
                while(x.hasNext()){
                    String a = x.next();
                    
                    
                    System.out.printf("%s",a);
                }
                x.close();
            }else{
                System.out.println("El archivo existe pero no puedo escribir");
            }
        }else{
            try{
                nuevoarchivo = new Formatter("C://pruebas//archivo.txt");
                System.out.println("El archivo ha sido creado con exito");
                nuevoarchivo.format("%s%s%s","Jose Vicente","Carratala","33");
                nuevoarchivo.close();
            }
            catch(Exception e){
                System.out.println("Error: " + e);
            }
        }
    }
}
