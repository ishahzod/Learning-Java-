//Shahzodjon Ismatov (110518374)
import java.util.*;
public class Combinations {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter 10 integers: ");
		int a [] = new int[10];
		for(int i = 0; i<a.length; i++)
			a[i] = in.nextInt();
		
		System.out.println("Combinations of 2: ");
		for(int i = 0; i<a.length - 1; i++)
			for(int j = 0; j <a.length - 1; j++)
				System.out.println(a[i] + " " + a[j]);
	}

}
