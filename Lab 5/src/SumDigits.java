//Shahzodjon Ismatov (110518374) 
import java.util.*;
public class SumDigits {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		long n = i.nextInt(); 
		System.out.print("Sum of the digits: " + sumDigits(n));
	}

	public static int sumDigits(long n){
		int sum = 0;
		int temp = (int) Math.abs(n);
	
		while(temp != 0){
		sum += (temp % 10);
		temp /= 10;
	}
		if(n < 0)    //if the user entered a negative number
		return -sum; 
		else return sum;
	}
}
