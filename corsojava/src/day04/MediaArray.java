package day04;
/*Scrivi un programma Java che calcola la media dei valori presenti in un array di numeri in virgola mobile (double).
 * 
 */

public class MediaArray {

	public static void main(String[] args) {
		double[] numeri = { 2.5, 8.9, 7.6, 10.56 };
		double somma = 0;
		for (double m : numeri) {
			somma = somma + m;
		}
		for (int i = 0; i < numeri.length; i++) {
			somma = somma + numeri[i];

		}
		double media=somma/numeri.length;
		System.out.println("media array: "+ media);
	}
	

}
