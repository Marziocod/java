package day06;
/*Scrivi un programma Java che calcola il valore massimo e il valore minimo presenti in un array di interi.
 * 
 */

public class MassimoMinimo {

	public static void main(String[] args) {
		int[] numeri = { 5, 10, -2, 8, 3 };
		int massimo = numeri[0];
		int minimo = numeri[0];
		for (int i = 1; i < numeri.length; i++) {
			if (numeri[i] > massimo) {
				massimo = numeri[i];
			}
			if (numeri[i] < minimo) {
				minimo = numeri[i];
			}
		}
		System.out.println("il valore massimo dell'array è: " + massimo);
		System.out.println("il valore minimo dell'array è: " + minimo);
	}

}
