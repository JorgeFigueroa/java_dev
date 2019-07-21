package cap_01_funciones_objetos;

public class Herencia {
    public static void main(String[] args) {
        
        recibe digoHola = new recibe();
        digoHola.yodigohola();
        digoHola.yodigoadios();
        
    }
}



class recibe extends da{
    public void yodigohola(){
        System.out.println("Yo digo Hola tambien");
    }
}







class da {
    public void yodigohola(){
        System.out.println("Yo digo Hola");
    }
    public void yodigoadios(){
    System.out.println("Yo digo Adios");
    }
    
}

