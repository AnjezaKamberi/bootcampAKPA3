package bootcampAKPA3.exceptions;

public class TryMultipleCatch {

	public static void main(String[] args) {

		System.out.println("Filloj ekzekutimin e programit");
		try {
			ExceptionSample.llogaritMesatare();
		} catch (NullPointerException e) {
			System.out.println("Kontrollo listen e notave");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Kontrollo indeximin e notave");
		} catch (Exception e) {
			System.out.println("Nje problem ka ndodhur");
		}

		System.out.println("Mbaron ekzekutimi i programit");

	}
}
