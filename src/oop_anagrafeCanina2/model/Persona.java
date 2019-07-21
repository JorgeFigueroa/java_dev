package oop_anagrafeCanina2.model;


public class Persona{

    private String nome;
    private String cognome;
    private String codFisc;
    
    public Persona(String nome, String cognome,
			String codFisc ){
    	this.nome=nome;
    	this.cognome=cognome;
    	this.codFisc=codFisc;
    }

    // GETTER nome
    public String getNome(){
        return nome;
    }
    // SETTER nome
    public void setNome(String nome){
        this.nome=nome;
    }

    // GETTER cognome
    public String getCognome(){
        return cognome;
    }
    // SETTER cognome
    public void setCognome(String cognome){
        this.cognome=cognome;
    }

    // GETTER cod fisc
    public String getCodFisc(){
        return codFisc;
    }
    // SETTER cod fisc
    public void setCodFisc(String codFisc){
        this.codFisc=codFisc;
    }
    
    public boolean equals(Object object) {
    	if(!( object instanceof Persona)) {
    		return false;
    	}
    	
    	Persona p = (Persona) object;
    	
    	if( this.getCodFisc().equals(p.getCodFisc())) {
    		return true;
    	}
    	
    	return false;
    }

}
