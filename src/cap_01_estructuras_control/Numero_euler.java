package cap_01_estructuras_control;

import java.util.Scanner;

public class Numero_euler {
	
	public static void main(String[] args) {
		System.out.println("euler= " + euler());
	}

	public static long factorial(int x) {

		long temp = 1;
		for (int i = 1; i < x; i++) {
			temp = temp * i;
		}
		return temp;

	}

	public static double euler() {
		double e = 0;
		for (int i = 1; i < 50; i++) {
			e = e + 1 / (double) (factorial(i));
		}
		return e;
	}



}
