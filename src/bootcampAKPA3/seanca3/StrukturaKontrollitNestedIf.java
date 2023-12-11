package bootcampAKPA3.seanca3;

public class StrukturaKontrollitNestedIf {

	public static void main(String[] args) {

		System.out.println("Fillim struktura kontrolli NESTED IF");
		
		String llojLaptopi = "graphic design";

		if (llojLaptopi.equals("graphic design")) {
			System.out.println("Tipet e laptopeve qe kemi ne gjendje per kete pozicion");
			System.out.println("Laptopi A");
			System.out.println("Laptopi B");
			System.out.println("Laptopi C");
			String tipLaptopi = "Laptopi C";
			if (tipLaptopi.equals("Laptopi A")) {
				System.out.println("Cmimi eshte 1000L");
			} else if (tipLaptopi.equals("Laptopi B")) {
				System.out.println("Cmimi eshte 2500L");
			} else if (tipLaptopi.equals("Laptopi C")) {
				System.out.println("Cmimi eshte 3000L");
			} else {
				System.out.println("Nuk kemi ne gjendje laptop te tille");
			}
		} else {
			System.out.println("Tipet e laptopeve qe kemi ne gjendje per pozicione jo graphic design jane:");
			System.out.println("Laptopi D");
			System.out.println("Laptopi E");
			String tipLaptopi = "Laptopi F";
			if (tipLaptopi.equals("Laptopi D")) {
				System.out.println("Cmimi eshte 2500L");
			} else if (tipLaptopi.equals("Laptopi E")) {
				System.out.println("Cmimi eshte 2500L");
			}
		}

		System.out.println("Fundi struktura kontrollit NESTED IF");
	}
}
