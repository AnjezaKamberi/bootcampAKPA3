package javabootcamp.oop.trashegimia;

// IS A Person , klase femije, klase e derivuar, subklase e Person
public class Student extends Person {

	private String kursi;

	public String getKursi() {
		return kursi;
	}

	public void setKursi(String kursi) {
		this.kursi = kursi;
	}

	public void paguajKurs() {
		System.out.println("Studenti " + getEmri() + " pagoi te gjitha kestet!");
	}

	@Override
	public void voto() {
		System.out.println(getEmri() + " votoi per senatin e shkolles");
		super.voto();
	}

}
