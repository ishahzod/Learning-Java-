//Shahzodjon Ismatov (110518374)
public class OccuranceRec {

	public static int count(char[] chars, char ch){
		return count(chars, ch, 0);
	}
	
	public static int count(char[] chars, char ch, int max){
		if(max == chars.length)
			return 0;
		return count(chars, ch, max+1) + (chars[max] == ch ? 1:0);
	}

	public static void main(String[] args) {
		char c[] = new char[]{'c','a','c','t','u','s'};
		System.out.println("Number of occurances of 'c' in 'cactus' is " + count(c, 'c'));

	}
}
