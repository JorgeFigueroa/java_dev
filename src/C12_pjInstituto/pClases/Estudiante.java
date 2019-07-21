package C12_pjInstituto.pClases;

public class Estudiante {
    private int codigo,ciclo;
    private String nombre;
    private double pension;

    public Estudiante(int codigo,String nombre,int ciclo,double pension){
        this.codigo=codigo;
        this.nombre=nombre;
        this.ciclo=ciclo;
        this.pension=pension;
    }

    public int getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public int getCiclo(){
        return ciclo;
    }
    public double getPension(){
        return pension;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setCiclo(int ciclo){
        this.ciclo=ciclo;
    }
    public void setPension(double pension){
        this.pension=pension;
    }
}
