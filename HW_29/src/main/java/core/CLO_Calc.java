package core;

import com.beust.jcommander.*;
import java.math.*;
import java.util.*;

public class CLO_Calc {
	
	// Operator
	@Parameter(names = { "-o", "--operator" }, description = "Operator")
	static String operator = null;
	
	// Operand
	@Parameter(names = { "-n", "--operands" }, variableArity = true, description = "List of operands")
	static List<Double> operands = new ArrayList<Double>();
	
	public static void main (String[] args) {
		
		for  (String a: args) {if(a.matches("[@#&]")){
			System.err.println("Invalid characters"); System.exit(0);}}
		
		  //CLO_Calc clo_calc = new CLO_Calc(); 
		  
		 // JCommander jCommander = new JCommander(clo_calc);
		  //try {
		    //jCommander.parse(args);
		  //} catch (ParameterException e) {
		    //System.err.println(e.getMessage());
		    //jCommander.usage();
		    //System.exit(1);
		  //}
		  
		  //JCommander.newBuilder()
         //.addObject(clo_calc)
         //.build()
         //.parse(args);
		
		JCommander.newBuilder().addObject(new CLO_Calc()).build().parse(args);
		
		//new JCommander(clo_calc, args);
		
		if (operator == null || !operator.matches("[+-/*/]")) {
			System.out.println("Please specify the operator + - * /");
		}	else if (operands.size() == 0) {System.err.println("List of operands is empty");}
		else {
			Double result = operands.get(0);
			for (int i = 1; i<operands.size(); i++) {
				switch (operator) {
				case "+": result += operands.get(i); break; 
				case "-": result -= operands.get(i); break; 
				case "*": result *= operands.get(i); break; 
				case "/": result /= operands.get(i); break;
				}
			}
			System.out.println(new BigDecimal(result).setScale(2, RoundingMode.HALF_UP));
		}
	
	
	}
}
