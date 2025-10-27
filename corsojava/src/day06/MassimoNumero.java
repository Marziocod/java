package day06;
/*Leggi in input tre numeri interi e stampare il maggiore dei tre.
 * 
 */

import java.util.Scanner;

public class MassimoNumero {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numeri = new int[3];
		for (int i = 0; i < numeri.length; i++) {
			System.out.println("inserisci il: " + (i+1) + "elemento");
			numeri[i] = input.nextInt();
			input.nextLine();
		}
		int x = numeri[0];
		int y = numeri[1];
		int z = numeri[2];

		if (x == y && y == z) {
			System.out.println("i numeri inseriti sono uguali");
		} else if (x > y && x > z) {
			System.out.println("in numero maggiore è x con valore di: " + x);
		} else if (y > x && y > z) {
			System.out.println("in numero maggiore è y con valore di: " + y);
		} else {
			System.out.println("in numero maggiore è z con valore di: " + z);
		}
		input.close();
	}
}
