package day06;
/*Scrivi un programma Java che verifica se un numero dato è primo o meno.
(Un numero primo è un numero maggiore di 1 che può essere diviso solo per 1 e per sé stesso senza resto.)
*/

public class NumeroPrimo {

	public static void main(String[] args) {
		int numero = 17;
		boolean isPrimo =true;
		if (numero <= 1) {
		isPrimo=false;		
		}else  {
		for(int i = 2; i<= Math.sqrt(numero); i++ ) {
            if(numero % i ==0)	{
            	isPrimo = false;
            	break;
            			
         }
		}
		System.out.println("il numero "+ numero + (isPrimo ? " è primo " : " non è primo"));
		}
		}
	}


