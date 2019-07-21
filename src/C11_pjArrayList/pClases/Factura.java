package C11_pjArrayList.pClases;

public class Factura {
    private int nFactura;
    private String fecha;
    private String vendedor;
    private double monto;
    
    //Metodo constructor
    public Factura(int nFactura,String fecha,String vendedor,double monto){
        this.nFactura=nFactura;
        this.fecha=fecha;
        this.vendedor=vendedor;
        this.monto=monto;
    }

    //Metodos set
    public void setNfactura(int nFactura){
        this.nFactura=nFactura;
    }
    public void setFecha(String fecha){
        this.fecha=fecha;
    }
    public void setVendedor(String vendedor){
        this.vendedor=vendedor;
    }
    public void setMonto(double monto){
        this.monto=monto;
    }
   
    //Metodos get
    public int getNfactura(){
        return nFactura;
    }
    public String getfecha(){
        return fecha;
    }
    public String getVendedor(){
        return vendedor;
    }
    public double getMonto(){
        return monto;
    }
}