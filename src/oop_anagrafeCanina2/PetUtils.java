package oop_anagrafeCanina2;

import oop_anagrafeCanina2.interfaces.Anagrafe;

public class PetUtils {
	
	public static void printAnagrafe(Anagrafe anagrafica) {
		anagrafica.stampaNomeAnimalePadrone();
	}      
	
	public static void main(String[] args) {
		AnagrafeAnimali cani = new AnagrafeAnimali("cani", new CoppiaAnimalePadrone[0]);
		AnagrafeAnimali gatti = new AnagrafeAnimali("gatti", new CoppiaAnimalePadrone[0]);

		printAnagrafe(cani);
		printAnagrafe(gatti);
		
		Anagrafe anagrafe = new AnagrafeAnimali("altriCani", new CoppiaAnimalePadrone[0]);
		
		printAnagrafe(anagrafe);
	}
}
