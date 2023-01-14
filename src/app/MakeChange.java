package app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the cost of the item you are purchasing: ");
		double price = keyboard.nextDouble();

		System.out.print("Enter the amount you're paying with: ");
		double payment = keyboard.nextDouble();

		if (payment == price) {
			System.out.println("Thank you for your purchase, please come again!");
		} else if (payment > 20) {
			System.out.println("Sorry, I don't have change for such big bills.");
		} else if (payment < price) {
			System.out.println("Sorry, that is not enough to pay for the item.");
		}
		
		double change = payment - price;
		
		System.out.println("Your change is: " + change);
		
		int twenty = (int)change / 20;
		int ten = (int)change / 10;
		int five = (int)change / 5;
		int one = five / 1;
		int quarter = one / 25;
		int dime = quarter / 10;
		int nickel = dime / 5;
		int penny = nickel / 1;
		
	
			System.out.println("You will get " + twenty + "'s twenties.");
		
			System.out.println("You will get " + ten + " tens.");
		
			System.out.println("You will get " + five + " fives.");
	
			System.out.println("You will get " + one + " ones.");
	
			System.out.println("You will get " + quarter + " quarters.");
		
			System.out.println("You will get " + dime + " dimes.");
		
			System.out.println("You will get " + nickel + " nickels.");
	
			System.out.println("You will get " + penny + " pennies.");
		
		keyboard.close();

	}

}
//		
//		change = (change + .005) *100;
//		System.out.println((int)changeAmt);
//	
	// If payment is more than the price - give change back to customer
	// Return $20, $10, $5, $1, .25, .10, .05, .01
