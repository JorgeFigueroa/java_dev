package oop_demo;

import java.io.IOException;

public class TestIdraulico
{
	 public static void main(String arg[]) throws IOException {

		        Mario m = new Mario();
		        System.out.println("\n"+m);
		        m.sturaLavandino();
		        m.dormi();
		        m.riparaPerdita();

		        Giorgio g = new Giorgio();
		        System.out.println("\n"+g);
		        g.mangia();

		        Paolo p = new Paolo();
		        System.out.println("\n"+p);
		        p.sviluppaGestionale();
		        p.riparaPerdita();

		 
	 }


}
