package bootcampAKPA3.seanca5;

import java.util.Scanner;

public class ReturnJumpingStatement {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		//System.out.println("Merr numrin me te madh:");
		//int nrMeMadh = merrNumrinMeTeMadh(5, 7);
		//System.out.println("Numri me i madh mes 5 dhe 7 eshte " + nrMeMadh);
		System.out.println("Para thirrjes se metodes");
		printoLendePreferuar();
		System.out.println("Pas thirrjes se metodes");
		scanner.close();

	}

	public static int merrNumrinMeTeMadh(int numer1, int numer2) {
		System.out.println("Do krahasoj dy numrat");
		if (numer1 < numer2) {
			System.out.println("Numri me i madh eshte numri2 me vleren " + numer2);
			return numer2;
		} else if (numer2 > numer1) {
			System.out.println("Numri me i madh eshte numri1 me vleren " + numer1);
			return numer1;
		} else {
			System.out.println("Numrat jane te barabarte");
			return numer1;
		}
	}
	
	public static void printoLendePreferuar() {
		String t = "";
		do {
			System.out.println("Vendosni lenden tuaj te preferuar:");
			t=scanner.nextLine();
			if(t.equalsIgnoreCase("Stop")) {
				return;
			}
			System.out.println(t);
		}while(true);
		//System.out.println("FALEMINDERIT PER INPUTET E DHENA");
	}
}
