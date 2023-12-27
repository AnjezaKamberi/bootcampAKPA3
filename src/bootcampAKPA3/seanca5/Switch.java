package bootcampAKPA3.seanca5;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Fillim i Procesit");
		System.out.println("Jepni nr e dites se javes");
		int nr = input.nextInt();
		switch (nr) {
		case 1:
			System.out.println("E hene");
			break;
		case 2:
			System.out.println("E Marte");
			break;
		case 3:
			System.out.println("Ë Merkure");
			break;
		case 4:
			System.out.println("Ë Enjte");
			break;
		case 5:
			System.out.println("Ë Premte");
			break;
		case 6:
			System.out.println("E Shtune");
//			break;
		case 7:
			System.out.println("E Diel");
//			break;

		default:
			System.out.println("Numri i gabuar");
			break;
		}
		;
		System.out.println("Fund i procesit");
	}
}
