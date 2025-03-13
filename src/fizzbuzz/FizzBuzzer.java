package fizzbuzz;

public class FizzBuzzer {

	private static int MAGIC_NUMBER_FIZZ = 3;
	private static String MAGIC_KEY_FIZZ = "fizz";
	private static int MAGIC_NUMBER_BUZZ = 5;
	private static String MAGIC_KEY_BUZZ = "buzz";
	private int tour = 1;

	public String next() {
		if (tour == MAGIC_NUMBER_FIZZ) {
			tour++;
			return MAGIC_KEY_FIZZ;
		}
		if (tour == MAGIC_NUMBER_BUZZ) {
			tour++;
			return MAGIC_KEY_BUZZ;
		}
		return String.format("%d", tour++);
	}

}
