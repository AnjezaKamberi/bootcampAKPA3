package bootcampAKPA3.seanca2;

public class Student {

	private String emer;
	private short mosha;
	private static String bootcamp;

	// public
	// protected
	// package private (default)
	// private

	public static void main(String[] args) {
		// regjistroStudent();
		// System.out.println("DO KRYHET NJE VEPRIM TJETER");
		// regjistroStudent();
		// regjistroStudent("Kristel");
		// regjistroStudent("Dafjola");
		String emerStudentRegjistruar;
		emerStudentRegjistruar = regjistroStudent("Elio", 2022);
		System.out.println("Studenti qe u regjistrua eshte " + emerStudentRegjistruar);
		System.out.println("*****************************************************");
		emerStudentRegjistruar = regjistroStudent("Enea", 2023);
		System.out.println("Studenti qe u regjistrua eshte " + emerStudentRegjistruar);
	}

	// regjistro student

	public static void regjistroStudent() {
		System.out.println("Do regjistroj studentin Sara");
		System.out.println("Ruaj te dhena per studentin Sara");
		System.out.println("Vit regjistrimi 2023");
		System.out.println("Studenti Sara u ruajt!");
	}

	public static void regjistroStudent(String emer) {
		System.out.println("Do regjistroj studentin " + emer);
		System.out.println("Ruaj te dhena per studentin " + emer);
		System.out.println("Vit regjistrimi 2023");
		System.out.println("Studenti " + emer + " u ruajt!");
	}

	public static String regjistroStudent(String emer, int vitRegjistrimi) {
		System.out.println("Do regjistroj studentin " + emer);
		System.out.println("Ruaj te dhena per studentin " + emer);
		System.out.println("Vit regjistrimi " + vitRegjistrimi);
		System.out.println("Studenti " + emer + " u ruajt!");

		// kthej emrin e studentit qe u regjistrua
		return emer;

	}

}
