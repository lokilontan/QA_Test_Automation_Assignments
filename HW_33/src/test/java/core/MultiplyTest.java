package core;

import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class MultiplyTest {
	
	@Test
	public void divide_test_instanceOf() {
		assertThat(Calculator.multiply(2.0, 2.0), instanceOf(Double.class));		
	}
	
	@Test 
	public void divide_test_2_param() {
		assertThat(Calculator.multiply(4.0, 2.0), equalTo(8.0));
	}
	
	@Test
	public void divide_test_3_param() {
		assertThat(Calculator.multiply(8.0, 4.0, 2.0), equalTo(64.0));
	}
	
	@Test
	public void divide_test_4_param() {
		assertThat(Calculator.multiply(16.0, 8.0, 4.0, 2.0), equalTo(1024.0));
	}
	
}