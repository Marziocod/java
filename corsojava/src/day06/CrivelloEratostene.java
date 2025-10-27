package day06;

public class CrivelloEratostene {

	public static void main(String[] args) {
		int numero = 26;
		boolean[] numeri = new boolean[numero + 1];
		for (int i = 2; i < numeri.length; i++) {
		
		for (int j = 2; j < numeri.length; j++) {
			int index = i * j;
			if (index < numeri.length) {
				numeri[index] = true;
			}
			}
		}
	
	System.out.printf("Numeri primi finoa %d: \n" , numero);
	for (int i=2; i<numeri.length;  i++) {
		if(!numeri[i]) {
		
			System.out.println(i+" ");
		}
		}	 
	}
}
