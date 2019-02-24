//Shahzodjon Ismatov (110518374)
import java.util.*;
public class Avg {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		int positives = 0, negatives = 0, sum = 0, total = 0, n;
		float avg; 
		System.out.println("NOTE: Input terminates when you enter 0");
		System.out.print("Enter an integer:");
		do{
			n = i.nextInt();
	
			sum += n; 
			if(n<0) {
				negatives++;
			}
			else if(n>0){
				positives++;
			}
		}while(n != 0); 
		total = positives + negatives;
		avg = (float) sum / total; 
		System.out.println("# of positives counted: " + positives);
		System.out.println("# of negatives counted: " + negatives);
		System.out.println("Sum: " + sum);
		System.out.println("Total count: " + total);
		System.out.println("Calculated Average: " + avg);
	}
}