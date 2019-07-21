package oop_anagrafeCanina2;

import oop_anagrafeCanina2.model.Cane;
import oop_anagrafeCanina2.model.Persona;


public class MainAnagrafe{

   public static void main(String[] args){

      // creazione coppia 1
      Cane caneA = new Cane("Miky",12,'M');
      Persona personaA = new Persona("Mario","Rossi","MR721");
      CoppiaAnimalePadrone coppiaA = new CoppiaAnimalePadrone(caneA,personaA);

      // creazione coppia 2
     Cane caneB = new Cane("Bobby",23,'M');
     Persona personaB = new Persona("Pinco","Pallo","PPL");
     CoppiaAnimalePadrone coppiaB = new CoppiaAnimalePadrone(caneB,personaB);

      // creazione coppia 3
     Cane caneC = new Cane("Sally",10,'F');
     Persona personaC = new Persona("Fiorella","Vasco","FRLVSC");
     CoppiaAnimalePadrone coppiaC = new CoppiaAnimalePadrone(caneC,personaC);

      // creazione coppia 4
     Cane caneD = new Cane("Fuffi",5,'M');
     CoppiaAnimalePadrone coppiaD = new CoppiaAnimalePadrone(caneD,personaA);

       // creazione coppia 5
     Cane caneE = new Cane("Zora",1,'F');
     CoppiaAnimalePadrone coppiaE = new CoppiaAnimalePadrone(caneE,personaA);

     // creare array di coppie
     CoppiaAnimalePadrone[] lista = new CoppiaAnimalePadrone[5];

     // aggiungere le coppie create
     lista[0]=coppiaA;
     lista[1]=coppiaB;
     lista[2]=coppiaC;
     lista[3]=coppiaD;
     lista[4]=coppiaE;


     AnagrafeAnimali miaAnagrafe = new AnagrafeAnimali("Engimcani",lista);

    System.out.println("ANAGRAFE CANI: "+ miaAnagrafe.getNome());

    System.out.println("-- PROVA stampaNome --- ");
     miaAnagrafe.stampaNomeAnimalePadrone(0);
     miaAnagrafe.stampaNomeAnimalePadrone(5);
     miaAnagrafe.stampaNomeAnimalePadrone(-1);

    System.out.println("-- PROVA stampa tutti i nomi --- ");
     miaAnagrafe.stampaNomeAnimalePadrone();

    System.out.println("-- PROVA getNomePadroneDiCane --- ");
    String ret = miaAnagrafe.getNomePadroneDiCane(0);
    System.out.println("Nome Padrone Con cane con ID 0: "+ret);
    ret=miaAnagrafe.getNomePadroneDiCane(5);
    System.out.println("Nome Padrone Con cane con ID 5: "+ret);

    System.out.println("-- PROVA getNomiCaniConPadrone --- ");
    String [] nomiCani = miaAnagrafe.getNomiCaniConPadrone("Mario");

    System.out.println("Cani di Mario:");

    for(int i=0;i<nomiCani.length;i++)
        System.out.println(nomiCani[i]);

     // definire e inizializzare una nuova anagrafe

    /* caneA = null;
      personaA= null;

      coppiaA.getPersona().getCognome();

      pezzo di cod che stampa il nome del cane in
     // coppiaA se il padrone si chiama Bo di nome
     // altrimenti stampa la stringa "NO"
     if(coppiaA.getPersona().getNome().equals("Bo")){
       System.out.println(coppiaA.getCane().getNome());
     }else{
       System.out.println("NO");
     }  */

    }


}
