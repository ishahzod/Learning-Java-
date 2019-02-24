//Shahzodjon Ismatov (110518374)

import java.util.*; 

public class Tips {

	public static void main(String[] args) {
	double subtotal, gratuity, total, tip; 
	Scanner i = new Scanner(System.in);
	System.out.print("Enter the subtotal: $");
	subtotal = i.nextDouble();
	
	if(subtotal<30)
	{
		tip = 5; 
		total = tip + subtotal; 
		//System.out.println("The gratuity is $"+ tip +"and the total is $" + total);
		System.out.printf("The gratuity is $%.2f and the total is $%.2f", tip, total);
	}
	else
	{
		tip = subtotal*.15;
		total = tip + subtotal; 
		//System.out.println("The gratuity is $"+ tip +"and the total is $" + total);
		System.out.printf("The gratuity is $%.2f and the total is $%.2f", tip, total);
	}
	
	}

}
