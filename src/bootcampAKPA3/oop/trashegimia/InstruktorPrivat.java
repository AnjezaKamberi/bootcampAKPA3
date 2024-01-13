package javabootcamp.oop.trashegimia;

public class InstruktorPrivat extends Profesor {

	private String qendraKursit;

	public String getQendraKursit() {
		return qendraKursit;
	}

	public void setQendraKursit(String qendraKursit) {
		this.qendraKursit = qendraKursit;
	}

	public void percaktoOreDisponueshmerie() {
		System.out.println("Oret e disponueshme: 8,9,10 paradite");
	}
}
