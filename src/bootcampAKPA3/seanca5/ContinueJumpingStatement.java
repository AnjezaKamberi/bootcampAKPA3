package bootcampAKPA3.seanca5;

import java.util.Scanner;

public class ContinueJumpingStatement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double balanca = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Jep shumen e parave qe deshiron te depozitosh:");
			double input = scanner.nextDouble();
			if (input < 0) {
				System.out.println("Nuk mund te depozitohen vlera negative!");
				continue;
			}
			System.out.println("Balanca ishte " + balanca);
			// balanca = balanca + input;
			balanca += input;
			System.out.println("Balanca eshte " + balanca);
		}
		System.out.println("Balanca eshte "  + balanca);
	}
}
