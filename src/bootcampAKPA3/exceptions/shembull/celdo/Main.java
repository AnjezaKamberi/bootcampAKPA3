package bootcampAKPA3.exceptions.shembull.celdo;

public class Main {

	public static void main(String[] args) {
		Kategori kategoriA = new Kategori("Fruta");
		Kategori kategoriB = new Kategori("Perime");

		try {
			Produkt molle = new Produkt("Molle", 203.3f, 50);
//            molle.setCmimi(500000f);
			molle.setSasia(2000);
			molle.addKategoria(kategoriA);
		} catch (CostumException e) {
			System.out.println(e.getMessage());
		}

	}
}
