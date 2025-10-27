package day04;
/*Scrivi un programma Java che calcoli la potenza di un numero base elevato a un esponente dato.
 * 
 */

public class calcoloPotenza {

	public static void main(String[] args) {
		int base = 2;
		int esponente= 5;
		int risultato = 1;
		for (int i =0; i< esponente; i++) {
		     risultato = risultato * base;
		     
		}
		System.out.println(base + " elevato alla potenza " + esponente + " è uguale a: "+ risultato);
		}
	}


