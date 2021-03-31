package core;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Input_ISR {
	public static void main (String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your first name: ");
		String first_name = br.readLine();
		System.out.print("Enter youl last name: ");
		String last_name = br.readLine();
		System.out.println("Your full name is: " + first_name + " " + last_name);
		br.close();
	}

}
