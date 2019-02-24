//Shahzodjon Ismatov (110518374)
public class Max {
	public static Object max(Object o1, Object o2){
		if(((Comparable)o1).compareTo(o2)>0)
			return o1;
		else 
			return o2;
	}
	
	public static Object max(Object [] a){
		Object max = a[0];
		for(Object o: a)
			max = max(o, max);
		return max;
	}
	
/*	public static void sort(Comparable[] a){
		for(int i = 0; i<a.length; i++){
			Comparable max = a[i];
			int maxIndex = i;
			for(int j = i+1; j< a.length; j++)
				if(max.compareTo(a[i]) <0){
					max = a[i];
					maxIndex = i;
				}
			if(maxIndex != i){
				a[maxIndex]= a[i];
				a[i] = max;
			}
		}
	}
	
	public void main(String [] args) {
		Comparable[] a = {"d", "s", "z"};
		sort(a);
		for(Object o: a){
			System.out.println(o);
		}
	}*/
}
