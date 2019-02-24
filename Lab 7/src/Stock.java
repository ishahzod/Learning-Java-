//Shahzodjon Ismatov (110518374)
public class Stock {
	private String symbol, name;
	private double previousClosingPrice, currentPrice;
	
	public Stock(){
	}
	
	public Stock(String s, String n, double p, double c){
		this.symbol = s;
		this.name = n;
		this.previousClosingPrice = p;
		this.currentPrice = c;
	}
	
	public String getSymbol(){
		return symbol;
	}
	
	public String getName(){
		return name;
	}
	
	public double getClosingPrice(){
		return previousClosingPrice;
	}
	
	public double getCurrentPrice(){
		return currentPrice;
	}
	
	public double getChangePercent(){
		double change = Math.abs(((previousClosingPrice  - currentPrice)/currentPrice)*100);
		return change;
	}
	
	public static void main(String [] args){
		Stock a = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
		
		System.out.printf("Symbol: %s \nName: %s \nClosingPrice: $%.2f \nCurrentPrice: $%.2f \nPrice-change Percent: %.2f%%", a.getSymbol(), a.getName(), a.getClosingPrice(), a.getCurrentPrice(), a.getChangePercent());
	}

}
