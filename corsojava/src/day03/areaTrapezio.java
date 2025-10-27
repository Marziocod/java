package day03;

import java.util.Scanner;

public class areaTrapezio {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("inserici lunghezza base maggiore: ");
		double baseMaggiore = input.nextDouble();
		System.out.println("inserisci lunghezza base minore: ");
		double baseMinore = input.nextDouble();
		System.out.println("inserisci l'altezza: ");
		double altezza = input.nextDouble();
		double calcoloArea = (baseMaggiore + baseMinore) * altezza/2;
		System.out.println("l'area del trapezio è :" + calcoloArea);
		input.close();
		
		
	}

}
