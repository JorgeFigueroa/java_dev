package oop_carte;

public class Test {

	public static void main(String[] args) {
		testEstrazioneTop(20);
	}

	public static void testEstrazioneRandom() {
		Mazzo m = new Mazzo();
		for (int i = 1; i <= 60; i++) {
			Carta c = m.estraiRandom();
			System.out.println(i + " -> " + c);
		}
	}

	public static void testEstrazioneTop() {
		Mazzo m = new Mazzo();
		m.mischia();
		for (int i = 1; i <= 60; i++) {
			Carta c = m.estraiTop();
			System.out.println(i + " -> " + c);
		}
	}

	public static void testEstrazioneTop(int quante) {
		Mazzo m = new Mazzo();
		Carta[] estratte = m.estraiTop(quante);
		for (Carta c : estratte) {
			System.out.println(c);
		}
	}
}
