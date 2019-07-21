package C08_pjPensionConstructor.pClases;
public class Pension {
    //Atributos
    private int categoria;
    private double promedio;

    //Metodo Constructor
    public Pension(int categoria,double promedio){
        this.categoria=categoria;
        this.promedio=promedio;
    }

    //Metodos
    public double determinaPension(){
        switch(getCategoria()){
            case 0: return 550;
            case 1: return 500;
            case 2: return 460;
            default: return 400;
        }
    }

    public double calculaDescuento(){
        if(getPromedio()<=13.99)
            return 0;
        else if(getPromedio()<=15.99)
            return 0.1*determinaPension();
        else if(getPromedio()<=17.99)
            return 0.12*determinaPension();
        else
            return 0.15*determinaPension();
    }

    public double determinaNuevaPension(){
        return determinaPension()-calculaDescuento();
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
