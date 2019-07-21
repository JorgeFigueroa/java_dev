package oop_anagrafeCanina2;

import oop_anagrafeCanina2.interfaces.Anagrafe;

public class AnagrafeAnimali implements Anagrafe {

     private String nome;
     private CoppiaAnimalePadrone[] listaCaPa;


    public AnagrafeAnimali(String nome, CoppiaAnimalePadrone[] listaCaPa){
         this.nome=nome;
         this.listaCaPa=listaCaPa;
     }

     public String getNome(){
         return nome;
     }

     public CoppiaAnimalePadrone[] getListaCaPa(){
         return listaCaPa;
     }

     public void stampaNomeAnimalePadrone(int pos){
         if(pos>=listaCaPa.length || pos<0 ){
            System.out.println(" NON ESISTE COPPIA!!");
         }else{
            // prendere nome persona in i
            String nomeP =
                listaCaPa[pos].getPersona().getNome();

            // prendere nome cane in i
            String nomeC =
                listaCaPa[pos].getAnimale().getNome();

            // stampare a video
          System.out.println("nome P C:"+nomeP+"-"+ nomeC);
        }
     }

      public void stampaNomeAnimalePadrone()
      {  
    	  System.out.println("CANI");
         for(int i=0;i<listaCaPa.length;i++)
            System.out.println("nome C P:"+listaCaPa[i].getAnimale().getNome()+"-"+ listaCaPa[i].getPersona().getNome());

     }

      public void stampaNomeCompletoCani()
      {
          for(int i=0;i<listaCaPa.length;i++)
            System.out.println("nome C cognome P:"+listaCaPa[i].getAnimale().getNome()+"-"+ listaCaPa[i].getPersona().getCognome());
      }



    public String getNomePadroneDiCane(int idCane){
       String toRet=null;
       int i=0;
       while(i<listaCaPa.length && toRet==null ){
          if(listaCaPa[i].getAnimale().getIdAnimale() == idCane){
             toRet= listaCaPa[i].getPersona().getNome();
          }
          i++;
       }
       return toRet;
     }

     public int contaNumeroCaniConPadrone(String nomePadrone)
      {
          int result=0;
            for(int i=0;i<listaCaPa.length;i++)
                if(listaCaPa[i].getPersona().getNome().equals(nomePadrone))
                    result++;
          return result;
      }

     public String[] getNomiCaniConPadrone(String nomePadrone)
     {
         String [] nomiCani = new String [contaNumeroCaniConPadrone(nomePadrone)];
         int j=0;
            for(int i=0;i<listaCaPa.length;i++)
            {
                if(listaCaPa[i].getPersona().getNome().equals(nomePadrone))
                {
                    nomiCani[j]=listaCaPa[i].getAnimale().getNome();
                    j++;
                }
            }
         return nomiCani;
     }

}
