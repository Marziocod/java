package day04;

import java.util.Scanner;
/*Scrivi un programma Java che inverta una stringa data.
 * 
 */

public class stringaData {

	public static void main(String[] args) {
		// String parola = "mouse";
		// String parolaInvertita = "";

		try (Scanner parola = new Scanner(System.in)) {
			System.out.println("inserisci una parola: ");

			String tastiera = parola.nextLine();
			String parolaInventita = "";

			for (int i = tastiera.length() - 1; i >= 0; i--) {
				parolaInventita += tastiera.charAt(i);
			}
			System.out.println("la parola che hai inserito è " + tastiera);
			System.out.println("la prola invertita è :" + parolaInventita);
		}
	}

}
