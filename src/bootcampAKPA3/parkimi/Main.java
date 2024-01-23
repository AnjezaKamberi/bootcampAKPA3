package bootcampAKPA3.parkimi;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		/*
		 * Map<String ,Double> obj = new HashMap<>(); obj.put("Key 1", 12.0);
		 * obj.put("Key 2", 14.0);
		 * 
		 * System.out.println(obj.get("Key 2"));
		 */

		ParkimiAirAlbania parkim = new ParkimiAirAlbania();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Shtyp 1 nese doni te shtoni nje mjet transporti ne parkim!");
		int n = scanner.nextInt();
		if (n == 1) {
			System.out.println("Vendos te dhenat e mjetit te transportit:");
			MjeteTransporti m = null;
			System.out.println("Me jep targen, marken, llojin e makines te ndara me nje vize nga njera tjetra.");
			String teDhena = scanner.next();
			// TR001-BMW-Makine
			String[] teDhenaSplit = teDhena.split("-");
			String targa, marka, mjetiTransportit;
			targa = teDhenaSplit[0];
			marka = teDhenaSplit[1];
			mjetiTransportit = teDhenaSplit[2];
			switch (mjetiTransportit) {
			case "Makine":
				m = new Makine(targa, marka);
				break;
			case "Motorr":
				m = new Motor(targa, marka);
				break;
			case "Kamion":
				m = new Kamioni(targa, marka);
				break;
			}
			parkim.shtoMjetTransportiNeParkim(m);

		}
	}
}
