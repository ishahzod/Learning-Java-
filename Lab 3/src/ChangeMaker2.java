
//Shahzodjon Ismatov (110518374)

import java.util.Scanner;

public class ChangeMaker2 {
	public static void main(String[] args) {
		double price, given, change;
		int rem, qs, ds, ns, ps, twenties, tens, fives, ones;
		System.out.print("Price: $");
		Scanner input = new Scanner(System.in);
		price = input.nextDouble();
		System.out.print("From: $");
		given = input.nextDouble();
		change = given - price;
		rem = (int) (change * 100);

		twenties = rem / 2000;
		rem = rem % 2000;
		tens = rem / 1000;
		rem = rem % 1000;
		fives = rem / 500;
		rem = rem % 500;
		ones = rem / 100;
		rem = rem % 100;
		qs = rem / 25;
		rem = rem % 25;
		ds = rem / 10;
		rem = rem % 10;
		ns = rem / 5;
		rem = rem % 5;
		ps = rem;

		if (twenties != 0)
			System.out.println(twenties + " x $20 bills");
		if (tens != 0)
			System.out.println(tens + " x $10 bills");
		if (fives != 0)
			System.out.println(fives + " x $5 bills");
		if (ones != 0)
			System.out.println(ones + " x $1 bills");
		if (qs != 0)
			System.out.println(qs + " x 25c coins");
		if (ds != 0)
			System.out.println(ds + " x 10c coins");
		if (ps != 0)
			System.out.println(ps + " x 1c coins");
	}

}
