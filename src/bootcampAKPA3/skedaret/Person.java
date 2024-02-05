package bootcampAKPA3.skedaret;
import java.io.Serializable;

public class Person implements Serializable {

	private String emri;
	private String mbiemri;
	private transient String password;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Person [emri=" + emri + ", mbiemri=" + mbiemri + "]";
	}

}
