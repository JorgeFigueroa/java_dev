public class Impiegato
{
    //  atributi
    String nome;
    int stipendio;


    //  costruttore
    public Impiegato(String nome, int stipendio)
    {
        this.nome = nome;
        this.stipendio = stipendio;
    }


    //  metodi
    public String getNome()
    {
        return nome;
    }


    public int getStipendio()
    {
        return stipendio;
    }

    public int aumentaStipendio(int y)
    {
        return stipendio += y;
    }

}
