package day02;

import java.util.Scanner;

public class paridispari {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("inserisci un numero intero: ");
		int numero = input.nextInt();
		if( numero % 2 ==0) {
			System.out.println(" il numero è pari. ");
		} else {
			System.out.println(" il numero è dispari. ");
		}
		input.close();

	}

}
