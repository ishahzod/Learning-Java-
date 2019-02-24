//Shahzodjon Ismatov (110518374)

public class AddingNoPlus {
	public static int add(int x, int y){
		return add(0,y,x);
	}
	
	public static int add(int x, int y, int sum){
		if(x<y)
			return add(++x, y, ++sum);
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(add(3,2));

	}
}
