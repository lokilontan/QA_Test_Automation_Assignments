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



public class Multiply3ParameterizedTest {

	@Parameters(name = "Parameter # {index}: {1} * {2} * {3} = {0}")
	public static Collection<Double[]> addNumbers() {
		return Arrays.asList(new Double[][] {
			{2.0, 5.0, 2.0, 0.2},
			{4400.0, 200.0, 2.0, 11.0},
			{34.0, -34.0, -2.0, 0.5},
			{93.7, 75.0, 5.0, 0.25},
			
		});
		
	}
	
	@Parameter(value = 0) public Double expected;
	@Parameter(value = 1) public Double first;
	@Parameter(value = 2) public Double second;
	@Parameter(value = 3) public Double third;

	
	@Test
	public void multiply() {
		System.out.println(first + " * " + second + " * " + third + " = " + expected);
		assertEquals("Not correct", Calculator.multiply(first, second, third), expected, 0.09);
		
	}
	
}
