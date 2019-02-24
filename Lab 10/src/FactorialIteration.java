//Shahzodjon Ismatov (110518374)
public class FactorialIteration {

	public static int factorial(int n){
		int product = 1;
		for(int i = 1; i<=10; i++){
			product *= i;
		}
		return product;
	}
	
	public static int factorialRec(int n){
		if(n == 0) 
			return 1;
		return n * factorialRec(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println("Using Loops: " + factorial(10));
		System.out.println("Using Recursion:  " + factorialRec(10));

	}

}
