package day07;

public class ConcetturaCollaz1 {

	public static int collatzSteps(int n) {
		if (n <= 0) {
			throw new IllegalArgumentException("n deve essere intero positivo maggiore di zero ");
		}
		int passi = 0;
		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;

			} else {
				n = 3 * n + 1;
			}
			passi = passi + 1;
		}
		return passi;
	}

	public static void main(String[] args) {
		int n = 12;
		int risultato = collatzSteps(n);
		System.out.println("numeri di passi per raggiungere 1 partendo da " + n + ":" + risultato);
	}

}
