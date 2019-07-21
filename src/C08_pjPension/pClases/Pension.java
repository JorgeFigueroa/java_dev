package C08_pjPension.pClases;
public class Pension {
    //Atributos
    public int categoria;
    public double promedio;
    
    //Metodos
    public double determinaPension(){
        switch(categoria){
            case 0: return 550;
            case 1: return 500;
            case 2: return 460;
            default: return 400;
        }
    }

    public double calculaDescuento(){
        if(promedio<=13.99)
            return 0;
        else if(promedio<=15.99)
            return 0.1*determinaPension();
        else if(promedio<=17.99)
            return 0.12*determinaPension();
        else
            return 0.15*determinaPension();
    }

    public double determinaNuevaPension(){
        return determinaPension()-calculaDescuento();
    }

}