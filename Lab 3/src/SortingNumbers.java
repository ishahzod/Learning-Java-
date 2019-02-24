//Shahzodjon Ismatov (110518374)
import java.util.*;
public class SortingNumbers {

	public static void main(String[] args) {
	Scanner i = new Scanner(System.in);
	System.out.println("Enter the 3 numbers you want to sort: ");
	int num1 = i.nextInt();
	int num2 = i.nextInt();
	int num3 = i.nextInt();
	
	if(num1>num2){
		int temp = num1;
		num1 = num2;         //assigns the value of num1 to num2
		num2 = temp;         //num2 is now the smallest number 
	}
	if(num2>num3){           //comparing num2 to num3 
		int temp = num2;
		num2 = num3;         //if num2>num3, then assigns value of num2 to num3    
		num3 = temp;         //num3 is now the smallest number
	}
	if(num1>num2){
		int temp = num1;
		num1 = num2;
		num2 = temp;						
	}
	System.out.println("Sorted numbers are: " + num1 + " " + num2 + " " + num3);
	}
}