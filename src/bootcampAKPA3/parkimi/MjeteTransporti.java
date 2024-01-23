package bootcampAKPA3.parkimi;

import java.time.LocalDateTime;

public abstract class MjeteTransporti {
	private String targa;
	private String marka;
	private int cmimParkimi;
	private LocalDateTime kohaHyrje;

	public MjeteTransporti(String targa, String marka) {
		this.targa = targa;
		this.marka = marka;
		this.kohaHyrje = LocalDateTime.now();

	}

	public MjeteTransporti() {
		this.targa = "00000";
		this.marka = "unknown";

	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	abstract int price();
}
