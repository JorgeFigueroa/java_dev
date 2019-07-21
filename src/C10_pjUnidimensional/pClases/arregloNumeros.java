package C10_pjUnidimensional.pClases;

public class arregloNumeros {
    //Atributos
    private int a[];

    //metodo constructor
    public arregloNumeros(){
        a=new int[6];
        a[0]=10;
        a[1]=20;
        a[2]=70;
        a[3]=30;
        a[4]=80;
        a[5]=15;
    }
    public int tamaño(){ return a.length; }

    public void ordenaAscendente(){
        int temp;
        for(int i=0;i<tamaño();i++)
            for(int j=0;j<tamaño();j++)
                if (a[i]<a[j]){
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
    }

    public int determinaMayor(){
        int mayor=Integer.MIN_VALUE;
       for(int i=0;i<tamaño();i++){
           if(a[i]>mayor)
               mayor=a[i];
       }
        return mayor;
    }
    public double calculaPromedio(int suma){
        return (suma*1.0/tamaño());
    }

    public int calculaSuma(){
        int s=0;
        for(int i=0;i<tamaño();i++){
            s+=a[i];
        }
        return s;
    }
    //Devuelve el elemento del arreglo segun la posicion
    public int devuelveValor(int pos){
        return a[pos];
    }
}
