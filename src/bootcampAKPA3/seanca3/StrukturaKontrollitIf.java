package bootcampAKPA3.seanca3;

import java.util.Scanner;

public class StrukturaKontrollitIf {

	public static void main(String[] args) {
		System.out.println("Struktura e kontrollit IF");

		Scanner input = new Scanner(System.in);
		System.out.println("Me jep nje numer: ");
		int numer = input.nextInt();

		// kusht - struktura kontrollit if
		// numer NEGATIV <0
		if (numer < 0) {
			System.out.println("Ju keni dhene nje numer negativ");
			
		}

		// numer POZITIV >=0
		if (numer >= 0) {
			System.out.println("Ju keni dhene nje numer pozitiv");
		}
		System.out.println("Fund struktura kontrolli IF");
	}

}
