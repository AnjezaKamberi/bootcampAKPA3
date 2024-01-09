package bootcampAKPA3.oop;

public class Main {

	// deklarimi i nje objekti
	static Supermarket elioSupermarket;

	public static void main(String[] args) {
		System.out.println("Supermarket 'Elio': " + elioSupermarket);

		// krijimi i nje objekti
		Supermarket celdoSupermarket = new Supermarket();

		// leximi i karakteristikes se nje objekti
		System.out.println("Emri i supermarketit: " + celdoSupermarket.emri);
		System.out.println("Produktet e supermarketit: " + celdoSupermarket.produkte);
		System.out.println("Numri i njesive te supermarketit: " + celdoSupermarket.njesi);

		// modifikim i karakteristikes se nje objekti
		celdoSupermarket.emri = "Celdo";
		System.out.println("Emri i supermarketit(pas modifikimit): " + celdoSupermarket.emri);
		celdoSupermarket.njesi = 8;
		elioSupermarket = new Supermarket();
		System.out.println("Numri i njesive per supermarket 'Elio' eshte " + elioSupermarket.njesi);
		System.out.println("Emri i supermarketit: " + elioSupermarket.emri);

		// krijoj nje objekt duke perdorur konstruktorin me parameter
		Supermarket eneaSupermarket = new Supermarket("Enea", "Tirane");
		System.out.println("Emri i supermarketit per objektin 'eneaSupermarket' " + eneaSupermarket.emri);
		System.out.println("Adresa e supermarketit '" + eneaSupermarket.emri + "'eshte " + eneaSupermarket.adresa);
		System.out.println("Viti i hapjes se supermarketit: " + eneaSupermarket.vitiHapjes);

		Supermarket adelaSupermarket = new Supermarket("Adela", "Durres", 2023);
		System.out.println("Emri i supermarketit per objektin 'adelaSupermarket' " + adelaSupermarket.emri);
		System.out.println("Adresa e supermarketit '" + adelaSupermarket.emri + "'eshte " + adelaSupermarket.adresa);
		System.out.println("Viti i hapjes se supermarketit: " + adelaSupermarket.vitiHapjes);
		System.out.println("Numri i kontaktit " + adelaSupermarket.numerKontakti);
	}
}
