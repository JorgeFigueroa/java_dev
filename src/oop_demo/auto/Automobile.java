package oop_demo.auto;
/**classe automobile
 */
public abstract class Automobile implements Guidabile
{
    int velocita; //la velocita corrente
    int marcia;   //la marcia inserita(-1 se retromarcia)
    int passeggeri;//il numero de passeggeri a bordo
    int carburante;//la quantita di carburante in litri
    int id;
    static int contatore;

    /**incrementa il contatore nella nella variabile statica contatore  e lo asegna nella variabile stanza id*/
    Automobile(){
        contatore ++;
        id = contatore; 
    }

    /**Metodo acelera*/
    public void accelera(int quanto){
        velocita = velocita + quanto;
        if(velocita>150){ //controlla il limite di velocita non supera 150 km/h 
            velocita= 150;
        }
    }

    /**Metodo rallenta*/
    public void rallenta(int quanto){
        velocita = velocita - quanto;
        if(velocita<0){ //controlla il limite di velocita non scende mai sotto zero
            velocita= 0;
        }
    }

    /**
     * cambi la marcia corrente.
     * @param nuevamarcia la marcia da intestare
     * -1 retro, 0 folle, max 5
     */
    void cambiaMarcia(int nuovamarcia){
        if(nuovamarcia == -1 && velocita != 0){
            return;
        }

        if((nuovamarcia >= -1) & (nuovamarcia<=5)){
            marcia = nuovamarcia;
        }
    }

    void caricaPassegeri(int quanti){
        passeggeri+=quanti;
        if(passeggeri > 7){
            passeggeri=7;
        }
    }

    /**
     * riempie il serbatoio con un dato numero di litri dal benzinaio specificato
     */
    void faiBenzina(Benzinaio b ,int litri){
        b.rifornisci(litri);
        carburante+=litri;

        if(carburante > 60){
            carburante = 60;
        }
    }

    public String getInfo(){
        String info = 
            "id= "+ id+
            ", velocita= "+velocita+
            ", marcia= "+marcia+
            ", passeggeri= "+passeggeri+
            ", carburante= "+carburante;
        return info;
    }

    /**
     * @return il contaore di classe
     */
    private static int getContatore(){
        return contatore;
    }

    /**
     * vai in un dato luogo
     * @param luogo - il luogo dove andare
     */
    public void vai (Luogo luogo){
        System.out.println("sono arrivato a "+ luogo);
    }

    public void parti(){
        System.out.print("rummmm");
    }
}
