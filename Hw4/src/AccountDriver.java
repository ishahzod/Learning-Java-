//Shahzodjon Ismatov (110518374)
public class AccountDriver {

	public static void main(String[] args) {
		Account a = new CheckingAccount();
		
		a.setId(1122);
		a.setAnnualInterestRate(4.5);
		a.setBalance(20000);
		a.deposit(3000);
		a.withdraw(2500);
		
		System.out.println("Account ID: " + a.getId() + "\n"
							+ "Previous Balance: $" + a.getBalance() + "\n"
							+ "Interest Rate " + a.getAnnualInterestRate() + "%"+ "\n"
							+ "Monthly Interest: $" + a.getMonthlyInterest() + "\n"
							+ "Date Created: " + a.getDateCreated());

	}

}
