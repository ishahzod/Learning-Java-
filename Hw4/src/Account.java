//Shahzodjon Ismatov (110518374)
public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private java.util.Date dateCreated;
	
	public Account(){
		dateCreated = new java.util.Date();
	}
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	public double getMonthlyInterest(){
		return balance*(this.annualInterestRate/100)/12;
	}
	
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	
	public void withdraw(double amount){
		if(amount<=balance)
			balance -= amount;
	}
	
	public void deposit(double amount){
		if(amount > 0)
			balance += amount;
	}

}
