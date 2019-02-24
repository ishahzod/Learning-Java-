//Shahzodjon Ismatov (110518374)

public class Kilo2Pound {
	public static void main(String [] args)
	{
		final double kilo2pound = 2.2; 
		System.out.println("Kilograms     Pounds");
		for(int i=1; i<=200; i++)
		{
			System.out.printf("%d \t      %.2f\n", i, i*kilo2pound);
		}
	}
}
