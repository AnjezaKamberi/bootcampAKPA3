package bootcampAKPA3.parkimi;

public class Makine extends MjeteTransporti {
	public Makine(String targa, String marka) {
		super(targa, marka);
	}

	@Override
	public int price() {
		return 200;
	}

	@Override
	public String toString() {
		return "Makine [price()=" + price() + ", getTarga()=" + getTarga() + ", getMarka()=" + getMarka() + "]";
	}

}
