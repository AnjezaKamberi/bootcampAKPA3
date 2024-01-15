package bootcampAKPA3.abstragimi.nderfaqet.impl;

import bootcampAKPA3.abstragimi.nderfaqet.NderfaqeE;
import bootcampAKPA3.abstragimi.nderfaqet.NderfaqeF;

public class KlaseImplementueseEF implements NderfaqeE, NderfaqeF {

	@Override
	public void metodaAbstrakte(String parametri1) {
		System.out.println("implementim i metodes abstrakte me parameter " + parametri1);
	}

	@Override
	public void metodaAbstrakte(String parametri1, int parametri2) {
		System.out.println("mbishkrim metoda me dy param");
	}
}
