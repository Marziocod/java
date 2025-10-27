package day03;

public class Occorrenza {

	public static void main(String[] args) {
		String frase = "hello Java";
		char lettera = 'l';
		int conteggio = 0;
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == lettera) {
				conteggio = conteggio + 1;

			}
		}
		System.out.println("il numero di occorrenze è: " + conteggio);

	}

}
