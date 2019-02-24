//Shahzodjon Ismatov (110518374)

import java.util.*;
public class Feet2Meters {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.print("Enter a value in feet: ");
		double feet = i.nextDouble();
		
		final double meters = feet * 0.305;
		
		System.out.printf("%.2f feet is %.2f meters", feet, meters);

	}

}
