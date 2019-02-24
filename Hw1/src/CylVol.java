//Shahzodjon Ismatov (110518374)

import java.util.*;
public class CylVol {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		double radius, length, area, volume;
		System.out.print("Enter the radius and the length of a cylinder: ");
		radius = i.nextDouble(); length = i.nextDouble();
		
		area = radius * radius * Math.PI;
		volume = area*length;
		
//		System.out.println("The area of the cylinder is : " + area);
//		System.out.println("The volume of the cylinder is : " + volume);
		
		System.out.printf("The area of the cylinder is %.2f \nThe volume of the cylinder is %.2f", area, volume);
		i.close();
	}

}
