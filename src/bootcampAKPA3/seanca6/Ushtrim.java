package bootcampAKPA3.seanca6;

import java.util.Scanner;

public class Ushtrim {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Jepni numrin e balancave qe deshironi te ruani: ");
		int numer = scanner.nextInt();
		
		int[] balanca = new int[numer];
		
		for(int i = 0; i < numer; i++) {
			System.out.println("Jepni balancen per llogarine "+(i+1)+": ");
			balanca[i] = scanner.nextInt();
		}
		
		System.out.println("Array i dyfishuar:");
		
		for(int i = 0; i < balanca.length; i++) {
			balanca[i] = balanca[i] * 2;
			System.out.println(balanca[i]);
		}
	}

}
