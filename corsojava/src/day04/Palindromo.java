package day04;
/*Scrivi un programma Java che verifichi se una stringa data è un palindromo 
 * (cioè se può essere letta allo stesso modo da destra a sinistra e viceversa)
 */

public class Palindromo {

	public static void main(String[] args) {
		String stringa = "mouse";
				boolean isPalindromo = true;
		for (int i = 0; i < stringa.length()/2; i++) {
		if(stringa.charAt(i) != stringa.charAt(stringa.length() -1 -i)) {
			isPalindromo = false;
			break;
			
		    }
		}
		if (isPalindromo) {
		    System.out.println("la stringa " + stringa +" è Palindromo");
		}    else { 
		    System.out.println("la stringa " + stringa +" non è palindroma");
		}
		
	}

}