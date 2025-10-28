package day07;

import java.util.Scanner;

public class Isogramma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean[] lettere = new boolean[26];
		boolean isogramma = true;
		System.out.println("inserisci una parola e ti dirò se è un isogramma");
		String frase = input.nextLine().toLowerCase();	
		for(int  i = 0; i < frase.length(); i++) {
			char lettera = frase.charAt(i);
			if (lettera >='a' && lettera <= 'z') {
				int index =lettera -'a';
				if (lettere[index] == false) {
					lettere[index] = true;
				}else {
				System.out.println("la parola non è un isogramma ");	
				isogramma = false;
				break;
				}
				
			}else {
				System.out.println("la parola non è un isogramma");
				isogramma=false;
				break;	
			}
			
		}
		if(isogramma) {
			System.out.println("la frase è un isogramma");
		}
		input.close();
		}
	}


