package bootcampAKPA3.exceptions;

public class TryCatchFinally {

	public static void main(String[] args) {
		System.out.println("Filloj ekzekutimin e programit");
		try {
			ExceptionSample.regjistroStudent();
		} catch (NullPointerException e) {
			System.out.println("Ndodhi nje problem me "
					+ "regjistirmin e studentit");
		} finally {
			System.out.println("Kontrollo procesin " 
		+ "e regjistrimit te studenteve");
		}
		
		System.out.println("Mbaroi ekzekutimin e programit");
	}
}
