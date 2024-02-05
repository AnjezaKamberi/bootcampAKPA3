package bootcampAKPA3.skedaret;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class MbylljaStream {

	public static void main(String[] args) {

		try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\akamberi\\formulasTable.json");
				BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);) {
			
			System.out.println(bufferedInputStream.read());
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		// perdor wrappers dhe mbyll njeheresh te gjitha stream-et
		try (BufferedInputStream bufferedInputStream = new BufferedInputStream(
				new FileInputStream("C:\\Users\\akamberi\\formulasTable.json"))) {
			
			System.out.println(bufferedInputStream.read());
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
