package day06;

public class RicercaElemento {

	public static void main(String[] args) {
		int[] numeri = { 10, 20, 30, 40, 50 };
		int elemento = 30;
		int posizione = -1;
		for (int i = 0; i < numeri.length; i++) {
			if (numeri[i] == elemento) {
				posizione = i;
				break;
			}
		}
		if (posizione != -1) {
			System.out.println("elemento" + elemento + "si trova alla posizione" + posizione);
		} else {
			System.out.println("elemento" + elemento + " non presente lell'array");
		}

	}

}
