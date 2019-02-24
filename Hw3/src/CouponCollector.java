//Shahzodjon Ismatov (110518374)
public class CouponCollector {

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
		
		boolean[] doneArray = new boolean [4];
		boolean done = false;
		int i = 0;
		
		while(!done){
			//choose a random position
			int p = (int) (Math.random() * cards.length);
			//check if the suit was not taken already
			int suit = cards[p][0].equals("Hearts") ? 0:
				cards[p][0].equals("Diamonds") ? 1:
					cards[p][0].equals("Clubs") ? 2: 3;
			if(!doneArray[suit]){
				System.out.println(cards[p][1] + " of " + cards[p][0]);
				doneArray[suit] = true;
			}
			i++;
			done = doneArray[0] && doneArray[1] && doneArray[2] && doneArray[3];
		}
		System.out.println("Number of picks " + i);

	}

}
