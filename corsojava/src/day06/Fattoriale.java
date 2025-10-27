package day06;



/*Scrivi un programma Java che calcola il fattoriale di un numero dato.
es. 9! = 9*8*7*6*5*4*3*2*1
*/

public class Fattoriale {

	public static void main(String[] args) {
		int numero = 5;
		int fattoriale= 1;
		for(int i= 1; i <= numero; i++) {
		    fattoriale=fattoriale*i;
		}
		System.out.println("il fattoriale di "+ numero +" è "+ fattoriale);
	}

}
