package day02;

import java.util.Scanner;

public class RaggioCerchio {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("inserisci raggio cerchio");
		double raggio= input.nextDouble();
		double area= Math.PI*raggio*raggio;
		System.out.println("il raggio del cerchio è " + area);
		input.close();
		
				
	}
	

}
