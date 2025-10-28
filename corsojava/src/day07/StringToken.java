package day07;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		String Testo = "questo è un esempio di tokenizer in java";
		StringTokenizer tokenizer = new StringTokenizer(Testo);
	    System.out.println("Token individuati: ");
	    while(tokenizer.hasMoreTokens() ) {
	         String token = tokenizer.nextToken();
        System.out.println(token);	    
	    }
	}

}
