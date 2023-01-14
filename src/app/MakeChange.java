package app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the cost of the item you are purchasing: ");
		double price = keyboard.nextDouble();

		System.out.print("Enter the amount you're paying with: "); // To get input from the user
		double payment = keyboard.nextDouble();

		if (payment == price) {
			System.out.println("Thank you for your purchase, please come again!"); // They had the exact change
		} else if (payment > 100) {
			System.out.println("Sorry, I don't have change for such big bills."); // Avoid really big bills
		} else if (payment < price) {
			System.out.println("Sorry, that is not enough to pay for the item."); // If they don't have enough money
		}
		else if (payment > price && payment < 100) {
			
		double change = payment - price; // basic equation to calculate their change

		System.out.println("Your change is: " + change); // Show them how much their change is
															// If Payment = $35, Price: $5.99 (change = $29.009)

		int twenty = (int) change / 20; // Casting changes double 29.009 to (int) so 29 / 20 = 1
		change = change - (20 * twenty); // change = 29 - (20 x 1) = 9 So change = 9

		int ten = (int) change / 10; // 9 / 10 = 0
		change = change % 10; // change % 0 = 0

		int five = (int) change / 5; // change is still 9 so 9 / 5 = 1
		change = change - (5 * five); // 9 - (5 x 1) = 4 So change = 4
										// Calculate how many bills and coins they will get back??????????
		int one = (int) change / 1;
		change = change - (1 * one); // How to separate coins/decimals from the whole numbers
		change = (int)((change + .005) * 100);

		int quarter = (int) change / 25; // How to round the coins/decimals to the next higher or lower number
		change = change - (25 * quarter);
		
		int dime = (int) change / 10;
		change = change - (10 * dime);

		int nickel = (int) change / 05;
		change = change - (5 * nickel);

		int penny = (int) change / 1;
		change = change - (1 * penny);
		

		System.out.println("You will get " + twenty + " twenties.");

		System.out.println("You will get " + ten + " tens.");

		System.out.println("You will get " + five + " fives.");

		System.out.println("You will get " + one + " ones.");

		System.out.println("You will get " + quarter + " quarters."); // Show them how many bills/coins they will get

		System.out.println("You will get " + dime + " dimes.");

		System.out.println("You will get " + nickel + " nickels.");

		System.out.println("You will get " + penny + " pennies.");
		
		}

		keyboard.close();

	}

}
//		
//	
// If payment is more than the price - give change back to customer
// Return $20, $10, $5, $1, .25, .10, .05, .01
