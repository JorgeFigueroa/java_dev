package C12_pjInstituto.pClases;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class ArregloEstudiantes {
    private ArrayList <Estudiante> aEst;
    
public ArregloEstudiantes(){
    aEst=new ArrayList<Estudiante>();
    cargar();
}

public void adicionar(Estudiante e){
    aEst.add(e);
}

public Estudiante obtener(int pos){
    return aEst.get(pos);
}

public Estudiante buscar(int cod){
    for(int i=0;i<aEst.size();i++){
        if (cod==aEst.get(i).getCodigo())
            return aEst.get(i);
    }
    return null;
}


public int getTamaño(){
    return aEst.size();
}

public void eliminar(Estudiante e){
    aEst.remove(e);
}

public void cargar(){
    try{
    File archivo = new File("Estudiantes.txt");
    if (archivo.exists()){
    BufferedReader br=new BufferedReader(new FileReader("Estudiantes.txt"));
    
    String linea;
    
    while((linea=br.readLine())!=null){
         StringTokenizer st=new StringTokenizer(linea,",");
                    
         int cod=Integer.parseInt(st.nextToken().trim());
         String nom=st.nextToken().trim();
         int cic=Integer.parseInt(st.nextToken().trim());
         double pen=Double.parseDouble(st.nextToken().trim());
         Estudiante x=new Estudiante(cod,nom,cic,pen);
         adicionar(x);
   }
         br.close();
   } else
     JOptionPane.showMessageDialog(null, "El archivo de texto no existe");
    } catch(Exception x){
            JOptionPane.showMessageDialog(null, "Se produjo un Error "+x);
      }
}

public void grabar(){
   try{
      PrintWriter pw=new PrintWriter(new FileWriter("Estudiantes.txt"));
      for(int i=0;i<getTamaño();i++){
          pw.println(obtener(i).getCodigo()+","+
          obtener(i).getNombre()+","+
          obtener(i).getCiclo()+","+
          obtener(i).getPension());
      }
      pw.close();
      JOptionPane.showMessageDialog(null,"Operacion Exitosa");
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Grabacion Exitosa",
                                         "Aviso",
                                         JOptionPane.ERROR_MESSAGE);
       }
    }
}
