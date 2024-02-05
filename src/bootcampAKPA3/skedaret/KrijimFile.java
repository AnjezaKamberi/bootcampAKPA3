package bootcampAKPA3.skedaret;

import java.io.File;

public class KrijimFile {

	public static void main(String[] args) {

		File file1 = new File("C:\\Users\\akamberi");
		System.out.println("Skedari 'akamberi' ekziston? " + file1.exists() + "\n");

		File parentFile = new File("C:\\Users\\akamberi");
		System.out.println("Skedari 'akamberi' ekziston? " + parentFile.exists() + "\n");

		File file2 = new File(parentFile, "formulasTable.json");
		System.out.println("Skedari 'formulasTable.json' ekziston? " + file2.exists() + "\n");

		File file3 = new File("C:\\Users\\akamberi", "formulasTable.json");
		System.out.println("Skedari 'formulasTable.json' ekziston? " + file3.exists() + "\n");

		File file4 = new File("C:\\Users\\AnjezaKamberi");
		System.out.println("Skedari 'AnjezaKamberi' ekziston? " + file4.exists() + "\n");

	}
}
