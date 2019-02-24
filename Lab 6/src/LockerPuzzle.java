//Shahzodjon Ismatov (110518374)
public class LockerPuzzle {

	public static void main(String[] args) {
		//every locker is false(closed)
		boolean [] locker = new boolean[100];
		for(int student = 0; student <locker.length; student++){
			for(int i = student; i <locker.length; i+= student+1)
				locker[i] = ! locker[i]; 
		}
		System.out.println("Open lockers are: ");
		for(int i = 0; i<locker.length; i++)
			if(locker[i])
				System.out.println((i+1) + " ");
	}

}
