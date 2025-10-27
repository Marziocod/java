package day02;

import java.util.Scanner;

public class medianumeri {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("inserisci il primo numero: ");
		double numero1 = input.nextDouble();
		System.out.print("inserisci il secondo numero: ");
		double numero2 = input.nextDouble();
		System.out.print("inserisci il terzo numero: ");
		double numero3 = input.nextDouble();
		double media = (numero1 + numero2 + numero3) / 3;
		System.out.println("la media dei tre nuemri è: " + media);
		input.close();
		
	}

}
