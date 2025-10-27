package day02;

import java.util.Random;

public class Dado {

	public static void main(String[] args) {
		Random casuale=new Random();
		int risultato = casuale.nextInt(6)+1;
		System.out.println("risultato è: " + risultato);
		
	}

}
