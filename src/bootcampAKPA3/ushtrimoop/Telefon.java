package bootcampAKPA3.ushtrimoop;

public abstract class Telefon {

	private String kompaniProdhuese;
	private int vitProdhimi;
	
	public Telefon(int vitProdhimi) {
		this();
		this.vitProdhimi=vitProdhimi;
	}
	

	public Telefon(String kompaniProdhuese, int vitProdhimi) {
		super();
		this.kompaniProdhuese = kompaniProdhuese;
		this.vitProdhimi = vitProdhimi;
	}

	public Telefon() {

		this.kompaniProdhuese = "xxx";
		this.vitProdhimi = 2000;
	}

	public String getKompaniProdhuese() {
		return kompaniProdhuese;
	}

	public void setKompaniProdhuese(String kompaniProdhuese) {
		this.kompaniProdhuese = kompaniProdhuese;
	}

	public int getVitProdhimi() {
		return vitProdhimi;
	}

	public void setVitProdhimi(int vitProdhimi) {
		this.vitProdhimi = vitProdhimi;
	}
	public abstract void autentifikohu();
	public void degjoAudio() {
		System.out.println("Po degjoj audio ne nje telefon");
	}
	
	@Override
	public String toString() {
		return this.kompaniProdhuese+" "+this.vitProdhimi;
	}
	@Override
	public boolean equals(Object obj) {
		Telefon t = (Telefon)obj;
		return this.getKompaniProdhuese().equals(t.getKompaniProdhuese())
				&&this.getVitProdhimi()==t.getVitProdhimi();
			
	}

}
