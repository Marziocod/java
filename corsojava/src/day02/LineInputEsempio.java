package day02;

import java.util.Scanner;

public class LineInputEsempio {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		System.out.print("inserisci una parola");
		String input = tastiera.nextLine();
		System.out.println("va inserito " + input);
		tastiera.close();

	}

}
