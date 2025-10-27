package day02;


import java.util.Scanner;

public class InputEsempio {

	public static void main(String[] args) {
		Scanner tastiera=new Scanner(System.in);
		System.out.print("inserisci una parola");
		String input=tastiera.next();
		System.out.println("ha inserito " + input);
		tastiera.close();

	}

}
