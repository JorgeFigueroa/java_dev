package oop_anagrafeCanina2;

import oop_anagrafeCanina2.interfaces.Animale;
import oop_anagrafeCanina2.model.Persona;


public class CoppiaAnimalePadrone{
     private Animale animale;
     private Persona persona;

     public CoppiaAnimalePadrone(Animale animale, Persona persona){
         this.animale=animale;
         this.persona=persona;
     }

     public Animale getAnimale(){
         return this.animale;
     }
     public void setCane(Animale animale){
         this.animale=animale;
     }

     public Persona getPersona(){
         return persona;
     }
     public void setPersona(Persona persona){
         this.persona=persona;
     }
     public void stampa()
     {
         System.out.println("Gatto: "+animale.getNome()+" Padrone: "+persona.getNome()+" "+persona.getCognome());
     }
}
