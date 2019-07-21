package oop_demo.contocorrente;

import java.util.Date;

public class TestConto extends Movimento
{
    public TestConto(String tipo, Date data, String descrizione, double importo) {
		super(tipo, data, descrizione, importo);
		// TODO Auto-generated constructor stub
	}

	public static void TestConto(){
        
        ContoCorrente conto1=new ContoCorrente();
        conto1.versa(1000);
        conto1.preleva(500);
        conto1.preleva(400);
        conto1.stampaMovimenti();
        conto1.stampaSaldo();

        System.out.println("\n\n");
        ContoCorrente conto2=new ContoCorrente(1000);
        conto2.applicaInteresse(10);
        conto2.stampaMovimenti();
        conto2.stampaSaldo();

    }
}
