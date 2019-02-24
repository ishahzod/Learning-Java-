//Shahzodjon Ismatov (110518374)
import java.util.*;
public class IdenticalArrays {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the 1st Array (first # is the size): ");
		int n = in.nextInt();
		int list1 [] = new int[n];
		for(int i=0; i<n; i++)
			list1[i] = in.nextInt();
		System.out.print("Enter the 2nd Array (first # is the size): ");
		n = in.nextInt();
		int list2 [] = new int[n];
		for(int i=0; i<n; i++)
			list2[i] = in.nextInt();
		System.out.println("Are the arrays identical? " + equals(list1, list2));
		
	}
	
	public static boolean equals(int list1 [], int list2 []){
		if(list1.length != list2.length)
			return false;
		for(int i = 0; i< list1.length; i++)
			if(list1[i] != list2[i])
				return false;
		return true;
	}

}
