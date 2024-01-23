package bootcampAKPA3.parkimi;

public class Motor extends MjeteTransporti {
	
	public Motor() {
		super();
	}

	public Motor(String targa, String marka) {
		super(targa, marka);
	}

	@Override
	public int price() {
		return 150;
	}
	
}
