package day02;
/*Implementa un programma che chieda all'utente di inserire due numeri e calcoli
il resto della divisione tra il primo numero e il secondo numero utilizzando
*/



import java.util.Scanner;

public class RestoDivisione {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("inserire numero: ");
		double numero1 = input.nextDouble();
		System.out.println("inserire numero: ");
		double numero2 = input.nextDouble();
		double restoDivisione = numero1 % numero2;
		System.out.println("resto della divisione tra: "+ numero1 + " e " + numero2 + " è: " + restoDivisione);
		input.close();
		
		

	}

}
