package cap_02_Matrices;

public class Ordenar_Array {

    public static void main(String[] args) {

        int[] arreglo = {5, 3, 4, 2, 27, 73, 89, 373, 474};

        OrdenadorBurbuja(arreglo);

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }

    }


    public static int OrdenadorBurbuja(int[] array) {
        int aux=0;
        boolean cambios = false;

        while (true) {
            cambios = false;
            for (int i = 1; i < array.length; i++) {

                if (array[i] < array[i - 1]) {
                    aux = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = aux;
                    cambios = true;
                }
            }
            if (cambios == false) {
                break;
            }
        }
        return aux;
    }

}


// menu > Source > Format  ⌘ + ⇧ + F