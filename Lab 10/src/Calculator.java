//Shahzodjon Ismatov(110518374)	

import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		if(args.length != 3){
			System.out.println("Please invoke the program as follows: java Calculator operand1 operand2 (no more than 2)");
			return;
		}
		
		double x=0, y=0;

		try{
			x = Double.parseDouble(args[0]);
		}catch(Exception e){
			System.out.println("Operand 1 was not a number.");
			return;
		}

		try{
			y = Double.parseDouble(args[2]);
		}catch(Exception e){
			System.out.println("Operand 2 was not a number.");
			return;
		}

		switch(args[1].charAt(0)){
		case '+': System.out.println(x + " + " + y + " = " + (x+y)); break;
		case '-': System.out.println(x + " - " + y + " = " + (x-y)); break;
		case '*': System.out.println(x + " * " + y + " = " + (x*y)); break;
		case '/':
			if(y!=0)
				System.out.println(x + " / " + y + " = " + (x/y));
			else{
				System.out.println("Division by 0 is illegal");
			} break;
		default: System.out.println("Operation "+args[1]+" is not suported");
		}
	}
}
