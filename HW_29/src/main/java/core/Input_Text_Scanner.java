package core;

import java.io.*;
import java.util.Scanner;

public class Input_Text_Scanner {
	public static void main(String[] args) throws FileNotFoundException {
		
		//String file args[0];
		
		File filename = new File("input.txt");
		Scanner s = new Scanner(filename);
		while (s.hasNext()) {
			
			String first_name = s.next();
			String last_name = s.next();
			System.out.println("Full name is: " + first_name + " " + last_name);
					
		}
		s.close();
		
 	}

}
