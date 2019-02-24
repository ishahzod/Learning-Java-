//Shahzodjon Ismatov (110518374)
import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.print("Enter integer n: ");
		int n = i.nextInt();
		displayPattern(n);
	}

	public static void displayPattern(int n){
		for(int i=1; i<=n; i++){
			for(int j = i; j>0; j--){
				System.out.print(" " + j);
			}
			System.out.println();
		}
	}
}
