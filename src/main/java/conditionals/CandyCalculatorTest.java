package conditionals;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CandyCalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void ChocolateShouldBe75Cents() {
		CandyCalculator calc = new CandyCalculator();
		double actual = calc.calculate("CHOCOLATE", 1);
		assertEquals(.75, actual, 0.0);
	}

	@Test
	public void TaffeyShouldBe40Cents() {
		CandyCalculator calc = new CandyCalculator();
		double actual = calc.calculate("TAFFY", 1);
		assertEquals(.4, actual, 0.0);
	}

	@Test
	public void GumShouldBe35Cents() {
		CandyCalculator calc = new CandyCalculator();
		double actual = calc.calculate("GUM", 1);
		assertEquals(.35, actual, 0.0);
	}

	@Test
	public void HardCandyShouldBe25Cents() {
		CandyCalculator calc = new CandyCalculator();
		double actual = calc.calculate("HARD", 1);
		assertEquals(.25, actual, 0.0);
	}
}
