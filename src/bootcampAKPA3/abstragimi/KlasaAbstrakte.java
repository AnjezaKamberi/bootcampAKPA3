package bootcampAKPA3.abstragimi;

// definoj nje klase abstrakte
public abstract class KlasaAbstrakte {

	private void metodePrivate() {
		System.out.println("Implementimi metoda pare");
	}

	public void metodaPare() {
		metodePrivate();
		System.out.println("Implementimi metoda pare");
	}

	// metode abstrakte
	public abstract void metodaDyte();

	// metode abstrakte me parametra
	public abstract void metodaTrete(String parametri1);

	// metode abstrakte me tip kthimi
	public abstract String metodaKater();

	// metode abstrakte dhe final
	// public abstract final void metodaPese();

	// metode abstrakte dhe private
	// private abstract void metodaGjashte();
}
