package oop_demo.auto;
/**
 * Classe test di oggeti di automovile
 */
public class TestAuto
{
    /**
     * crea 3 automobile
     * acelera ogni automobile di un valore diverso
     * carica in ogni automobile alcuni passeggeri
     * Recupera le infomazione delle automobile e le stampa
     */
    static void test(){
        //creo gli oggeti auto
        AutoFuoristrada auto1 = new AutoFuoristrada();
        AutoElettrica auto2 = new AutoElettrica();
        AutoRoadster auto3 = new AutoRoadster();

        //creo benzinaio
        Benzinaio b1 = new Benzinaio (200, 1.2);
        Benzinaio b2 = new Benzinaio (600, 1.35);

        //le acelero
        auto1.accelera(10);
        auto2.accelera(20);
        auto3.accelera(30);

        //faccio benzina
        auto1.faiBenzina(b1, 50);
        auto2.faiBenzina(b2, 20);
        auto3.faiBenzina(b2, 20);

        //le carico
        auto2.ricarica(50);

        //carico i pasageri
        auto1.caricaPassegeri(1);
        auto2.caricaPassegeri(2);
        auto3.caricaPassegeri(3);

        //   recupero le info
        String a1 = auto1.getInfo();
        String a2 = auto2.getInfo();
        String a3 = auto3.getInfo();

        //stampo info delle auto
        System.out.println("info auto 1: "+a1);
        System.out.println("info auto 2: "+a2);
        System.out.println("info auto 3: "+a3);

        //stampa info benzinaio
        b1.stampaStato();
        b2.stampaStato();

    }

    /**Questo metodo cambia il contatore della classe*/
    static void setContatatiore (int c) {
        Automobile.contatore=c;
    }

    static void testGuidabile () {
        Automobile a = new AutoElettrica();
        a.caricaPassegeri(5);

        Guidabile g =new AutoElettrica();
        g.parti();
    }
}



