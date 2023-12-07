package bootcampAKPA3.seanca2;

public class EmertimVariabla {

	static final String EMER_AKADEMIA = "ikubINFO Academy";
	
	public static void main(String[] args) {
		
		// deklarim variabli
		String emer;
		
		// inicializim variabli
		emer = "Sara";
		System.out.println("Emri i studentit eshte " + emer);
		// deklarim dhe inicializim variabli
		
		String bootcamp = "JAVA";
		System.out.println("Emri i bootcampit eshte " + bootcamp);
		
		// praktike e mire
		int vitFillimBootcamp = 2023;
		System.out.println("Viti i fillimit te bootcampit(PARA MODIFIKIMIT) eshte " + vitFillimBootcamp);
		// praktike jo e mire
		int vitfillimbootcamp = 2023;
		
		System.out.println("Emer bootcamp " + EMER_AKADEMIA);
		
		// EMER_AKADEMIA = "ikub";
		
		vitFillimBootcamp = 2022;
		System.out.println("Viti i fillimit te bootcampit(PAS MODIFIKIMIT) eshte " + vitFillimBootcamp);
				
		int vitBootcampJava = vitFillimBootcamp;
		System.out.println("Viti i fillimit te bootcampit JAVA eshte " + vitBootcampJava);
	}
}
