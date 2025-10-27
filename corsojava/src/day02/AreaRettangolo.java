package day02;
/*Scrivi un programma Java che chieda all'utente di inserire la lunghezza e la larghezza di un rettangolo e stampi l'area corrispondente
 * 
 */

import java.util.Scanner;

public class AreaRettangolo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("inserisci lunghezza rettangolo");
		double lunghezza=input.nextDouble();
		System.out.println("inserisci larghezza rettangolo");
		double larghezza=input.nextDouble();
		double area=lunghezza*larghezza;
		System.out.println("l'area del rettangolo è "+ area);
		input.close();
		
		
				
	}

}
