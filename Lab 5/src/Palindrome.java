//Shahzodjon Ismatov (110518374)
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = i.nextInt();
		int r = reverse(n);
		System.out.print("Reversed integer: " + r);
		boolean b = isPalindrome(n); 
		System.out.println();
		if(b){
			System.out.println(n + " is a palindrome");
		}
		else{
			System.out.println(n + " is NOT a palindrome");
		}

	}
	public static int reverse(int n){
		int revNum = 0;
		while(n != 0){
			int last = n % 10;
			revNum = revNum * 10 + last; 
			n /= 10; 
	}
		if(n<0) 
			return -revNum; 
		else 
			return revNum;
	}
/*	//Parsing the number to strings unlimits the 3 digit cap
	public static boolean isPalindrome(int n){
		String s = n + "";
		boolean isPalindrome = true;
		
		int first = 0;
		int last = s.length()-1;
		
		while(first < last){
		if(s.charAt(first) != s.charAt(last)){
			isPalindrome = false; 
			return false;
		}
		first ++;
		last --; 
		}
	return isPalindrome;
	}
}
*/
	
	public static boolean isPalindrome(int n){
		return n == reverse(n);
	}
}