//Shahzodjon Ismatov (110518374)
import java.util.*;
public class RushHour {
	//0 = empty
	//1,2,3,... = car numbers
	//10 = exit
	int board [][] = new int[6][6];
	
	private int carNum = 1;
	public int round = 0;
	
	private static Scanner in = new Scanner(System.in);
	
	public RushHour(){}
	
	public boolean canMove(int car, int x, int y, int dir, int size){
		//Check if the space is available
		boolean space = true;
		if(dir == 1){ //horizontally
			for(int i = y; i < y + size; i++)
				if(i >= board.length || !(board[x][i] == 0 || board[x][i] == car))
					space = false;
		} 
		else { //vertically
			for(int i = x; i< x + size; i++)
				if(i >= board.length || !(board[i][y] == 0 || board[i][y] == car))
					space = false;
		}
		return space;
	}
	
	public void placeCar(int car, int x, int y, int dir, int size){
		//moving the car
		if(dir == 1){ //moving horizontally
			for(int i = y; i < y + size; i++)
				board[x][i] = car;
		}
		else{ //moving vertically
			for(int i = x; i < x + size; i++){
				board[i][y] = car;
			}
		}
	}
	
	//Generating a random board
	public void randomCars(){
		int i = 0;
		while(i<5){
			int size = (int) (2*Math.random()) + 2;
			int dir = (int) (2*Math.random()) + 1;
			int x, y;
			if(dir == 1) { //horizontal 
				x = (int) (board.length * Math.random());
				if(x == 2) //do not but any more horizontal cars on row 2
					x = 3;
				y = (int) ((board.length - size) * Math.random());
			}
			else{ //vertical
				x = (int) ((board.length - size) * Math.random());
				y = (int) (board.length * Math.random());
			}
			if(canMove(carNum, x, y, dir, size)) {
				placeCar(carNum, x, y, dir, size);
				carNum++;
				i++;
			}
		}
		System.out.println(gameToString());
	}
	
	public void PlacingCars(){
		//placing the first car
		placeCar(1, board.length /2 -1, 0,1,2); 
		carNum++;
		//placing the rest
		System.out.println("Would you like to: \n"
				+ "a)Generate cars randomly \n\t or \n"
				+ "b)Place them as you desire ");
		char choice  = in.nextLine().charAt(0);
		if(choice == 'a'){
			randomCars();
		}
		else if(choice == 'b'){
			System.out.println("Using the instructions, place the cars:");
			while(true){
				System.out.println(gameToString());
				int size = 2;
				do{
					System.out.println("Enter 1 to select a car\n"
							+ "Enter 2 to select a truck\n"
							+ "Enter 0 to finish");
					size = in.nextInt(); 
					if(!(size == 1 && size == 2 && size == 0))
						System.out.println("Invalid size. Please try again.");
				}while(size != 1 && size != 2 && size != 0);
				if(size == 0) { 
					break;
				}
				else{
					System.out.println("Enter 1 to place the vehicle horizontally, 2 to place it vertically");
					int dir = in.nextInt();
					System.out.println("Enter the row (1-6) front of car: ");
					int x = in.nextInt() - 1;
					System.out.println("Enter the column (1-6) rear of car: ");
					int y = in.nextInt() - 1;
					
					if(!canMove(carNum, x, y, dir, size))
						System.out.println("Invalid size. Please try again");
					else{
						placeCar(carNum, x, y, dir, size);
						carNum++;
					}
				}
			}
		}
		
	}
	
	public String gameToString(){
		String s = "Game state: \n" ;
		for(int i = 0; i<board.length; i++){
			for(int j = 0; j<board[i].length; j++){
				//if the position is not the exit
				if(!(i== board.length /2 && j == board[2].length -1) || board[board.length/2][board.length -1] != 0)
					s += board[i][j] + " ";
				else
					s += "* ";
			}
			s += "\n";
		}
		return s;
	}
	
	public void playGame(){
		System.out.println(gameToString());
		System.out.print("Choose a car: ");
		int car = in.nextInt();
		System.out.print("Choose new x: ");
		int x = in.nextInt() - 1;
		System.out.print("Choose new y: ");
		int y = in.nextInt() - 1;
		System.out.println("Direction: ");
		int dir = in.nextInt();
		System.out.print("Size of the car: ");
		int size = in.nextInt();
		moveCar(car, x, y, dir, size);
	}
	
	public void moveCar(int car, int x, int y, int dir, int size){
		if(!canMove(car, x,y,dir,size))
			System.out.println("Invalid position. Please try again.");
		else{
			int oldX = -1;
			int oldY = -1;
			for(int i = 0; i<6; i++)
				for(int j = 0; j < 6; j++)
					if(oldX == -1 && board[i][j] == car){
						oldX = i;
						oldY = j;
					}
			placeCar(0, oldX, oldY, dir, size);
			placeCar(car, x,y,dir, size);
			round++;
		}
	}
	
	public boolean GameOver(){
		if(round <10 && !GameWon())
			return false;
		return true;
	}
	
	public boolean GameWon(){
		if(board[board.length/2 - 1][board.length - 1] == 1)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println("Objective: Move car #1 to the cell labeled *");
		RushHour game = new RushHour();
		game.PlacingCars();
		System.out.println("Start: ");
		while(!game.GameOver()){
			game.playGame();
		}
		System.out.println("\nFinished\nResults: ");
		if(game.GameWon())
			System.out.println("You Won!");
		else
			System.out.println("You lost...");

	}

}
