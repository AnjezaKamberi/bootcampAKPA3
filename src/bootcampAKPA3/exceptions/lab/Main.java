package bootcampAKPA3.exceptions.lab;

import java.util.*;

public class Main {

	public static void main(String[] args) { // throws Exception {
		// merrRolPerKlient();
		List<String> emraPunonjes = new ArrayList<>();
		emraPunonjes.add("Elio");
		emraPunonjes.add("Dafjola");
		// MENYRA E PARE
		try {
			printoPunonjes(emraPunonjes);
		} catch (Exception exception) {
			System.out.println("Problemi: " + exception.getMessage());
		}
		// printoPunonjes(null);

		// MENYRA E DYTE (shiko deklarimin e metodes)
	}

	public static void merrRolPerKlient() {
		// menyre JO e sakte e hedhjes se nje exceptioni
		// throw new RoleNotFoundException("Roli nuk ekziston ne programin tone!");
		Set<String> role = new HashSet<>();
		role.add("ADMIN");
		role.add("MAGAZINIER");
		role.add("CUSTOMER");
		System.out.println("Shfaq rolin e perdoruesti ne sistem");
		for (String rol : role) {
			RoleNotFoundException exception = new RoleNotFoundException("Roli nuk ekziston ne programin tone!");
			if (!rol.equalsIgnoreCase("ADMIN") && !rol.equalsIgnoreCase("CUSTOMER")) {

				// menyre e sakte per te hedhur nje exception
				throw new RoleNotFoundException("Roli nuk ekziston ne programin tone!");

				// menyre JO e sakte per te hedhur exception
				// throw new StatusNotFoundException("Roli nuk ekziston ne programin tone!");

				// menyre e sakte per te hedhur nje exception
				// throw exception;
			}
			System.out.println("Roli eshte " + rol);
		}
		System.out.println("Falemnderit! Vazhdoni proceset e tjera!");

	}

	public static void printoPunonjes(List<String> emraPunonjes) throws Exception {

		System.out.println("Filloj printmin e emrave te punonjesve");
		for (int indexPunonjes = 0; indexPunonjes < 5; indexPunonjes++) {
			String emer = emraPunonjes.get(indexPunonjes);
			System.out.println("Emri eshte " + emer);
		}
		System.out.println("Perfundoi printimi i emrave te punonjesve");
	}
}
