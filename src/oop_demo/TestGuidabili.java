package oop_demo;

import java.io.IOException;

import oop_demo.auto.*;
public class TestGuidabili
{
	
	 public static void main(String arg[]) throws IOException {
		  // creo un array di guidabili
	        Guidabile[] guidabili = { 
	                new AutoElettrica(), 
	                new SpaceShuttle(),
	                new Sottomarino(),
	                new Asino()};

	        // eseguo una iterazione e stampo le info
	        for(Guidabile g:guidabili){
	            System.out.println(g.getInfo());
	        }

	        System.in.read();

	        // eseguo una iterazione che fa partire i guidabili e
	        // stampa le info
	        for(Guidabile g:guidabili){
	            g.parti();
	            System.out.println(g.getInfo());
	        }

	        System.in.read();

	        // eseguo una iterazione che accelera i guidabili e
	        // stampa le info
	        for(Guidabile g:guidabili){
	            g.accelera(2);
	            System.out.println(g.getInfo());
	        }

	        System.in.read();

	        // eseguo una iterazione che accelera i guidabili e
	        // stampa le info
	        for(Guidabile g:guidabili){
	            g.accelera(500);
	            System.out.println(g.getInfo());
	        }
		 
		 
	 }

}

