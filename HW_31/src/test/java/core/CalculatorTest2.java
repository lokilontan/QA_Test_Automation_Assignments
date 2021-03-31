package core;

import static org.junit.Assert.*;
import org.junit.*;
 import org.junit.runners.MethodSorters;

 @FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class CalculatorTest2 {

	@Test(timeout=1000)
	public void test_01_add_2() {System.out.println("Test # 01: Add 2 params");
		assertEquals("Not correct", Calculator.add(200.0, 150.0), 350.0, 0.09);}
	
	@Test(timeout=1000)
	public void test_02_add_3() {System.out.println("Test # 02: Add 3 params");
		assertEquals("Not correct", Calculator.add(8.0, 5.0, 7.0), 20.0, 0.09);}
	
	@Test(timeout=1000)
	public void test_03_add_4() {System.out.println("Test # 03: Add 4 params");
		assertEquals("Not correct", Calculator.add(185.3, 0.7, 10.0, 74.0), 270.0, 0.09);}
	
	@Test(timeout=1000)
	public void test_04_divide_2() {System.out.println("Test # 04: Divide 2 params");
		assertEquals("Not correct", Calculator.divide(90.0, 30.0), 3.0, 0.09);}
	
	@Test(timeout=1000)
	public void test_05_divide_3() {System.out.println("Test # 05: Divide 3 params");
		assertEquals("Not correct", Calculator.divide(40.0, 8.0, 2.0), 2.5, 0.09);}
	
	@Test(timeout=1000)
	public void test_06_divide_4() {System.out.println("Test # 06: Divide 2 params");
		assertEquals("Not correct", Calculator.divide(600.0, 50.0, 4.0, 2.0), 1.5, 0.09);}

	@Test(timeout=1000)
	public void test_07_multiply_2() {System.out.println("Test # 07: Multiply 2 params");
		assertEquals("Not correct", Calculator.multiply(9.0, 5.0), 45.0, 0.09);}
	
	@Test(timeout=1000)
	public void test_08_multiply_3() {System.out.println("Test # 08: Multiply 3 params");
		assertEquals("Not correct", Calculator.multiply(20.0, 5.0, 8.0), 800.0, 0.09);}
	
	@Test(timeout=1000)
	public void test_09_multiply_4() {System.out.println("Test # 09: Multiply 4 params");
		assertEquals("Not correct", Calculator.multiply(24.0, 4.0, 10.0, 5.0), 4800.0, 0.09);}
	
	@Test(timeout=1000)
	public void test_10_substract_2() {System.out.println("Test # 10: Substract 2 params");
		assertEquals("Not correct", Calculator.substract(28.0, 14.0), 14.0, 0.09);}
	
	@Test(timeout=1000)
	public void test_11_substract_3() {System.out.println("Test # 11: Substract 3 params");
		assertEquals("Not correct", Calculator.substract(220.0, 20.0, 120.0), 80.0, 0.09);}
	
	@Test(timeout=1000)
	public void test_12_substract_4() {System.out.println("Test # 12: Substract 4 params");
		assertEquals("Not correct", Calculator.substract(400.0, 150.0, 50.0, 45.0), 155.0, 0.09);}

}
