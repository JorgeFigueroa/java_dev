package oop_anagrafeCanina2.model;

import oop_anagrafeCanina2.interfaces.Animale;


public class Cane implements Animale {
    private static int counter=0;

    private String nome;
    private int idCane;
    private int eta;
    private char sesso;
    private boolean pedigree;
    
    public boolean getPedigree() {
    	return pedigree;
    }
    
    public void setPedigree(boolean pedigree) {
    	this.pedigree = pedigree;
    }

    public Cane(String nome, int eta,
			char sesso ){
    	this.nome=nome;
    	this.eta=eta;
    	this.sesso=sesso;
        this.idCane=counter++;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public int getEta(){
        return eta;
    }
    public void setEta(int eta){
        this.eta=eta;
    }

    public char getSesso(){
        return sesso;
    }
    public void setSesso(char sesso){
        this.sesso=sesso;
    }

    public int getIdAnimale(){
        return idCane;
    }
    public void setIdAnimale(int idCane){
        this.idCane=idCane;
    }


}
