//Shahzodjon Ismatov (110518374)
public class ReverseDisplay {
	public static void reverseDisplay(String s){
		reverseDisplay(s, s.length()-1);
	}
	
	public static void reverseDisplay(String s, int p){
		if(p ==-1)
			return;
		System.out.print(s.charAt(p));
		reverseDisplay(s, p-1);
	}

	public static void main(String[] args) {
		reverseDisplay("Haha");

	}

}
