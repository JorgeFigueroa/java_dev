package C08_pjVariablesClase.pClases;

public class Planilla {
    //Atributos
    private int horas,cargo,modalidad;
    
    //Variable de clase
    private static int total=0;
    private static int tGerente=0;
    private static int tAdministrativo=0;
    private static int tJefe=0;
    private static int tOperario=0;
    
    private static int cMenos1200=0;
    private static int cEntre1200y2500=0;
    private static int cMas2500=0;
    
    public Planilla(int horas,int cargo,int modalidad){
        this.horas=horas;
        this.cargo=cargo;
        this.modalidad=modalidad;
        total++;
        
        contadorCargos();
        contadorSueldo();
    }
    
    public double asignaPagoxHora(){
        switch(cargo){
            case 0: return 20;
            case 1: return 10;
            case 2: return 8;
            default: return 3.5;
        }
    }
    
    public double calculaBruto(){
        return this.horas*asignaPagoxHora();
    }
    
    public double asignaBonificacion(double bruto){
        switch(modalidad){
            case 0: return 0.2*bruto;
            default: return 0.05*bruto;
        }
    }
    
    public double calculaSueldo(){
        return calculaBruto()+asignaBonificacion(calculaBruto());
    }
    
    private void contadorCargos(){
        switch(cargo){
            case 0: tGerente++; break;
            case 1: tAdministrativo++; break;
            case 2: tJefe++; break;
            default: tOperario++;
        }
    }
    
    private void contadorSueldo(){
        if (calculaSueldo()<1200)
            cMenos1200++;
        else if (calculaSueldo()<=2500)
            cEntre1200y2500++;
        else 
            cMas2500++;
    }
    
    public int getTotal(){ 
        return total;
    }
    public int getTotalGerentes(){ 
        return tGerente;
    }
    public int getTotalAdministrativo(){ 
        return tAdministrativo;
    }
    public int getTotalJefes(){ 
        return tJefe;
    }
    public int getTotalOperario(){ 
        return tOperario;
    }
    public int getTotalmenor1200(){ 
        return cMenos1200;
    }
    public int getTotalEntre1200y2500(){ 
        return cEntre1200y2500;
    }
    public int getTotalmas2500(){ 
        return cMas2500;
    }

    
}
