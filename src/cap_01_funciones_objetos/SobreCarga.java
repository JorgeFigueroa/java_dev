package cap_01_funciones_objetos;

public class SobreCarga {
    public static void main(String[] args) {
        Cargado objeto = new Cargado(1,3);
    }
}



 class Cargado {
	   
    public Cargado(int h){
        System.out.println("La hora es " + h);
    }
    public Cargado(int h, int m){
        System.out.println("La hora es " + h + "El minuto es " + m);
    }
    public Cargado(int h, int m, int s){
        System.out.println("La hora es " + h + "El minuto es " + m + " Y el segundo es " + s);
    }
    
}

