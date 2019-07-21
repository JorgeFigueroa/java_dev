package C11_pjArrayList.pClases;
import java.util.ArrayList;

public class ArregloFacturas {
    private ArrayList <Factura> fact;
    private int indice;

    //Metodo constructor
    public ArregloFacturas(){
        fact=new ArrayList<Factura>();
    }

    //Metodo que devuelve el tamaño actual del vector
    public int getTamaño(){
        return fact.size();
    }

    //Metodo que permite agregar una factura al vector
    public void agregar(Factura F){
        fact.add(F);
    }

    //Metodo que devuelve el objeto factura
    public Factura obtener(int pos){
        return fact.get(pos);
    }

    //Metodo que busca una factura
    public Factura buscar(int num){
        for (Factura f: fact)
            if (f.getNfactura()==num)
                return f;
        return null;
    }

    //Metodo que elimina una factura
    public void eliminar(Factura x){
        fact.remove(x);
    }
}