package oop_demo;

import oop_demo.auto.*;
/**
 * Classe Asino.
 * @author Team 3 
 */
public class Asino implements Guidabile
{
    int velocità; // in km/h
    boolean fame;

    /**
     *Dal il comando di partenza all'Asino al quale una volta partito viene fame.
     */
    public void parti(){
        System.out.println("IIII-OOOHHHHH");
        fame=true;
    }

    /**
     *Accelera l'Asino.
     *@param incremento di velocità (vel max = 3 km/h)
     */
    public void accelera(int quanto){
        velocità=velocità+quanto;
        if (velocità > 3){
            velocità = 3;
        }
        if (velocità > 0) {fame=true;}
    }

    /**
     * Rallenta l'Asino.
     * @param rallenta di velocità (vel min = 0 km/h)
     */
    public void rallenta(int quanto){
        velocità=velocità-quanto;
        if (velocità < 0){
            velocità = 0;
        }

        if (velocità == 0) {fame=false;}
    }

    /**
     * Resistuisce una stringa con lo stato dell'Asino (nome classe, velocità e variabile "Fame".
     */
    public String getInfo(){

        String stato;
        if (fame){
            stato = "Ho Fame";
        }
        else{
            stato = "Non ho fame";
        }
        return("Asino, Velocità: "+velocità+", IIII-OOOOOHHHH,  "+stato);
    }

}
