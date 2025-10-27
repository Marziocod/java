package day06;

import java.util.Scanner;

/*Leggi dallo standard input 5 numeri, memorizzali in unarray e stampa in output solo i numeri pari.
 * 
 */

public class StampaOutpt {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in) ;
	
	int[] numeri = new int[5];
	for(int i=0; i<numeri.length; i++) { 
	System.out.printf("inserisci il %d°  numero di %d°: \n",(i+1), numeri.length);
	numeri[i]=input.nextInt();
	input.nextLine();
	}
	System.out.println("i numeri pari sono: ");
	for(int numero:numeri) {
		if(numero % 2==0) {
			System.out.println(numero);
		}
		
	}
	input.close();
}

}
