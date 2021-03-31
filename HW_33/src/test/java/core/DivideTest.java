package core;

import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class DivideTest {
	
	@Test
	public void divide_test_instanceOf() {
		assertThat(Calculator.divide(2.0, 2.0), instanceOf(Double.class));		
	}
	
	@Test 
	public void divide_test_2_param() {
		assertThat(Calculator.divide(4.0, 2.0), closeTo(2.0, 0.09));
	}
	
	@Test
	public void divide_test_3_param() {
		assertThat(Calculator.divide(8.0, 4.0, 2.0), closeTo(1.0, 0.09));
	}
	
	@Test
	public void divide_test_4_param() {
		assertThat(Calculator.divide(16.0, 4.0, 2.0, 2.0), closeTo(1.0, 0.09));
	}
	
}