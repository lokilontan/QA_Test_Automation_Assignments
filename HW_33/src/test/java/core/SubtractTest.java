package core;

import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class SubtractTest {
	
	@Test
	public void divide_test_instanceOf() {
		assertThat(Calculator.subtract(2.0, 2.0), instanceOf(Double.class));		
	}
	
	@Test 
	public void divide_test_2_param() {
		assertThat(Calculator.subtract(4.0, 2.0), equalTo(2.0));
	}
	
	@Test
	public void divide_test_3_param() {
		assertThat(Calculator.subtract(8.0, 4.0, 2.0), equalTo(2.0));
	}
	
	@Test
	public void divide_test_4_param() {
		assertThat(Calculator.subtract(16.0, 8.0, 4.0, 2.0), equalTo(2.0));
	}
	
}