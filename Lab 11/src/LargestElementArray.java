//Shahzodjon Ismatov (110518374)

public class LargestElementArray {
	public static int max(int [] a){
		return max(a, 0);
	}
	
	public static int max(int []a, int p){
		//if the array only has 1 element
		if(p == a.length-1)
			return a[a.length-1];
		//if array has more than 1 element
		int restMax = max(a, p+1);
		if(a[p] > restMax)
			return a[p];
		return restMax;
	}

	public static void main(String[] args) {
		int a [] = {1,6,3,4,2,99,5};
		int max = max(a);
		System.out.println(max);

	}

}
