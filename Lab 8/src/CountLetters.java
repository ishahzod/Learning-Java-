//Shahzodjon Ismatov (110518374)
import java.util.*;
public class CountLetters {

	public static int countLetters(String s){
		int count = 0;
		for(char c: s.toCharArray())
			if(Character.isAlphabetic(c))
				count++;
		return count;
	}

	public static void main(String[] args) {
/*		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String:");
		String s = in.nextLine();
		System.out.println("There are " +countLetters(s) + " letters in this string");*/
		
		System.out.println(countLetters("Java in 2017"));

	}

}
