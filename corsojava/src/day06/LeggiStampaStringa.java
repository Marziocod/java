package day06;
/*Leggi da input una stringa e stampala in output.
 * 
 */

import java.util.Scanner;

public class LeggiStampaStringa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unserisci qualcosa che vuoi stampare a video: ");
		String miaStringa = input.nextLine();
		System.out.println("Hai inserito: " + miaStringa);
		input.close();
		
		
	}

}
