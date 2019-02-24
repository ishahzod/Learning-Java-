//Shahzodjon Ismatov (110518374)
import java.util.*;
public class FourCards {

	public static void main(String[] args) {
		String[][]cards = new String[52][2];
		int count = 0;

		for(int i=0; i<4; i++){
			//Conditional Statement using ? and :
			String suit = i==0 ? "Hearts": (
					i==1 ? "Diamonds":(
							i==2 ? "Clubs" : "Spades"));

			for(int j=1; j<=13; j++){
				cards[count][0] = suit;
				cards[count++][1] = j==1 ? "Ace" : (
						j<11 ? ""+j : (
								j == 11 ? "Jack" : (
										j == 12 ? "Queen" : "King" )));
			}
		}

		//picking 4 cards
		int[] selected = new int[4];
		int i = 0, sum = 0;
		while(i<selected.length){
			int p = (int) (Math.random()*cards.length);

			boolean seen = false;
			for(int j=0; j<i; j++)
				if(selected[j] == p){
					seen = true;
					break;
				}
			if(seen) 
				continue;
			sum += cards[p][1].equals("Ace") ? 14 :
				cards[p][1].equals("King") ? 13 :
					cards[p][1].equals("Queen") ? 12 :
						cards[p][1].equals("Jack") ? 11 :
							cards[p][1].charAt(0) - '0'==1 ? 10: 
								cards[p][1].charAt(0) - '0';
			selected[i] = p;
			System.out.println(cards[p][1] + " of " + cards[p][0]);
			i++;
		}
		System.out.println("Sum: " + sum);

	}

}
