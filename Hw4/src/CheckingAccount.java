//Shahzodjon Ismatov (110518374)
public class CheckingAccount extends Account {
	private double overdrawLimit = 75;
	
	public CheckingAccount(){}
	
	public void withdraw(double amount){
		if(amount<= getBalance() + overdrawLimit)
			setBalance(getBalance() - amount);
	}
}
