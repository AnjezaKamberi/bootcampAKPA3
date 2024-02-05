package bootcampAKPA3.exceptions.shembull.celdo;

import java.util.HashSet;
import java.util.Set;

public class Produkt {
	private String emri;
	private float cmimi;
	private int sasia;
	private Set<Kategori> kategoria;

	public Produkt() {
		this.kategoria = new HashSet<>();
	}

	public Produkt(String emri, float cmimi, int sasia) throws CostumException {
		this();
		checkInput(cmimi, sasia);
		this.emri = emri;
		this.cmimi = cmimi;
		this.sasia = sasia;
	}

	public void checkInput(float cmimi, int sasia) throws CostumException {
		String temp = "";
		boolean foundSmth = false;
		if (cmimi > 5000) {
			foundSmth = true;
			temp += "Cmimi nuk mund te jete mbi 5000! ";
		}
		if (sasia < 0 || sasia > 100) {
			foundSmth = true;
			temp += "Sasia e vendosur nuk mund te pranohet! Saasia duhet te jete > 0 dhe <100";
		}
		if (foundSmth) {
			throw new CostumException(temp);
		}
	}

	public void checkInput(float cmimi) throws CostumException {
		checkInput(cmimi, this.sasia);
	}

	public void checkInput(int sasia) throws CostumException {
		checkInput(this.cmimi, sasia);
	}

	public String getEmri() {
		return emri;
	}

	public void setEmri(String emri) {
		this.emri = emri;
	}

	public float getCmimi() {
		return cmimi;
	}

	public void setCmimi(float cmimi) throws CostumException {
		checkInput(cmimi);
		this.cmimi = cmimi;
	}

	public float getSasia() {
		return sasia;
	}

	public void setSasia(int sasia) throws CostumException {
		checkInput(sasia);
		this.sasia = sasia;
	}

	public Set<Kategori> getKategoria() {
		return kategoria;
	}

	public void addKategoria(Kategori a) throws CostumException {
		for (Kategori kategori : kategoria) {
			if (kategori.equals(a)) {
				throw new CostumException("Ky element eshte tashme pjese e kesaj kategorie!");
			}
		}
		this.kategoria.add(a);
	}

	public void removeKategoria(Kategori a) {
		this.kategoria.remove(a);
	}

	@Override
	public String toString() {
		return this.emri + " " + this.sasia + " " + this.cmimi;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Produkt) {
			return this.cmimi == ((Produkt) o).getCmimi();
		}
		return false;
	}
}
