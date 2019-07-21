package oop_demo;

import oop_demo.auto.*;
/**
 * Aggiungi qui una descrizione della classe FurgonePizza
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class FurgonePizza extends Furgone implements Cucina
{
    public void cuoci (Alimento a){
        new CucinaBerloni().cuoci(a);
    }
}
