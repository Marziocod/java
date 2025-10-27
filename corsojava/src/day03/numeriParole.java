package day03;

public class numeriParole {

	public static void main(String[] args) {
		String stringa = "questa è una frase di esempio";
		int numeroParole = 0;
		if (!stringa.isEmpty()) {
			numeroParole = numeroParole + 1;

		}
		for (int i = 0; i < stringa.length(); i++) {
			if (stringa.charAt(i) == ' ') {
				numeroParole = numeroParole + 1;
			}
		}
		System.out.println("numero di parole;" + numeroParole);
	}

}
