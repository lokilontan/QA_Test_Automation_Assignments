package core;

public class PrimeNumberChecker {
	public static boolean validate(int number) {
		int i=0;
		for (i=2; i<number;i++) {
			if (number % i == 0) {return false;}}
		return true;
		
	}

}
