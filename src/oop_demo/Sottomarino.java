package oop_demo;

import oop_demo.auto.*;
/**
 * Sottomarino
 */
public class Sottomarino implements Guidabile
{
    private int profondità;
    private int velocità;

    public void immergi(int quanto){
        profondità = profondità + quanto;
    }

    public void emergi(int quanto){
        if ((profondità-quanto)<0){
            profondità=0;
        }else{
            profondità = profondità - quanto;
        }
    }

    public void parti(){
        System.out.println ("SPLASH!!");
        }
    

    public void accelera(int quanto){
        if ((velocità + quanto)<=70){
            velocità = velocità + quanto;
        }else{
            velocità=70;
        }
    }

    public void rallenta(int quanto){
        if ((velocità - quanto)<0){
            velocità = 0;
        }else{
            velocità=velocità-quanto;
        }

    }

    public String getInfo(){
        String s = "Sottomarino: profondità= " + profondità + ", velocità= " + velocità;
        return s;
    }
}
