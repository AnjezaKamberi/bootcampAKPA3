package bootcampAKPA3.seanca3;

// importo klasen Scanner
import java.util.Scanner;

public class LeximInputi {

	public static void main(String[] args) {

		// krijoj nje objekt te klases Scanner
		Scanner scannerObj = new Scanner(System.in);
		/*
		 * System.out.println("Te lutem me jep emrin tend: "); // lexoj inputin nga
		 * perdoruesi dhe e ruaj te variabli 'emer' String emer = scannerObj.next();
		 * System.out.println("Emri juaj eshte " + emer);
		 * System.out.println("************************************");
		 * System.out.println("Ju lutem jepni moshen tuaj: "); short mosha =
		 * scannerObj.nextShort(); System.out.println("Mosha juaj eshte: " + mosha);
		 * System.out.println("************************************");
		 * System.out.println("Deshironi te regjistroheni ne kursin Java Bootcamp?");
		 * boolean doRegjistrohet = scannerObj.nextBoolean();
		 * System.out.println("Ju keni zgjedhur 'Regjistrim ne Bootcamp?': " +
		 * doRegjistrohet);
		 */

		//kryejVeprimeMatematikore(scannerObj);
		String name = "Dafjola";
		printoEmer(name, true);
	}

	public static void kryejVeprimeMatematikore(Scanner scanner) {
		System.out.println("Jepni numrin e pare: ");
		int numriA = scanner.nextInt();
		System.out.println("Jepni numrin e dyte: ");
		int numriB = scanner.nextInt();

		int shuma = numriA + numriB;
		System.out.println("Shuma e dy numrave esshte " + shuma);
		int differenca = numriA - numriB;
		System.out.println("Diferenca e dy numra eshte " + differenca);
		int produkti = numriA * numriB;
		System.out.println("Produkti i dy numrave eshte " + produkti);

	}

	public static void printoEmer(String emer, boolean eshteMashkull) {
		System.out.println("Ëmri i personit eshte " + emer);
	}
}
