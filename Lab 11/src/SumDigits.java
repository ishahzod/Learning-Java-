//Shahzodjon Ismatov (110518374)
public class SumDigits {
	public static int sumDigits(int n){
		if(n<10) //There's only one digit, hence sum is that digit
			return n;
		//recursive relation
		return(n%10) + sumDigits(n/10);
	}
	

	public static void main(String[] args) {
		int s = sumDigits(123);
		System.out.println("Sum of the digits:" + s);

	}

}
