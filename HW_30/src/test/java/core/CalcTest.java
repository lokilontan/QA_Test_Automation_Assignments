package core;


import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	//ADD
static double add(double a, double b) {return a+b;}
static double add(double a, double b, double c) {return a+b+c;}
static double add(double a, double b, double c, double d) {return a+b+c+d;}
	//SUBSTRACT
static double substract(double a, double b) {return a-b;}
static double substract(double a, double b, double c) {return a-b-c;}
static double substract(double a, double b, double c, double d) {return a-b-c-d;}
	//MULTIPLY
static double multiply(double a, double b) {return a*b;}
static double multiply(double a, double b, double c) {return a*b*c;}
static double multiply(double a, double b, double c, double d) {return a*b*c*d;}
	//DIVIDE
static double divide(double a, double b) {return a/b;}
static double divide(double a, double b, double c) {return a/b/c;}
static double divide(double a, double b, double c, double d) {return a/b/c/d;}

@Test
public void  test_01() {assertEquals("Not correct", divide(90.0, 7.0, 2.0), 6.4, 0.09);}
@Test
public void test_02() {assertEquals("Not correct", add(200.0, 12.7), 212.7, 0.09);}
@Test 
public void test_03() {assertEquals("Not correct", substract(1000.0, 278.7, 1.2, 55.0), 665.1, 0.09);}
@Test
public void test_04() {assertEquals("Not correct", multiply(91.9, 3.7), 340.0, 0.09 );}
}
