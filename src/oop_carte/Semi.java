package oop_carte;

/**Semi delle carte da gioco */
public enum Semi
{
        
    CUORI("\u2665",Colori.RED), 
    QUADRI("\u2666",Colori.RED), 
    FIORI("\u2663",Colori.NERO),
    PICCHE("\u2660",Colori.NERO);

    private String nome;
    private Colori colore;
    
    private Semi(String nome, Colori colore){
        this.nome=nome;
        this.colore=colore;
    }
    
    public String toString(){
        return nome;
    }
}
