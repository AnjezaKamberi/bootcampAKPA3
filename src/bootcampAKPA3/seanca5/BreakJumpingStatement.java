package bootcampAKPA3.seanca5;

import java.util.Scanner;

public class BreakJumpingStatement {

	private static final String PASSWORD = "ikubinfo";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Fillo leximin e inputit");
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Jep passwordin: ");
			String input = scanner.next();
			if (input.equals(PASSWORD)) {
				System.out.println("Passwordi u gjet");
				System.out.println("Tentativa: " + (i + 1));
				break;
			}
			
		}
		System.out.println("Perfundoi leximi i inputit");
	}
}
