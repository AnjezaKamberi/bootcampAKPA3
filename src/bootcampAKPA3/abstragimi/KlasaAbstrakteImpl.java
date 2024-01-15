package bootcampAKPA3.abstragimi;

// implementoj metodat abstrakte brenda klases abstrakte
public class KlasaAbstrakteImpl extends KlasaAbstrakte {

	@Override
	public void metodaDyte() {
		System.out.println("Implementim metoda dyte");
	}

	@Override
	public void metodaTrete(String parametri1) {
		System.out.println("Implementim metoda trete me param " + parametri1);
	}

	@Override
	public String metodaKater() {
		System.out.println("Implementim metoda kater me tip kthimi");
		return "Implementuar";
	}
}
