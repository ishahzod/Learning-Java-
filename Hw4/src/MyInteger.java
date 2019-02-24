//Shahzodjon Ismatov (110518374)
public class MyInteger {
	private int value;
	
	public MyInteger(int value){
		this.value = value;
	}
	
	public int getValue(){
		return value;
	}
	
	public boolean isEven(){
		return value%2 == 0;
	}
	
	public boolean isOdd(){
		return value%2 == 1;
	}
	public boolean isPrime(){
		for(int i = 2; i<value; i++)
			if(value%i == 0)
				return false;
		return true;
	}
	
	public static boolean isEven(int v){
		return v%2 == 0;
	}
	
	public static boolean isOdd(int v){
		return v%2 == 1;
	}
	public static boolean isPrime(int v){
		for(int i = 2; i<v; i++)
			if(v%i == 0)
				return false;
		return true;
	}
	
	public static boolean isEven(MyInteger o){
		return o.value%2 == 0;
	}
	
	public static boolean isOdd(MyInteger o){
		return o.value%2 == 1;
	}
	public static boolean isPrime(MyInteger o){
		return isPrime(o.value);
	}
	
	public boolean equals(Object o){
		if(o instanceof MyInteger)
			return value == ((MyInteger)o).value;
		return false;
	}
	
	public boolean equals(int n){
		return value == n;
	}
	
	public String toString(){
		return "MyInteger: value=" + value;
	}
	
	public static int parseInt(String s){
		char[] numbers = s.toCharArray();
		int value = 0;
		for(int i = 0; i < numbers.length; i++){
			if(Character.isDigit(numbers[i]))
			value += Math.pow(10, numbers.length - (i+1)) * (numbers[i] - 48); 
			else
				System.out.println("Non-digit symbol detected. The parsed string may differ from the real value.");
		}
		return value; 
	}
	
	
	
	public static void main(String[] args) {
		MyInteger o = new MyInteger(42);
		//MyInteger s = new MyInteger("42");
		
	//	String s = new String("546");
		//nonstatic
		System.out.println(o.isEven());
		System.out.println(o.isOdd());
		System.out.println(o.isPrime());
		//static
		System.out.println(isEven(o));
		System.out.println(isOdd(o));
		System.out.println(isPrime(o));
		
		System.out.println(o.equals(42));
		
		System.out.println(o.equals(o));
		System.out.println(o.toString());
		
		
		//Instructions were unclear. So I just parsed a random string of numbers 
		System.out.println("Parsed string: " + parseInt("687"));
		
	}

}
