//Shahzodjon Ismatov (110518374)
public class SumSquares {
	public static int sumSquares(int i, int n){
		if(i<=n)
			return i*i + sumSquares(i+1, n);
		else 
			return 0;
	}
	public static void main(String [] args){
		System.out.println(sumSquares(2,4));
		
	}
}
