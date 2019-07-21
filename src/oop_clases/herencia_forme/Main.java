package oop_clases.herencia_forme;

/**
 * Aggiungi qui una descrizione della classe TestForme

 */
public class Main
{

	 public static void main(String arg[]) {
		 
	        Hereda_Forma2D eli1 = new Ellisse(10,20);
	        Hereda_Forma2D rett1 = new Rettangolo(1,2);
	        Hereda_Forma2D rett2 = new Rettangolo(1,2);
	        Hereda_Forma2D rett3 = new Rettangolo(1,2);
	        Hereda_Forma2D rett4 = new Rettangolo(1,2);
	        Hereda_Forma2D rett5 = new Rettangolo(1,2);
	        Hereda_Forma2D rett6 = new Rettangolo(1,2);

	        Hereda_Forma2D[] forme = {eli1, rett1,rett2,rett3,rett4,rett5,rett6};

	        for(Hereda_Forma2D forma: forme ){
	            forma.disegna();
	            System.out.println(forma.calcArea());
	            forma.calcArea();
	            if(forma instanceof Cerchio){
	                //downcasting
	                Cerchio c = (Cerchio)forma;
	                System.out.println("raggio del cerchio; " +c.getRaggio());
	            }
	            if(forma instanceof Trapezio){
	                //downcasting
	                Trapezio t = (Trapezio)forma;
	                System.out.println("base del trazpezio: " +t.getBaseMaggiore());
	            }
	        }
		 
	 }
 
}
