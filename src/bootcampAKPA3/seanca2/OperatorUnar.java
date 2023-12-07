package bootcampAKPA3.seanca2;

public class OperatorUnar {

	public static void main(String[] args) {

		// operatori NOT
		boolean eshteFundjave = false;

		System.out.println("Eshte fundjave: " + eshteFundjave);

		boolean nukEshteFundjave = !eshteFundjave;

		System.out.println("Eshte fundjave(PAS operatorit NOT): " + nukEshteFundjave);

		System.out.println("Rezultati i '!nukEshteFundjave' " + !nukEshteFundjave);

		int numer = 10;
		// POST INKREMENTIM
		System.out.println("Vlera e numrit eshte " + numer);
		// int numerShtuar1 = numer++;
		System.out.println("Vlera e numrit eshte " + numer);
		// System.out.println("Vlera e variablit 'numerShtuar1' eshte " + numerShtuar1);
		// PRE INKREMENTIM
		int numerShtuar1 = ++numer;
		System.out.println("Vlera e numrit eshte " + numer);
		System.out.println("Vlera e variablit 'numerShtuar1' eshte " + numerShtuar1);
		
		// PRE DEKREMENTIM
		// POST DEKREMENTIM
			
		
	}
}
