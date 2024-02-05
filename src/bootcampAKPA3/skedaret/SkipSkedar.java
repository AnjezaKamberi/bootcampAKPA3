package bootcampAKPA3.skedaret;
import java.io.FileReader;

public class SkipSkedar {

	public static void main(String[] args) {

		try (FileReader file = new FileReader("C:\\Users\\akamberi\\shembullReader.txt")) {
			int index;
			file.skip(2);
			while ((index = file.read()) != -1) {
				System.out.print((char) index);
			}
		} catch (Exception exception) {
			System.out.println("Skedari nuk gjendet!");
		}
	}
}
