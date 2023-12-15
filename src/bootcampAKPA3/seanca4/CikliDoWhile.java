package bootcampAKPA3.seanca4;

public class CikliDoWhile {

	public static void main(String[] args) {
		System.out.println("Fillimi i ciklit");
		int numer = 5;

		do {
			System.out.println("Numri eshte " + numer);
			numer = numer + 1;
		} while (numer < 5);

		// testo ndryshimin
		/*
		 * while (numer < 5) { System.out.println("Numri eshte " + numer); numer = numer
		 * + 1; }
		 */

		System.out.println("Dalja nga cikli while");
	}
}
