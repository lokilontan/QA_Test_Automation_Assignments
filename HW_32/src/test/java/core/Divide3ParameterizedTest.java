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



public class Divide3ParameterizedTest {

	@Parameters(name = "Parameter # {index}: {1} / {2} / {3} = {0}")
	public static Collection<Double[]> addNumbers() {
		return Arrays.asList(new Double[][] {
			{5.0, 5.0, 2.0, 0.5},
			{4.0, 200.0, 2.0, 25.0},
			{-1.0, -34.0, -2.0, -17.0},
			{-5.0, 75.0, 5.0, -3.0},
			
		});
		
	}
	
	@Parameter(value = 0) public Double expected;
	@Parameter(value = 1) public Double first;
	@Parameter(value = 2) public Double second;
	@Parameter(value = 3) public Double third;
	
	@Test
	public void divide() {
		System.out.println(first + " / " + second + " / " + third + " = " + expected);
		assertEquals("Not correct", Calculator.divide(first, second, third), expected, 0.09);
		
	}
	
}
