package bootcampAKPA3.abstragimi;

public class Main {

	public static void main(String[] args) {

		// tentoj te krijoj nje objekt te klases abstrakte
		// KlasaAbstrakte objekt = new KlasaAbstrakte();

		// krijoj nje objekt duke perdorur klasen implementuese
		KlasaAbstrakteImpl objekt = new KlasaAbstrakteImpl();
		objekt.metodaDyte();
		objekt.metodaPare();
	}
}
