package cap_01_funciones_objetos;

public class Estatico {

    public static void main(String[] args) {
        
        club miembro1 = new club("Juan","Lopez");
        club miembro2 = new club("Jaime","Gimenez");
        club miembro3 = new club("Javier","Garcia");
        
        System.out.println();
        System.out.println("El nombre del socio es " + miembro2.getNombre());
        System.out.println("El apellido del socio es "+ miembro2.getApellido());
        System.out.println("El numero total de socios es " + miembro2.getMiembros());
        
    }
}




class club {
    private String nombre;
    private String apellido;
    private static int contador = 0;
    
    
   public club(String nom, String ape){
       nombre = nom;
       apellido = ape;
       contador++;
       System.out.printf("Constructor para %s %s, hay %d\n", nombre, apellido, contador);
   }
  public String getNombre(){
      return nombre;
  }
  public String getApellido(){
      return apellido;
  }
  public static int getMiembros(){
      return contador;
    }
  
}
