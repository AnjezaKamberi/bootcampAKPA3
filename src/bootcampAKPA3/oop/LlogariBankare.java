package bootcampAKPA3.oop;

public class LlogariBankare {

	// 1.
	// percaktoj access modifier private per
	// karakterisitkat e llogarise bankare
	private String autor;
	private double balance;
	private int vitHapjes;
	private boolean llogariAktive;

	public LlogariBankare(String autor, double balance, int vitHapjes) {
		this.autor = autor;
		this.balance = balance;
		this.vitHapjes = vitHapjes;
	}

	// 2.
	// krijoj metoda qe lexojne vleren e karakteristikave
	public String getEmer() {
		System.out.println("Emri i autorit eshte " + autor);
		return autor;
	}

	// metoda get per te lexuar emrin e autorit te llogarise bankare
	public String getAutor() {
		return this.autor;
	}

	// metoda set per te modifikuar emrin e autorit te llogarise bankare
	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isLlogariAktive() {
		return llogariAktive;
	}

	public void setLlogariAktive(boolean llogariAktive) {
		this.llogariAktive = llogariAktive;
	}

}
