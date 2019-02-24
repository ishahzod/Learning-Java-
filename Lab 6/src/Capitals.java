//Shahzodjon Ismatov (110518374)
import java.util.Scanner;
public class Capitals {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String [][] statesAndCapitals = {
			        {"Alabama", "Montgomery"},
			        {"Alaska", "Juneau"},
			        {"Arizona", "Phoenix"},
			        {"Arkansas", "Little Rock"},
			        {"California", "Sacramento"},
			        {"Colorado", "Denver"},
			        {"Connecticut", "Hartford"},
			        {"Delaware", "Dover"},
			        {"Florida", "Tallahasse"},
			        {"Georgia", "Atlanta"},
			        {"Hawaii", "Honolulu"},
			        {"Idaho", "Boise"},
			        {"Illinois", "Springfield"},
			        {"Indiana", "Indianapolis"},
			        {"Iowa", "Des Moines"},
			        {"Kansas", "Topeka"},
			        {"Kentucky", "Frankfort"},
			        {"Louisiana", "Baton Rouge"},
			        {"Maine", "Augusta"},
			        {"Maryland", "Annapolis"},
			        {"Massachusettes", "Boston"},
			        {"Michigan", "Lansing"},
			        {"Minnesota", "Saint Paul"},
			        {"Mississippi", "Jackson"},
			        {"Missouri", "Jefferson City"},
			        {"Montana", "Helena"},
			        {"Nebraska", "Lincoln"},
			        {"Nevada", "Carson City"},
			        {"New Hampshire", "Concord"},
			        {"New Jersey", "Trenton"},
			        {"New York", "Albany"},
			        {"New Mexico", "Santa Fe"},
			        {"North Carolina", "Raleigh"},
			        {"North Dakota", "Bismark"},
			        {"Ohio", "Columbus"},
			        {"Oklahoma", "Oklahoma City"},
			        {"Oregon", "Salem"},
			        {"Pennslyvania", "Harrisburg"},
			        {"Rhode Island", "Providence"},
			        {"South Carolina", "Columbia"},
			        {"South Dakota", "Pierre"},
			        {"Tennessee", "Nashville"},
			        {"Texas", "Austin"},
			        {"Utah", "Salt Lake City"},
			        {"Vermont", "Montpelier"},
			        {"Virginia", "Richmond"},
			        {"Washington", "Olympia"},
			        {"West Virginia", "Charleston"},
			        {"Wisconsin", "Madison"},
			        {"Wyoming", "Cheyenne"}
			       };
		int count = 0;
		for(int i = 0; i<statesAndCapitals.length; i++){
			System.out.print("What is the capital of " + statesAndCapitals[i][0] + "? ");
			String guess = in.nextLine();
			if(guess.equals(statesAndCapitals[i][1])){
				System.out.println("Your guess is correct.");
				count ++;
			}
				else
				System.out.println("Incorrect! The answer is " + statesAndCapitals[i][1]);
		}
		System.out.println("You guessed " + count + " state capitals correctly.\n"
				+ "That is %" + (int)count/50 + " correct.");
	}
}
