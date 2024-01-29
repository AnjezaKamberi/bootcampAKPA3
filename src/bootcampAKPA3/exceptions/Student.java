package bootcampAKPA3.exceptions;

public class Student {

	private String emri;
	private String mbiemri;

	public Student(String emri, String mbiemri) {
		super();
		this.emri = emri;
		this.mbiemri = mbiemri;
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

	@Override
	public String toString() {
		return "Student [emri=" + emri + ", mbiemri=" + mbiemri + "]";
	}

}
