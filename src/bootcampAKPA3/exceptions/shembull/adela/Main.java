package bootcampAKPA3.exceptions.shembull.adela;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Produkt produkt = new Produkt();

		List<String> kategoria = new ArrayList<>();
		kategoria.add("argjend");

		produkt.setKategoria(kategoria);
		produkt.setCmimi(3.5);
		produkt.setEmri("unaze");
		produkt.setSasia(2.4);

		try {
			produkt.ktheCmimin(100000.0);
		} catch (CustomException e) {
			System.out.println("Cmimi eshte me i madh se 50000. ");
		}

		try {
			produkt.ktheSasine(1000000.0);
		} catch (CustomException e) {
			System.out.println("Sasia nuk eshte e sakte. ");
		}

		try {
			produkt.shtoNeKategori("argjend");
		} catch (CustomException e) {
			System.out.println("Produkti është shtuar më herët në këtë kategori. ");
		}

		System.out.println(produkt.toString());

	}

}
