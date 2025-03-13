package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzerTest {

	private FizzBuzzer jeu;

	@BeforeEach
	void setUp() throws Exception {
		jeu = new FizzBuzzer();
	}

	@Test
	void testDebutPartie() {
		assertEquals("1", jeu.next());

	}

}
