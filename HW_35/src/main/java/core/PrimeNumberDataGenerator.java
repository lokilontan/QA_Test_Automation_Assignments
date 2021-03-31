package core;

public class PrimeNumberDataGenerator {
	public static void main (String[] args)
	{
		for (int i = 2; i<=101; i++) {
			System.out.println("TC-"+((i<10) ? ("0"+(i-1)):(+(i-1))) +" ("+(i)+" is " + 
		    ((PrimeNumberChecker.validate(i)) ? "a prime number)," : "not a prime number),")+i+","+PrimeNumberChecker.validate(i));
		}
	}
}
