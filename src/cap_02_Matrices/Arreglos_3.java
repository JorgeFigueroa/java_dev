package cap_02_Matrices;

public class Arreglos_3 {
/*4. Crear 2 arreglos numericos enteros de 10 . 
    el primer arreglo se llenara con numeros aleatorios 
    y el segundo arreglo con los numeros del primer arreglo elevado al cuadrado.
    */
    public static void main(String[] args) {
       
        int arr1[] =new int[5];
        int arr2[] =new int[5];
        
        arregloRamdom(arr1);
        arregloElevadoQuadrado(arr1, arr2);        
    }
    
    public static int[] arregloRamdom(int[] arr1) {
        for(int i=0; i<arr1.length; i++){
            arr1[i]= (int)(Math.random()*10+0);
            System.out.println(arr1[i] );
         }
        return arr1;
    }
    
    public static int[] arregloElevadoQuadrado(int[] arr1, int[]arr2) {
        System.out.println("---------------------");
       for(int i=0; i<arr2.length; i++){
          arr2[i]=  (int) Math.pow(arr1[i], 2);
          System.out.println(arr2[i] );
       }
       return arr2;
    }
    
}
