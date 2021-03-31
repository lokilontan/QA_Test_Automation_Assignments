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



public class Add3ParameterizedTest {

	@Parameters(name = "Parameter # {index}: {1} + {2} + {3} = {0}")
	public static Collection<Double[]> addNumbers() {
		return Arrays.asList(new Double[][] {
			{15.5, 2.0, 3.0, 10.5},
			{200.9, 48.2, 52.0, 100.7},
			{-72.0, -34.0, -40.0, 2.0},
			{25.0, 5.0, 19.0, 1.0},
			
		});
		
	}
	
	@Parameter(value = 0) public Double expected;
	@Parameter(value = 1) public Double first;
	@Parameter(value = 2) public Double second;
	@Parameter(value = 3) public Double third;
	
	@Test
	public void add() {
		System.out.println(first + " + " + second + " + " + third + " = " + expected);
		assertEquals("Not correct", Calculator.add(first, second, third), expected, 0.09);
		
	}
	
}
