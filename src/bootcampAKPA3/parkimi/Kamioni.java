package bootcampAKPA3.parkimi;

public class Kamioni extends MjeteTransporti {

	public Kamioni() {
		super();
	}

	public Kamioni(String targa, String marka) {
		super(targa, marka);
	}

	@Override
	public int price() {
		return 500;
	}

	@Override
	public String toString() {
		return "Kamioni [price()=" + price() + ", getTarga()=" + getTarga() + ", getMarka()=" + getMarka()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
