//Shahzodjon Ismatov (110518374)

import java.util.*;  //imports the entire util package 

public class ChangeMaker {
	private static Scanner input;

	public static void main(String[] args) {
		int change, rem, qs, ds, ns, ps;
		System.out.println("Input change amount (1-99): ");
		input = new Scanner(System.in);
		change = input.nextInt();
		qs = change / 25;
		rem = change % 25;
		ds = rem / 10;
		rem = rem % 10;
		ns = rem /5;
		rem = rem % 5;
		ps = rem; 
		
		System.out.print(qs + " quarters, " + ds + " dimes, ");
		System.out.println(ns + " nickels, and " + ps + " pennies");
		
	}
}
