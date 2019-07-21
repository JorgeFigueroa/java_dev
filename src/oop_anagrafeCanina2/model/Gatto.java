package oop_anagrafeCanina2.model;

import oop_anagrafeCanina2.interfaces.Animale;


public class Gatto implements Animale {
    private static int counter=0;

    private String nome;
    private int idGatto;
    private int eta;
    private char sesso;
    
    public Gatto(int id, String nome, int eta,
			char sesso) {
    	// Richiamare l'altro costruttore incrementerebbe
    	// il campo statico 'counter'...
    	//this(nome, eta, sesso);
    	this.idGatto = id;
    	this.nome = nome;
    	this.eta = eta;
    	this.sesso = sesso;
    }

    public Gatto(String nome, int eta,
			char sesso ){
    	this.nome=nome;
    	this.eta=eta;
    	this.sesso=sesso;
        this.idGatto=counter++;
    }

    // GETTER nome
    public String getNome(){
        return nome;
    }
    // SETTER nome
    public void setNome(String nome){
        this.nome=nome;
    }

    // GETTER eta
    public int getEta(){
        return eta;
    }
    // SETTER eta
    public void setEta(int eta){
        this.eta=eta;
    }

    // GETTER sesso
    public char getSesso(){
        return sesso;
    }
    // SETTER sesso
    public void setSesso(char sesso){
        this.sesso=sesso;
    }

   // GETTER idGatto
    public int getIdAnimale(){
        return idGatto;
    }
    
    // SETTER idGatto
    public void setIdAnimale(int idGatto){
        this.idGatto=idGatto;
    }


}
