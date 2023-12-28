package bootcampAKPA3.seanca6;

public class Array2D {

	/*
	 * int[] shitjet2000 = new int[12]; int[] shitjet2001 = new int[12]; int[]
	 * shitjet2002 = new int[12]; int[] shitjet2003 = new int[12]; // ... int[]
	 * shitjet2023 = new int[12];
	 */

	// deklarimi i array 2D
	private static int[][] shitjetPerCdoVit;

	public static void main(String[] args) {

		// krijimi i nje array2D
		shitjetPerCdoVit = new int[5][12];

		// aksesoj shitjet per vitin 2000 ne muajin Janar
		System.out.println("Shitjet per vitin 2000: Muaji Janar - " + shitjetPerCdoVit[0][0]);

		// modifikoj shitjet per vitin 200 ne muajin Janar
		shitjetPerCdoVit[0][0] = 10;
		System.out.println("Shitjet per vitin 2000: Muaji Janar - " + shitjetPerCdoVit[0][0]);

		// shitjet e vitit 2002 per muajin Maj
		shitjetPerCdoVit[2][4] = 50;
		System.out.println("Shitjet per vitin 2002: Muaji Maj - " + shitjetPerCdoVit[2][4]);

		// shitjet e vitit 2004 ne muajin Shkurt
		shitjetPerCdoVit[4][1] = 30;
		System.out.println("Shitjet per vitin 2004: Muaji Shkurt - " + shitjetPerCdoVit[4][1]);

		// shitjet e vitit 2003 ne muajin Mars
		shitjetPerCdoVit[3][2] = 70;
		System.out.println("Shitjet per vitin 2003: Muaji Mars- " + shitjetPerCdoVit[3][2]);

		// printo shitjet e cdo viti per 12 muaj

		for (int indexRreshti = 0; indexRreshti < shitjetPerCdoVit.length; indexRreshti++) {
			System.out.println("Shitjet per vitin " + (1999 + indexRreshti + 1));
			for (int indexKolona = 0; indexKolona < shitjetPerCdoVit[indexRreshti].length; indexKolona++) {
				System.out.println("Numri i shitjeve per muajin " + (indexKolona + 1) + " eshte "
						+ shitjetPerCdoVit[indexRreshti][indexKolona]);
			}
			System.out.println("*********************");
		}
	}
}
