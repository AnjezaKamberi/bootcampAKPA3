package bootcampAKPA3.abstragimi.nderfaqet.impl;

import bootcampAKPA3.abstragimi.nderfaqet.NderfaqePare;

public class KlaseImplementuese implements NderfaqePare {

	@Override
	public void metodaPare() {
		System.out.println("metoda pare");
	}

	public void metodaDyte() {
		System.out.println("metoda dyte");
	}

	public void metodaTrete() {
		System.out.println("metoda trete");
	}

	public String metodaMeParam(String parametri1, int parametri2) {
		return "implementuar";
	}

}
