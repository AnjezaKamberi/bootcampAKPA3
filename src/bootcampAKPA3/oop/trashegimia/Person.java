package bootcampAKPA3.oop.trashegimia;

public class Person {

	private String emri;
	private String mbiemri;
	private String nid;

	/*
	 * public Person() { super(); }
	 */

	public Person() {
		this.emri = "emer ";
		this.mbiemri = "mbiemer ";
		this.nid = "nid ";
	}

	public Person(String emri, String mbiemri, String nid) {
		this.emri = emri;
		this.mbiemri = mbiemri;
		this.nid = nid;
	}

	public String getEmri() {
		return emri;
	}

	public void setEmri(String emri) {
		this.emri = emri;
	}

	public String getMbiemri() {
		return mbiemri;
	}

	public void setMbiemri(String mbiemri) {
		this.mbiemri = mbiemri;
	}

	public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	public void voto() {
		System.out.println(emri + " votoi!");
	}

}
