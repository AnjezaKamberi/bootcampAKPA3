package bootcampAKPA3.exceptions;

public class TryFinally {

	public static void main(String[] args) {
		System.out.println("Filloj ekzekutimin e programit");
		try {
			ExceptionSample.regjistroStudent();
		} finally {
			System.out.println("Kontrollo procesin "
					+ "e regjistrimit te studenteve");
		}
		System.out.println("Mbaroi ekzekutimin e programit");
	}
}
