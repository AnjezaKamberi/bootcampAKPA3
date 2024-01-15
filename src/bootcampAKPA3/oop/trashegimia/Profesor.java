package bootcampAKPA3.oop.trashegimia;

public class Profesor extends Person {

	private String lenda;

	public Profesor() {
		super("emer prof", "mbiemer prof", "nid prof");
	}

	public Profesor(String emri, String mbiemri, String nid, String lenda) {
		super(emri, mbiemri, nid);
		this.lenda = lenda;
	}

	public String getLenda() {
		return lenda;
	}

	public void setLenda(String lenda) {
		this.lenda = lenda;
	}

	public void dorezoPlan() {
		System.out.println("Plani mesimor per lenden " + lenda);
	}

}
