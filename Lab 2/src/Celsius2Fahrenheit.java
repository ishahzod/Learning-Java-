//Shahzodjon Ismatov (110518374)

import java.util.*;

public class Celsius2Fahrenheit {

	public static void main(String[] args) {
	double celsius;
	System.out.print("Enter the degrees in Celsius: ");
	Scanner i = new Scanner(System.in); 
	celsius = i.nextDouble();
	
	final String DEGREE  = "\u00b0";   //unicode for degree symbol
	final double fahrenheit = (9.0/5)* celsius + 32; 
	System.out.println(celsius + DEGREE + " Celsius is " + fahrenheit + DEGREE +" Fahrenheit");
	
	}

}
