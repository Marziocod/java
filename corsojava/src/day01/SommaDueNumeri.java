package day01;

import java.util.Scanner;

public class SommaDueNumeri {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("inserisci il primo numero");
		int x=input.nextInt();
		System.out.println("inserisci il secondo numero"); 
		int y=input.nextInt();
		int somma=x+y;
		System.out.println("somma dei due numeri è "+ somma);
		input.close();
		
		

	}

}
