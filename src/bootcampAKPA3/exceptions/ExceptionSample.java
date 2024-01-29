package bootcampAKPA3.exceptions;

import java.util.Scanner;

public class ExceptionSample {

	private ExceptionSample() {

	}

	// exception gjate leximit te elementeve te nje array
	// ArrayIndexOutOfBoundsException
	public static void printoElementeArray() {
		System.out.println("Do afishoj notat e studenteve");
		int[] nota = { 8, 7, 5, 10, 9 };
		for (int studentIndex = 1; studentIndex <= 5; studentIndex++) {
			System.out.println("Nota e studentit eshte " + nota[studentIndex]);
		}
		System.out.println("Suksese ne sezonin pasardhes!");

	}

	// NullPointerException
	public static void regjistroStudent() {
		Student student = null;
		String dita = "hene";
		if (dita.equalsIgnoreCase("marte")) {
			student = new Student("Andi", "Kuka");
		} else {
			System.out.println("Regjistrimet jane vetem diten e marte");
		}
		System.out.println("Studenti i regjistruar me emer " + student.getEmri() + " dhe mbiemer "
				+ student.getMbiemri() + " sapo u shtua ne listen e kursanteve");
	}

	// InputMismatchException
	public static void llogaritMesatare() {

		int shuma = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Me jep notat e 5 studenteve");

		for (int indexStudent = 1; indexStudent <= 5; indexStudent++) {
			int notaStudent = scanner.nextInt();
			shuma += notaStudent;
		}
		System.out.println("Mesatarja eshte " + shuma / 5);
	}

}
