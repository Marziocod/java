package day02;

import java.util.Scanner;

/*Implementa un programma che chieda all'utente di inserire un numero e calcoli
il suo valore assoluto utilizzando il metodo abs() della classe Math.
*/

public class valoreassoluto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("inserire numero:");
		int numero = input.nextInt();
		int valoreAssoluto = Math.abs(numero);
		System.out.println("il valore assoluto del numero" + numero +" è: " + valoreAssoluto);
		input.close();
		
		
		
				;

	}

}
