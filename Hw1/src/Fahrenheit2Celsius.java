//Shahzodjon Ismatov (110518374)

import java.util.Scanner;

public class Fahrenheit2Celsius {

	public static void main(String[] args) {
			double fahrenheit;
			System.out.print("Enter the degrees in Fahrenheit: ");
			Scanner i = new Scanner(System.in); 
			fahrenheit = i.nextDouble();
			
			final String DEGREE  = "\u00b0";   //unicode for degree symbol
			final double celsius = (fahrenheit - 32)*(5.0/9.0);
		//	System.out.println(fahrenheit + DEGREE + " Fahrenheit is " + celsius + DEGREE +" Celsius");
			System.out.printf("%.2f%s Fahrenheit is %.2f%s Celsius", fahrenheit, DEGREE, celsius, DEGREE);
	}

}
