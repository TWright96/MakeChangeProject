import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

//System.out.println(25.3 % 25);
		double cost = 0;
		double tender = 0;
		int change = 0;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("What is the price of the item you're buying?: ");
			cost = sc.nextDouble();
			System.out.println("How much money are you giving the cashier?: ");
			tender = sc.nextDouble();

			if (tender < cost) {
				String cheaper = " ";
				System.out.println(
						"ERROR: This is not enough money to purchase this item. \nWould you like to buy a cheaper item?:");
				cheaper = sc.next();

				if (cheaper.equals("yes")) {
					continue;
				}

				if (cheaper.equals("no")) {
					System.out.println("Goodbye!");
					break;
				}
			}

			else if (tender > cost) {

				System.out.println("This is enough to purchase this item.");
				change = (int)((tender - cost) * 100);
				
				System.out.println("Your change is $" + (tender - cost) + ".");


				if (change / 2000 > 0) {
					int twentys = (change / 2000);
					change = change % 2000;
					System.out.println("Twenties: " + twentys);
				}


				if (change / 1000 > 0) {
					int tens = (change / 1000);
					change = change % 1000;
					System.out.println("Tens: " + tens);
				}


				if (change / 500 > 0) {
					int fives = (change / 500);
					change = change % 500;
					System.out.println("Fives: " + fives);
				}

				if (change / 100 > 0) {
					int dollars = (change / 100);
					change = change % 100;
					System.out.println("Dollars: " + dollars);
				}

				if (change / 25 > 0) {
					
					int quartersMath = (change /25);
					change = change % 25;
					System.out.println("Quarters: " + quartersMath);
					// System.out.println("QuartersMath" + quartersMath);
				}

				if (change / 10 > 0) {
					int dimesMath = ((change/ 10 ));
                     change = change % 10;
					
					 System.out.println("DimeMath" + dimesMath);
				}

				
				if (change / 5 >0) {
					int nickles = (change / 5);
					change = (change % 5);
					System.out.println("Nickles: " + nickles);
					 
				}
				
				
				if (change / 1 > 0) { 
					int pennies = (change / 1);
					change = (change % 1);
				System.out.println("Pennies: " + pennies);
	
}
				
				
				
			
				
				

				String ask = " ";

				System.out.println("Would you like to purchase another item?: ");
				ask = sc.next();

				if (ask.equals("yes")) {

					continue;
				}
				if (ask.equals("no")) {
					System.out.println("Thanks for shopping. \nGoodbye!");
					break;

			}

			} else if (tender == cost) {
				String ask = " ";
				System.out.println("This is the exact amount to purchase this item.");
				System.out.println("Would you like to purchase another item? :");
				ask = sc.next();
				
				if (ask.equals("yes")) {

					continue;
				}
				if (ask.equals("no")) {
					System.out.println("Thanks for shopping. \nGoodbye!");
					break;
			}
		} 
		sc.close();
		
	} while (cost >= 0);
	}
}

