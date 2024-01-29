package bootcampAKPA3.exceptions;

public class TryCatch {

	public static void main(String[] args) {

		System.out.println("Filloj ekzekutimin e programit");
		try {
			ExceptionSample.printoElementeArray();

		} catch (NullPointerException e) {
			System.out.println("Ndodhi nje problem gjate afishimit " 
		+ "te notave te studenteve");
		}
		System.out.println("Mbaron ekzekutimi i programit");

	}
}
