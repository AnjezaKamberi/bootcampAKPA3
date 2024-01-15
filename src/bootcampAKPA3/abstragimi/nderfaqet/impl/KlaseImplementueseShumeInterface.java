package bootcampAKPA3.abstragimi.nderfaqet.impl;

import bootcampAKPA3.abstragimi.nderfaqet.NderfaqeD;
import bootcampAKPA3.abstragimi.nderfaqet.NderfaqePare;

public class KlaseImplementueseShumeInterface implements NderfaqeD, NderfaqePare {

	@Override
	public void metodaPare() {
		System.out.println("metoda 1");
	}

	@Override
	public void metodaDyte() {
		System.out.println("metoda 2");

	}

	@Override
	public void metodaTrete() {
		System.out.println("metoda 3");

	}

	@Override
	public String metodaMeParam(String parametri1, int parametri2) {
		System.out.println("metoda 4");
		return "metoda 4";
	}

}
