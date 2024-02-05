package bootcampAKPA3.skedaret;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializimShembull {

	public static void main(String[] args) {

		System.out.println("Lexim skedari");

		try (ObjectOutputStream file = new ObjectOutputStream(
				new FileOutputStream(new File("C:\\Users\\akamberi\\serializimShembull.txt")))) {

			Person person = new Person();
			person.setEmri("emri");
			person.setMbiemri("mbiemri");

			file.writeObject(person);

		} catch (Exception exception) {
			System.out.println("Skedari nuk gjendet!" + exception.getMessage());
		}

		try (ObjectInputStream file = new ObjectInputStream(
				new FileInputStream(new File("C:\\Users\\akamberi\\serializimShembull.txt")))) {
			Object o = file.readObject();
			if (o instanceof Person) {
				Person person = (Person) file.readObject();
				System.out.println(person.toString());
			}
		} catch (Exception exception) {
			System.out.println("Skedari nuk gjendet!" + exception.getMessage());
		}
	}

}
