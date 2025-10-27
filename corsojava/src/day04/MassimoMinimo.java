package day04;

public class MassimoMinimo {

	public static void main(String[] args) {
		int[] numeri = {5,10,-2,8,3};
		int massimo = numeri[0];
		int minimo = numeri[0];
		for (int i=1; i<numeri.length; i++) {
		if (numeri[i]>massimo) {
			massimo=numeri[i];
		}
		if(numeri[i]<minimo){
		   minimo=numeri[i];
		}
		}
		System.out.println("Valore massimo presente nel arrey: "+ massimo);
		System.out.println("Valore minimo presente nel array: "+ minimo);
		}

}
