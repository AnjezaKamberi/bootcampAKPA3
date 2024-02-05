package bootcampAKPA3.skedaret;

import java.io.*;

public class LeximSkedar {
	private static final String LEXIM_SKEDARI_PATH = "C:\\Users\\AnjezaKamberi\\shembullReader.txt";

	public static void main(String[] args) throws IOException {

		System.out.println("Lexim skedari");

		try (FileReader file = new FileReader(LEXIM_SKEDARI_PATH);) {
			// try (FileReader file = new FileReader("path i gabuar");) {
			int index;
			while ((index = file.read()) != -1) {
				System.out.print((char) index);
			}
		} catch (Exception exception) {
			System.out.println("Skedari nuk gjendet!");
		}

		/*
		 * FileReader file = null; try { file = new
		 * FileReader("C:\\Users\\akamberi\\shembullReader.txt"); } catch
		 * (FileNotFoundException e) {
		 * 
		 * } finally { file.close(); }
		 */

	}
}
