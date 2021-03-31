package core;

public class Main {
static long start;
static long finish;
public static void main(String[] args){
	System.out.println("Browser: HtmlUnit");
	start = System.currentTimeMillis();
	SignUp.validate("http://alex.academy/exe/signup/v1/index.php");
	Confirmation.validate("http://alex.academy/exe/signup/v1/confirmation.php");
	finish = System.currentTimeMillis();
	System.out.println("Response time: "+ (finish - start) + " ms");
	Common.quite();
}
}
