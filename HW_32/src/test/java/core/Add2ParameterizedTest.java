package core;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)



public class Add2ParameterizedTest {

	@Parameters(name = "Parameter # {index}: {1} + {2} = {0}")
	public static Collection<Double[]> addNumbers() {
		return Arrays.asList(new Double[][] {
			{5.0, 2.0, 3.0},
			{100.0, 48.0, 52.0},
			{-74.0, -34.0, -40.0},
			{24.0, 5.0, 19.0},
			
		});
		
	}
	
	@Parameter(value = 0) public Double expected;
	@Parameter(value = 1) public Double first;
	@Parameter(value = 2) public Double second;
	
	@Test
	public void add() {
		System.out.println(first + " + " + second + " = " + expected);
		assertEquals("Not correct", Calculator.add(first, second), expected, 0.09);
		
	}
	
}
