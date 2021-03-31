package core;

import java.io.*;
import java.util.*;

public class Input_PF {
	public static void main (String[] args) throws IOException{
		
		// String file = args[0];
		Properties p = new Properties();
		p.load(new FileInputStream("./input.properties"));
		
		String first_car = p.getProperty("first_car");
		String friends_name = p.getProperty("frends_name");
		String favorite_color = p.getProperty("favorite_color");
		System.out.println("You are driving your " + favorite_color + " " + first_car + " with your friend " + friends_name);
		
	}

}
