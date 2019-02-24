//Shahzodjon Ismatov (110518374)
public class Miles2Kilometers {

	public static void main(String[] args) {
		
		final double miles2km = 1.609;
		System.out.println("Miles   Kilometers");
		for(int i = 1; i<=10; i++)
		{
			System.out.printf("%d \t   %.3f\n", i, i*miles2km);
		}
	}
}
