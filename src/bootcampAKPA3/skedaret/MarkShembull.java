package bootcampAKPA3.skedaret;
import java.io.FileReader;

public class MarkShembull {

	public static void main(String[] args) {

		System.out.println("Lexim skedari");

		try (FileReader file = new FileReader("C:\\Users\\akamberi\\markShembull.txt")) {
			
			int index;
			System.out.println((char) file.read());
			System.out.println("Markimi u startua");
			if (file.markSupported()) {
				file.mark(10);
				System.out.println((char) file.read());
				System.out.println((char) file.read());
				file.reset();
			}
			System.out.println("Markimi u resetua");
			System.out.println((char) file.read());
			System.out.println((char) file.read());
			System.out.println("Skedari u lexua");
		} catch (Exception exception) {
			System.out.println("Skedari nuk gjendet!");
		}
	}
}
