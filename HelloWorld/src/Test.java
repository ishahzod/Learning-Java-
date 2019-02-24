
//public class Shortcuts {
	
	//Indent Ctrl+Shift+F
	//Comment block Ctrl+/ or Ctrl + Shift + C
	//sysout Ctrl + space
	
	
// Binary	    System.out.println(0B1111); // Displays 15   
// Octal 	    System.out.println(07777); // Displays 4095 
// Hexadecimal	System.out.println(0XFFFF); // Displays 65535
	
// Current Time    System.currentTimeMillis(); 

//}


/*import java.util.*;
public class Shortcuts{
	public static void main(String []args){
		Scanner i = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		String name = i.next();
		System.out.print("Enter number of hours worked in a week: ");
		double hours = i.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double pay = i.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double fedtax = i.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double statetax = i.nextDouble();
		
		double gross = pay*hours;
		double fedW = fedtax*100;
		double stateW = statetax*100;
		double total = fedW + stateW;
		double Net = gross - total; 
		
		System.out.println("Employee Name: " + name + "\n");
		System.out.println("Hours Worked:  " + hours);
		System.out.println("Pay Rate:  $" + pay);
		System.out.println("Gross Pay:  $" + gross);
		System.out.println("Deductions:");
		System.out.println("  Federal Withholding (" + (fedtax*100) + "%):  $" + fedW);
		System.out.println("  State Withholding (" + (statetax*100) + "%):  $" + stateW);
		System.out.println("  Total Deduction:  $" + total);
		System.out.println("Net Pay:   $" + Net);
	}
}*/


/*public class Test {
public static void main(String[] args) {
char x = 'a';
char y = 'c';
System.out.println(++x);
System.out.println(y++);
System.out.println(x - y);
}
}*/


/*public class TrianglePattern{
	public static void main(String [] args){
		int n = 10;
		for(int i=1; i<=n; i++){
			for(int j = 1; j<=i; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}*/

/*public class Test{
	public static void main(String [] args){
		//double x = (int) (14/4 - 2.5 +1);
		int x = -2;
		int y = (x++) + (++x);
		System.out.println('A' + 1);
		System.out.println(y);
		
		boolean even = false; 
		System.out.println(even ? "true" : "false");
	}
}*/

import java.util.*;
public class Test{
	public static void main(String []args){
		Scanner i = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		String name = i.next();
		System.out.print("Enter number of hours worked in a week: ");
		double hours = i.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double pay = i.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double fedtax = i.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double statetax = i.nextDouble();
		
		double gross = pay*hours;
		double fedW = gross/(fedtax*100);
		double stateW = gross/(statetax*100);
		double total = fedW + stateW;
		double Net = gross - total; 
		
		System.out.println("Employee Name: " + name + "\n");
		System.out.println("Hours Worked:  " + hours);
		System.out.println("Pay Rate:  $" + pay);
		System.out.println("Gross Pay:  $" + gross);
		System.out.println("Deductions:");
		System.out.println("  Federal Withholding (" + (fedtax*100) + "%):  $" + fedW);
		System.out.println("  State Withholding (" + (statetax*100) + "%):  $" + stateW);
		System.out.println("  Total Deduction:  $" + total);
		System.out.println("Net Pay:   $" + Net);
	}
}


			
			
			
			
			
			