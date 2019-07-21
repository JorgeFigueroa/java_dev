package oop_demo;

import oop_demo.auto.*;
/**
 * Team 1: SpaceShuttle
 */
public class SpaceShuttle implements Guidabile
{
    private int temperaturaScudo;
    private int velocità;

    public void parti () {
        System.out.println("Brooom...");
    }

    public void accelera (int quanto) {
        velocità+=quanto;
        if (velocità>12000) {
            velocità=12000;
        }
        if (velocità<0) {
            velocità=0;
        }
        temperaturaScudo=velocità/100;
    }

    public void rallenta (int quanto) {
        velocità-=quanto;
    }

    public String getInfo () {
        String s =  "SpaceShuttle , Scudo "+temperaturaScudo+", Velocità "+velocità;
        return (s);
    }
}
