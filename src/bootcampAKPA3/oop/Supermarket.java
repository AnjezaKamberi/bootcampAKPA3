package bootcampAKPA3.oop;

import java.util.*;

public class Supermarket {

	static int njesi;
	String emri;
	String adresa;
	String numerKontakti;
	int vitiHapjes;
	List<String> produkte;

	// konstruktori no-args
	public Supermarket() {
		emri = "Supermarket";
		adresa = "";
		numerKontakti = "";
		vitiHapjes = 2024;
		produkte = new ArrayList<>();
	}

	// konstruktori me parametra
	public Supermarket(String emri, String adresa) {
		this();
		this.emri = emri;
		this.adresa = adresa;
	}

	public Supermarket(String emriSupermarket, String adresaSupermarket, int vitiHapjesSupermarket) {
		this(emriSupermarket, adresaSupermarket);
		vitiHapjes = vitiHapjesSupermarket;
	}

	
	public Supermarket(String emri, String adresa, String numerKontakti, int vitiHapjes, List<String> produkte) {
		//super();
		this.emri = emri;
		this.adresa = adresa;
		this.numerKontakti = numerKontakti;
		this.vitiHapjes = vitiHapjes;
		this.produkte = produkte;
	}

	public String merrAdrese() {
		return adresa;
	}

	public void shtoProdukte(String produktNew) {
		System.out.println("Lista e produkteve qe kam:");
		for (String produkt : produkte) {
			System.out.println("Produkti : " + produkt);
		}
		System.out.println("Numri i produkteve para shtimit te produktit te ri: " + produkte.size());
		produkte.add(produktNew);
		System.out.println("Numri i produkteve pas shtimit: " + produkte.size());
	}
}
