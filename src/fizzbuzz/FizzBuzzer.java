package fizzbuzz;

public class FizzBuzzer {

	private static int MAGIC_NUMBER = 3;
	private static String MAGIC_KEY = "fizz";

	private int tour = 1;

	public String next() {
		if (tour == MAGIC_NUMBER) {
			tour++;
			return MAGIC_KEY;
		}
		return String.format("%d", tour++);
	}

}
