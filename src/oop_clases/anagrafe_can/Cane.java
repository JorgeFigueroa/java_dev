package oop_clases.anagrafe_can;

public class Cane
{

    // atributi
    private int id;
    private String nome;
    private int eta;
    private char sesso;

    // costruttore
    public Cane(int id, String nome, int eta, char sesso) {
		super();
		this.id = id;
		this.nome = nome;
		this.eta = eta;
		this.sesso = sesso;
	}
    
    // metodi get e set
    public int getid()
    {
        return id;
    }



	public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getEta()
    {
        return eta;
    }

    public void setEta(int eta)
    {
        this.eta = eta;
    }

    public char getSesso()
    {
        return sesso;
    }

    public void setSesso(char sesso)
    {
        this.sesso = sesso;
    }

}
