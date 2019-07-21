package oop_carte;//package
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**Aggiungi qui una descrizione della classe Gioco */
public class Gioco extends CenteredFrame
{

    //variabilidi instanza
    private int contatore=0;
    private Giocatore[] giocatori;
    private PanGiocatore[] pannelliGiocatore;
    private JPanel panContenuti;
    private JButton bMano;
    private boolean gameOver=false;
    private JTable table;
    private GiocoModel modello;

    /**Costruttore del gioco */
    public Gioco(){

        // creo un array di giocatori
        giocatori = new Giocatore[]{
            new Giocatore("Marco"),
            new Giocatore("Elisa"),
            new Giocatore("Anna"),
            new Giocatore("Jorge"),
            new Giocatore("Sonia")
        };

        setTitle("Rubamazzetto");

        // crea la UI
        add(creaPanGiocatori(),BorderLayout.PAGE_START); 

        modello = new GiocoModel(giocatori);
        table = new JTable();
        CartaRenderer renderer = new CartaRenderer(modello.getMani());

        table.setModel(modello);
        JScrollPane scroller = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        add(scroller);

        add(creaPanComandi(),BorderLayout.PAGE_END);

        // resetta il gioco
        reset();

        setPreferredSize(new Dimension(600,600));

        pack();
        setVisible(true);
    }

    /**Resetta il gioco*/
    private void reset()
    {
        //crea un nuovo panello contenuti e lo aggiunge al centro
        creaPanContenuti();

        bMano.setText("Nuova mano");

        // svuota graficamente il pannello delle mani
        // dalle righe delle mani
        panContenuti.removeAll();

        // creo e mischio un mazzo   
        Mazzo m = new Mazzo();
        m.mischia();

        // decido quante carte dare a ogni giocatore
        int numCarte=m.size();
        int numGiocatori=giocatori.length;
        double numTeorico=(double)numCarte/(double)numGiocatori;
        int numEffettivo=(int)numTeorico;

        // distribuisco le carte
        for(Giocatore g : giocatori){
            g.svuotaCarte();
            g.pesca(m, numEffettivo);
        }

        // aggiorno i pannelli giocatore
        for(PanGiocatore p : pannelliGiocatore){
            p.refresh();
        }

        //svuota i dati della partita
        modello.getMani().clear();
        modello.fireTableDataChanged();
        // modello.fire

        revalidate();

    }


	/**Esegue il gioco  */
    public void gioca(){
        while(mano()){
            try{
                System.in.read();
            }catch(Exception e){}
        }

        // schema riassuntivo di fine gioco
        System.out.println("");
        for(Giocatore g : giocatori){
            System.out.println(g);
        }
        System.out.println("Fine gioco.");

    }

    /**
     * Gioca una mano.
     * @return true se sono rimaste carte,
     * false se un giocatore ha finito le carte
     */
    private boolean mano(){
        contatore++;
        System.out.println("\nMano n. "+contatore);

        // ogni giocatore gioca la sua carta
        ArrayList<CartaGiocata> giocate = new  ArrayList<CartaGiocata>();
        for(Giocatore g : giocatori){
            Carta c = g.gioca();
            CartaGiocata giocata=new CartaGiocata(c, g);
            giocate.add(giocata);
        }

        // decido chi ha vinto la mano
        ArrayList<CartaGiocata> giocate2 = (ArrayList<CartaGiocata>)giocate.clone();
        Collections.sort(giocate2);
        CartaGiocata gVincitore = giocate2.get(0);
        Giocatore vincitore=gVincitore.getGiocatore();

        // recupero tutte le carte che sono sul tavolo
        // al mazzetto del vincitore
        ArrayList<Carta> tavolo = new ArrayList<Carta>();
        for( CartaGiocata gc : giocate){
            Carta c = gc.getCarta();
            tavolo.add(c);
        }

        // stampo le giocate con la situazione aggiornata

        for(CartaGiocata gc : giocate){
            System.out.println(gc);
        }
        
        System.out.println("Vincitore: "+gVincitore);

        //creo le mano con le giocate
        Mano mano = new Mano();
        for(CartaGiocata gc : giocate){
            mano.add(gc);
        }

        // aggiungo la mano al contenitore delle mani
        Mani mani = modello.getMani();
        mani.add(mano);
        modello.fireTableDataChanged();

        // controllo se almeno uno dei giocatori ha finito le carte,
        // in tal caso ritorno false.
        boolean ritorno = true;
        for(Giocatore giocatore : giocatori){
            if(giocatore.getNumCarte()==0){
                ritorno = false;
            }
        }
        return ritorno;
    }

    /** Crea il pannello che visualizza una mano */
    private JPanel creaPanMano(ArrayList<CartaGiocata> giocate, CartaGiocata gVincitore){
        JPanel pan = new JPanel();
        pan.setBackground(new Color(56,91,32));
        pan.setPreferredSize(new Dimension(500,40));
        pan.setMaximumSize(new Dimension(500,40));

        for (CartaGiocata g : giocate){
            Carta c = g.getCarta();
            if(g == gVincitore){
                c.setBackground(Color.RED);
            }
            pan.add(c);
        }
        return pan;
    }

    /**Crea il pannello centrale dei contenuti */
    private JPanel creaPanGiocatori(){
        JPanel pan = new JPanel();
        pan.setBackground(new Color(88,13,98));

        pannelliGiocatore = new PanGiocatore[giocatori.length];

        int i=0;
        for(Giocatore g : giocatori){
            PanGiocatore p = new PanGiocatore(g);
            pannelliGiocatore[i]=p;
            i++;
            pan.add(p);
        }

        return pan;
    }

         /** Crea il pannello centrale dei contenuti*/
         private void creaPanContenuti(){
             this.panContenuti = new JPanel();
             BoxLayout layout = new BoxLayout(panContenuti, BoxLayout.Y_AXIS);
             panContenuti.setLayout(layout);
             panContenuti.setBackground(Color.YELLOW);
         }

    /**
     * Crea il pannello dei comandi
     */
    private JPanel creaPanComandi(){
        JPanel pan = new JPanel();
        pan.setBackground(Color.BLUE);

        JButton bEsci=new JButton("Esci");
        bEsci.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){

                    int risposta=JOptionPane.showConfirmDialog(Gioco.this, 
                            "Sei sicuro? ", " Uscita ", JOptionPane.YES_NO_OPTION);
                    if(risposta==JOptionPane.YES_OPTION){
                        System.exit(0);
                    }

                }
            });
        pan.add(bEsci);

        bMano=new JButton("Nuova mano");
        bMano.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(!gameOver){
                        boolean riuscito = mano();
                        if(!riuscito){
                            gameOver=true;
                            finegioco();
                        }
                    }else{
                        gameOver=false;
                        reset();
                    }

                }
            });

        pan.add(bMano);

        return pan;
    }

    private void finegioco(){
        bMano.setText("Nuova partita");
        Giocatore[]vincitori =  getVincitiore();
        String s = "";
        if(vincitori.length==1){
            Giocatore g = vincitori[0];
            String nome= g.getNome();
            int carte = g.getNumCarte();
            s+= " ha vinto "+nome+ " con " + carte+" carte ";

        }else{
            s+= "hanno vinto ";
            int carte = 0;
            int i= 0;
            for(Giocatore g : vincitori){

                String nome = g.getNome();
                carte = g.getNumCarte();
                if(i<0){
                    s+= ", ";
                }
                s+= nome;
                i++;
            }
            s += " con " +carte+ " carte ";
        }

        JOptionPane.showMessageDialog(this, "fine partita.\n "+ s);
    }

    /**ritorna un array del vinicitore */
    private Giocatore[] getVincitiore(){
        ArrayList<Giocatore> lista = new ArrayList <Giocatore>();
        for(Giocatore g : giocatori){
            lista.add(g);
        }

        Collections.sort(lista);
        Giocatore winner = lista.get(0);
        int max = winner.getNumCarte();

        ArrayList<Giocatore> vincitore = new ArrayList <Giocatore>();
        for(Giocatore g : lista){
            if(g.getNumCarte() == max){
                vincitore.add(g);
            }

        }
        Giocatore[] out = vincitore.toArray(new Giocatore[0]);
        return out;

    }
}

