//Shahzodjon Ismatov (110518374)
import java.util.*;
public class ChineseZodiac {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = in.nextInt();

		String [] zodiac = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};
		
		int p = year % 12;
		
		System.out.println(year + " is the year of the " + zodiac[p]);

	}
}
