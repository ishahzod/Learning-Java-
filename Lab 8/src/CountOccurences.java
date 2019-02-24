//Shahzodjon Ismatov (110518374)
import java.util.Scanner;
public class CountOccurences {
	
	public static int count(String str, char a){
		int count = 0; 
		for(char c: str.toCharArray())
			if(c==a)
				count++;
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String:");
		String s = in.nextLine();
		System.out.print("Enter a character you want to find: ");
		char c = in.nextLine().charAt(0);
		
		System.out.println("There are " + count(s, c) + " occurances of the character " + c + " in the string " + s);

	}

}
