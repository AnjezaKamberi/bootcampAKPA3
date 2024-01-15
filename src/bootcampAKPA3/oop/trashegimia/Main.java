package bootcampAKPA3.oop.trashegimia;

public class Main {

	public static void main(String[] args) {

		System.out.println("Krijoj nje person");
		Person elio = new Person();
		System.out.println(elio.getEmri());
		System.out.println("Krijoj nje student");
		// elio.paguajKurs(); nuk kompilohet
		Student bora = new Student();
		bora.setEmri("Bora");
		bora.voto();
		System.out.println("Emri i studentit eshte: " + bora.getEmri());
		bora.paguajKurs();

		InstruktorPrivat instruktorPrivatObj = new InstruktorPrivat();
		System.out.println(instruktorPrivatObj.getEmri());
		instruktorPrivatObj.voto();
		System.out.println(instruktorPrivatObj.getLenda());
		instruktorPrivatObj.setQendraKursit("ikub");
		System.out.println(instruktorPrivatObj.getQendraKursit());
		
		
	}

}
