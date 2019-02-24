//Shahzodjon Ismatov (110518374)
import java.util.*;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;
public class DigitInString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	       String input;
	       int count[] = new int[10];
	       for(int i = 0; i < 10; i++) count[i] = 0;
	       System.out.println("Enter a string:");
	       input = in.nextLine();
	       for(int i = 0; i < input.length(); i++){
	           if(input.charAt(i) >= '0' && input.charAt(i) <= '9'){
	               count[Integer.parseInt(input.charAt(i) + "")]++;
	           }
	       }
	       for(int i = 0; i < 10; i++){
	           System.out.print(count[i] + " " + i);
	           if(count[i] > 1) System.out.print("s");
	           System.out.println();
	       }
	   }
	}
