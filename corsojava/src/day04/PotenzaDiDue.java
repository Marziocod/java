package day04;

public class PotenzaDiDue {

	public static void main(String[] args) {
		for (long i = 0, j = 1; i < 60 || j < 100; i++, j *= 2) {
			System.out.println("2^" + i + "=" + j);

		}

	}

}
