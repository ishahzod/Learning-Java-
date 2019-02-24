//Shahzodjon Ismatov (110518374)
public class Permutations {

	public static void displayPermutation(String s){
		displayPermutation("",s);
	}

	public static void displayPermutation(String s1, String s2){
		if(s2.equals(""))
			System.out.println(s1);
		for(int i=0; i<s2.length(); i++){
			char c = s2.charAt(i);
			String newS1 = s1 + c;
			String newS2 = s2.substring(0,  i) + s2.substring(i + 1);
			displayPermutation(newS1, newS2);
		}
	}
	public static void main(String[] args) {
		displayPermutation("paul");

	}

}
