package bootcampAKPA3.exceptions.shembull.adela;

import java.util.ArrayList;
import java.util.List;

public class Produkt {

	private String emri;
	private double cmimi;
	private double sasia;
	private List<String> kategoria;

	public Produkt() {
		this.kategoria = new ArrayList<>();
	}

	public Produkt(String emri, double cmimi, double sasia) {
		this();
		this.emri = emri;
		this.cmimi = cmimi;
		this.sasia = sasia;
	}

	public String getEmri() {
		return emri;
	}

	public void setEmri(String emri) {
		this.emri = emri;
	}

	public double getCmimi() {
		return cmimi;
	}

	public void setCmimi(double cmimi) {
		this.cmimi = cmimi;
	}

	public double getSasia() {
		return sasia;
	}

	public void setSasia(double sasia) {
		this.sasia = sasia;
	}

	public List<String> getKategoria() {
		return kategoria;
	}

	public void setKategoria(List<String> kategoria) {
		this.kategoria = kategoria;
	}

	public void shtoNeListe() {
		kategoria.add("Argjend");
		kategoria.add("Flori");

	}

	public void ktheCmimin(double cmimi) throws CustomException {
		if (cmimi > 50000) {
			throw new CustomException("Cmimi eshte me i madh se 50000. ");

		}
		System.out.println("Cmimi i produktit eshte: " + cmimi);
	}

	public void ktheSasine(double sasia) throws CustomException {
		if (sasia <= 100 && sasia > 0) {
			System.out.println("Sasia e produktit eshte: " + sasia);
		} else {
			throw new CustomException("Sasia nuk eshte e sakte ");
		}
	}

	public void shtoNeKategori(String produkti) throws CustomException {
		for (String kategori : kategoria) {
			if (kategori.equalsIgnoreCase(produkti)) {
				throw new CustomException("Produkti është shtuar më herët në këtë kategori.");
			}
		}
		this.kategoria.add(produkti);
		System.out.println("Produkti u shtua. ");
	}

	@Override
	public String toString() {
		return "Produkt [emri=" + emri + ", cmimi=" + cmimi + ", sasia=" + sasia + ", kategoria=" + kategoria + "]";
	}

}
