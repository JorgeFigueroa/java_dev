package cap_01_funciones_objetos;

public class ACadena {
	
    public static void main(String[] args) {
        Encadenar obj = new Encadenar(2,4,6);
    }
    
}



class Encadenar {

    private int mes;
    private int dia;
    private int anio;

    public Encadenar(int m, int d, int a) {
        mes = m;
        dia = d;
        anio = a;
        System.out.printf("El constructor es: %s\n", this);
    }

    public String toString() {
        return String.format("%d/%d/%d", mes, dia, anio);
    }
}
