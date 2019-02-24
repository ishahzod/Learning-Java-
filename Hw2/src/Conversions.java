// Shahzodjon Ismatov (11018374) 
import java.util.*;
public class Conversions {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char choice;
		
		System.out.print("Enter Your Option: \n"
				+ "A - convert pounds to kilos \n"
				+ "B - convert kilos to pounds \n"
				+ "C - convert kilometers to miles \n"
				+ "D - convert miles to kilometers \n"
				+ "E - Exit \n");
		do{ choice = in.next().charAt(0);
	
	
		//Input validation 
		if(!(Character.isAlphabetic(choice)) || Character.isDigit(choice)){
			System.out.println("Invalid input. Please try again.");
			main(null);
		}
		else 
		
		switch(Character.toUpperCase(choice))
		{
		case 'A': 
		{
			System.out.print("Enter a quantity in pounds: ");
			double pounds = in.nextDouble();
			System.out.print("Conversion in Kilograms: " + pounds2Kilos(pounds) + "\n");
			break;
		}
		case 'B':
		{
			System.out.print("Enter a quantity in kilograms: ");
			double pounds = in.nextDouble();
			System.out.print("Conversion in Pounds: " + kilos2Pounds(pounds) + "\n");
			break;
		}
		case 'C':
		{
			System.out.print("Enter the distance in KiloMeters: ");
			double kms = in.nextDouble();
			System.out.print("Distance in Miles: : " + km2M(kms) + "\n");
			break;
		}
		case 'D':
		{
			System.out.print("Enter the distance in Miles: ");
			double kms = in.nextDouble();
			System.out.print("Distance in KiloMeters: : " + m2Km(kms) + "\n");
			break;
		}
		case 'E': System.out.println("You have exited the program"); break; 
		
		}
	
		}while(choice != 'E'); 
		
	}
	
	public static double pounds2Kilos(double pounds){
		final double pound2kilo = 0.453592;
		double kilos = pounds * pound2kilo;
		
		return kilos;
	}
	
	public static double kilos2Pounds(double kilos)
	{
		final double kilo2pound = 2.2; 
		double pounds = kilos * kilo2pound;
		
		return pounds;
	}
	
	public static double km2M(double kms){
		final double km2miles = 0.621371;
		double miles = kms * km2miles;
		
		return miles;
	}
	
	public static double m2Km(double m){
		final double m2km = 1.609;
		double km = m * m2km;
		
		return km;
	}
}


