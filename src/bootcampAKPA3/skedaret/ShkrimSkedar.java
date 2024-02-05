package bootcampAKPA3.skedaret;

import java.io.File;
import java.io.FileWriter;

public class ShkrimSkedar {

	private static final String SHKRIM_SKEDARI_PATH = "C:\\Users\\akamberi\\shembullWriter.txt";

	public static void main(String[] args) {

		System.out.println("Shkrim skedari");
		File fileIn = new File(SHKRIM_SKEDARI_PATH);
		try (FileWriter file = new FileWriter(fileIn);) {

			if (fileIn.exists()) {
				file.write("Output i ri 456");
				file.flush();
			} else {
				System.out.println("file sdfd");
			}

		} catch (Exception exception) {

			System.out.println("Skedari nuk gjendet!");

		}
	}
}
