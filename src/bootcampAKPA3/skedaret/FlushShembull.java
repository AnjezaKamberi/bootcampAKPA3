package bootcampAKPA3.skedaret;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class FlushShembull {

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("Shkrim skedari");

		try (FileWriter file = new FileWriter("C:\\Users\\akamberi\\shembullWriter.txt")) {
			int iterator = 0;
			while (iterator < 100) {
				file.write("Output i ri");

				if (iterator % 10 == 0) {
					file.flush();
				}
				iterator ++;
			}

		} catch (Exception exception) {

			System.out.println("Skedari nuk gjendet!");

		}
	}
}
