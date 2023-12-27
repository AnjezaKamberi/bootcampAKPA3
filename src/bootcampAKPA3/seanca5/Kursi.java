package bootcampAKPA3.seanca5;

public class Kursi {

	private String emerKoordinator;
	private String emerDrejtor;

	private String studenti1;
	private String studenti2;
	private String studenti3;
	// ...
	private String studentiN;

	// deklarimi i nje array 1D
	private static String[] emraStudente;

	public static void main(String[] args) {

		// krijimi i nje array 1D te deklaruar
		emraStudente = new String[21];

		// krijimi i nje array 1D te padeklaruar
		int[] vleresimePerStudent = new int[21];

		// aksesimi i Studentit te pare
		System.out.println("Studenti i pare ne array eshte " + emraStudente[0]);
		// aksesimi i notes i Studentit te pare
		System.out.println("Nota e studentit te pare ne array eshte " + vleresimePerStudent[0]);

		// modifikoj emrin e studentit te pare
		emraStudente[0] = "Dafjola";
		vleresimePerStudent[0] = 10;
		System.out.println("***********Emri dhe nota pas modifikimit******");
		// aksesimi i Studentit te pare
		System.out.println("Studenti i pare ne array eshte " + emraStudente[0]);
		// aksesimi i notes i Studentit te pare
		System.out.println("Nota e studentit te pare ne array eshte " + vleresimePerStudent[0]);

		// modifikoj emrin e studentit te 15
		emraStudente[14] = "Kristel";
		vleresimePerStudent[14] = 10;
		System.out.println("Emri i studentit te 15 eshte: " + emraStudente[14]);
		System.out.println("Nota e studentit te 15 eshte: " + vleresimePerStudent[14]);
		// vlerat default per studentin e 16
		System.out.println("Emri i studentit te 15 eshte: " + emraStudente[15]);
		System.out.println("Nota e studentit te 15 eshte: " + vleresimePerStudent[15]);

		// krijimi i nje array dhe mbishkrimi i cdo elementi
		/*
		 * String[] diteJave = new String[7]; 
		 * diteJave[0] = "E hene"; 
		 * diteJave[1] = "E marte"; 
		 * diteJave[2] = "E merkure";
		 */

		// inicializimi qe ne krijim te tabeles
		// menyra 1

		String[] diteJave = new String[] { "E hene", "Ë marte", "E merkure" };

		// menyra 2
		//String[] diteJave = { "E hene", "Ë marte", "E merkure" };
		System.out.println("Dita e pare: " + diteJave[0]);
	
		// numri e elementeve te nje array
		System.out.println("Numri i elementeve eshte " + diteJave.length);
	}
}
