//Shahzodjon Ismatov (110518374)
public class MaxOdd {
	public static int maxOdd(int [] list){
		return maxOdd(list, 0);
	}
	
	public static int maxOdd(int [] list, int i){
		if(i == list.length)
			return 1;
		int maxRest = maxOdd(list, i+1);
		if(list[i] % 2 == 1 && maxRest<list[i])
			return list[i];
		else
			return maxRest;
	}
	
	public static void main(String [] args){
		int list [] = {2,3,5,6};
		int maxOdd = maxOdd(list);
		System.out.println(maxOdd);
	}

}
