package day02;// +

import java.util.Scanner;

public class ConversioneTemperatura {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci i gradi Celsius:");
		double celsius = input.nextDouble();
		double fahrenheit = celsius * 9/5 + 32;
		System.out.println(celsius+"° celsius converiti in gradi fahrenheit equivalgono a : "+ fahrenheit +"°F" );
		input.close();
				
				


	}

}
