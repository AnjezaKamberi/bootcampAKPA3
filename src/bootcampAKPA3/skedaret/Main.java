package bootcampAKPA3.skedaret;

public class Main {

	public static void main(String[] args) {
		varArgsMethod();
		varArgsMethod("Param1");
		varArgsMethod("Param1", "Param2");
		varArgsMethod("Param1", "Param2", "Param3");
	}

	public static void varArgsMethod(String... parametra) {
		for (String param : parametra) {
			System.out.println("Parametri : " + param);
		}
	}
}
