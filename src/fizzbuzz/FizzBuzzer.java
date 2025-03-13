package fizzbuzz;

public class FizzBuzzer {

	private int tour = 1;

	public String next() {
		return String.format("%d", tour++);
	}

}
