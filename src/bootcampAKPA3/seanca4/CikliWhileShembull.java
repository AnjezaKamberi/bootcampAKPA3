package bootcampAKPA3.seanca4;

import java.util.Scanner;

public class CikliWhileShembull {

	private static final String INPUT_STOP = "STOP";

	public static void main(String[] args) {

		// struktura ciklike while
		String inputProdukt = null;

		System.out.println("Me jep nje emer produkti ");

		Scanner scanner = new Scanner(System.in);
		inputProdukt = scanner.next();

		while (!inputProdukt.equals(INPUT_STOP)) {
			System.out.println("Produkti eshte: " + inputProdukt);
			System.out.println("Me jep nje produkt tjeter dhe shtyp stop nese do te ndalosh ");
			inputProdukt = scanner.next();

		}

		scanner.close();
	}
}
