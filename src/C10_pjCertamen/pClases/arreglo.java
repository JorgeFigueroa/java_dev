package C10_pjCertamen.pClases;

public class arreglo {
    
    //Atributos de clase
    private String nombre[];
    private double promedio[];
    private int pos=0;
    private int posicion;

    //constructor
    public arreglo(){
        nombre=new String[100];
        promedio=new double[100];
        pos=0;
    }

    public void registraCandidata(String nombre,double promedio){
        this.nombre[pos]=nombre;
        this.promedio[pos]=promedio;
        pos++;
    }

    public String devuelveNombre(int pos){
        return nombre[pos];
    }
    public double devuelvePromedio(int pos){
        return promedio[pos];
    }

    public int totalCandidatas(){
        return pos;
    }

    public double puntajeAlto(){
        double mayor=Double.MIN_VALUE;
        for(int i=0;i<totalCandidatas();i++){
            if (promedio[i]>mayor){
                mayor=promedio[i];
                posicion=i;
            }
        }
        return mayor;
    }

    public String ganadora(){
        return nombre[posicion];
    }

}
