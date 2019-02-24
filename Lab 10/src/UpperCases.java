//Shahzodjon Ismatov (110518374)
public class UpperCases {
	
	public static int upperCases(String s) {
		return upperCases(s, 0);
	}
	
	public static int upperCases(String s, int max){
		if(max == s.length())
			return 0;
		return upperCases(s, max+1) + (Character.isUpperCase(s.charAt(max)) ? 1 : 0);
	}

	public static void main(String[] args) {
		System.out.println("There are " + upperCases("Java RuLes!!") + " uppercase letters in the phrase 'Java RuLes!!'");

	}

}
