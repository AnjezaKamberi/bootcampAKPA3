package javabootcamp.oop;

public class Main {

	public static void main(String[] args) {
		System.out.println("test");
		LlogariBankare llogariBankare = new LlogariBankare("Aterda", 100, 2023);

		String emriAutor = llogariBankare.getEmer();
		System.out.println(emriAutor);

		// therrit metoden get per balancen
		System.out.println("Balanca aktuale(para modifikimit) : " + llogariBankare.getBalance());
		// therrit metoden set per balancen
		// MODIFIKIM JO I SAKTE I BALANCES
		double balance = llogariBankare.getBalance();
		balance = 300;
		System.out.println("Balance " + balance);
		System.out.println("Balanca (pas modifikimit jo te sakte) : " + llogariBankare.getBalance());

		// MODIFIKIM I SAKTE I BALANCES SE LLOGARISE BANKARE
		llogariBankare.setBalance(balance);
		System.out.println("Balanca (pas modifikimit) : " + llogariBankare.getBalance());

	}
}
