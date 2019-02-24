//Shahzodjon Ismatov (110518374)
import java.util.*;
public class Partition {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the list: ");
		String s = in.nextLine();
		String [] elements = s.split(" ");
		int [] a = new int[elements.length];
		for(int i = 0; i<elements.length; i++)
			a[i] = Integer.parseInt(elements[i]);

		int p = partition(a);

		System.out.println("After the partition, the list is ");
		for(int x:a)
			System.out.print(x+ " ");
		System.out.println("\nPositiion of pivot " + a[p] + " is " + p);
	}

	public static int partition(int [] list){
		int pivot = list[0];
		int [] newList = new int[list.length];
		int low = 0;
		int	high = list.length - 1;

		for(int i = 1; i<list.length; i++)
			if(pivot>list[i])
				newList[low++] = list[i];
			else
				newList[high--] = list[i];
		newList[low] = pivot;

		for(int i=0; i<list.length; i++)
			list[i] = newList[i];
		return low;
	}
}
