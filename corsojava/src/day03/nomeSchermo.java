package day03;

import java.util.Scanner;

/*Scrivere un programma che visualizzi sullo schermo del terminale il vostro nome
all’interno di un rettangolo
+ -----+
| Paolo |
+ - - --+

*/

public class nomeSchermo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome = "Paolo Rossi";
		int lunghezzaNome = nome.length();
		String lineaOrizzontale = "+" + "-".repeat(lunghezzaNome);
		String spaziVuoti = "|" + " ".repeat(lunghezzaNome)+"|";
		System.out.println(lineaOrizzontale);
		System.out.println(spaziVuoti);
		System.out.println("|" +nome+ "|");
		System.out.println(lineaOrizzontale);
		input.close();
	}

}
