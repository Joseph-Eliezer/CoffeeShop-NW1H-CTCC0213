import java.util.Scanner;

public class coffeeShop {

	static Scanner scanner = new Scanner(System.in);

    // Variables to keep track of total prices
	static int totalCoffeePrice = 0;
	static int totalBakeryPrice = 0;
	static int totalIcedCoffeePrice = 0;

    // Arrays to store menu items and their prices
	static String[] coffeeNames = {
		"1. Java Burst",
		"2. Espresso",
		"3. Caramel Sah",
		"4. Hazelnut Brnt",
		"5. Vanilla Vel"
	};
	static int[] coffeePrice = {
		59,
		69,
		79,
		89,
		99
	};
	static String[] icedCoffeeNames = {
		"1. Frosty Mdelight",
		"2. Icy Caramel",
		"3. Chilled Vliss",
		"4. Cold Blixir",
		"5. Cool Hazelnt"
	};
	static int[] icedCoffeePrice = {
		45,
		55,
		65,
		75,
		85
	};
	static String[] bakeryNames = {
		"1. Crisp Crusts",
		"2. Sweet Byte",
		"3. Dough Joy",
		"4. Zest Bites",
		"5. Flourish Hub"
	};
	static int[] bakeryPrice = {
		39,
		59,
		69,
		79,
		99
	};
    
    // Variables to store user choices and indices
	static int indexCoffee;
	static int indexThird;
	static String bakeryOption;

	// Welcome message
	public static void main(String[] args) {
		System.out.println("____________________________________________________________");
		System.out.println();
		System.out.println("                      ELIE COFFEE SHOP             ");
		System.out.println("                      ===============             ");
		System.out.println();
		System.out.println("____________________________________________________________");
		System.out.println();
		System.out.println();
		System.out.println("                          |1|Menu                 ");
		System.out.println("                          |2|Order                  ");
		System.out.println("                          |3|Exit                  ");
		int choice = validateInput("                           Choose: ", 1, 3);
		switch (choice) {
		case 1:
			chooseMenu();
			break;

		case 2:
			orderOrExit();
			break;

		case 3:
			System.out.println("\n                         Thank you!");
			scanner.close();
			System.exit(0);
		}
	}

	// list of coffee you can order
	static void chooseMenu() {
		try {
			System.out.println();
			System.out.println("____________________________________________________________");
			System.out.println();
			Thread.sleep(250);
			System.out.println("____________________________________________________________");
			System.out.println();
			Thread.sleep(250);
			System.out.println("                        *HOT COFFEE*");
			System.out.println();
			Thread.sleep(250);
			System.out.println("____________________________________________________________");
			System.out.println("          Name        |       *       |        Price");
			System.out.println("____________________________________________________________");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < coffeeNames.length; i++) {
			System.out.printf("  %-24s    *                 %3s%n", coffeeNames[i], coffeePrice[i]);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			System.out.println("____________________________________________________________");
			Thread.sleep(250);
			System.out.println("____________________________________________________________");
			System.out.println();
			Thread.sleep(250);
			System.out.println("                        *ICED COFFEE*");
			Thread.sleep(250);
			System.out.println();
			System.out.println("____________________________________________________________");
			System.out.println("          Name        |       *       |        Price");
			System.out.println("____________________________________________________________");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < icedCoffeeNames.length; i++) {
			System.out.printf("  %-24s    *                 %3s%n", icedCoffeeNames[i], icedCoffeePrice[i]);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			System.out.println("____________________________________________________________");
			Thread.sleep(250);
			System.out.println("____________________________________________________________");
			System.out.println();
			Thread.sleep(250);
			System.out.println("                           *BAKERY*");
			Thread.sleep(250);
			System.out.println();
			System.out.println("____________________________________________________________");
			System.out.println("          Name        |       *       |        Price");
			System.out.println("____________________________________________________________");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < bakeryNames.length; i++) {
			System.out.printf("  %-24s    *                 %3s%n", bakeryNames[i], bakeryPrice[i]);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("____________________________________________________________");
		System.out.println("                          |1|Order                 ");
		System.out.println("                          |2|Exit                  ");
		int choice = validateInput("                           Choose: ", 1, 2);

		switch (choice) {
		case 1:
			orderOrExit();
			break;
		case 2:
			System.out.println("\n                         Thank you!");
			scanner.close();
			System.exit(0);
		}
	}
	// Method for Order and Categories of coffee
	static void orderOrExit() {
		System.out.println("____________________________________________________________");
		System.out.println("                         |1|HOT COFFEE                 ");
		System.out.println("                         |2|ICED COFFEE                  ");
		System.out.println("                         |3|BAKERY                  ");
		int choice = validateInput("                           Choose: ", 1, 3);
		switch (choice) {
		case 1:
			hotCoffeeChoice();
			break;

		case 2:
			icedCoffeeChoice();
			break;

		case 3:
			bakeryChoice();
			break;
		}

	}
	// Method for ordering HotCoffee
	static void hotCoffeeChoice() {
		System.out.println("                          HOT COFFEE                 ");
		System.out.println();

		int coffeeOrdered = validateInput("                  Enter the number of Coffee: ", 1, 5);
		indexCoffee = coffeeOrdered - 1;

		if (coffeeOrdered >= 1 && coffeeOrdered <= coffeeNames.length) {
			System.out.println();
			System.out.println("             You ordered number " + coffeeNames[indexCoffee]);
			totalCoffeePrice = (coffeePrice[indexCoffee]);
			System.out.println();
		}
		scanner.nextLine();
		System.out.println("           How many would you like to order? ");
		int hotCoffeeQuantity = validateInput("                           Choose: ", 1, 99);
		System.out.println();
		System.out.println("           Would you like to explore our selection of  ");
		System.out.println("             fresh baked goods today ? y/n ");
		bakeryOption = validateInputString("                           Choose: ");

		if (bakeryOption.equals("y")) {
			System.out.println();
			System.out.println("                            BAKERY");
			System.out.println();

			int bakeryOrdered = validateInput("                  Enter the number of Bakery: ", 1, 5);

			if (bakeryOrdered >= 1 && bakeryOrdered <= bakeryNames.length) {
				int indexSec = bakeryOrdered - 1;
				System.out.println("         You added number " + bakeryNames[indexSec] + " to your order");								   
				totalBakeryPrice = (bakeryPrice[indexSec]);
				System.out.println();
				scanner.nextLine();
				System.out.println("           How many would you like to order? ");
				int bakeryQuantity = validateInput("                           Choose: ", 1, 99);
				System.out.println();
				scanner.nextLine();
				System.out.print("                     Your name: ");
				String myName = scanner.nextLine();
				int myCash;
				System.out.print("                         Cash: ");
				while (!scanner.hasNextInt()) {
					System.out.println("                   Invalid , Enter a number");
					scanner.next();
					System.out.print("                         Cash: ");
				}
				myCash = scanner.nextInt();
				int overall = (totalCoffeePrice * hotCoffeeQuantity) + (totalBakeryPrice * bakeryQuantity);
				int myChange = myCash - overall;
				System.out.println("                    Print receipt? y/n ");

				String receipt = validateInputString("                           Choose: ");

				if (receipt.equals("y")) {
					// Print receipt
					try {
						System.out.println();
						System.out.println();
						Thread.sleep(350);
						System.out.println("____________________________________________________________");						
						Thread.sleep(350);
						System.out.println("                           RECEIPT");
						Thread.sleep(350);
						System.out.println("------------------------------------------------------------");							
						System.out.println();
						Thread.sleep(350);
						System.out.println("   Name: " + myName);
						Thread.sleep(350);
						System.out.println("   Cash: " + myCash);
						System.out.println();
						Thread.sleep(350);
						System.out.println("------------------------------------------------------------");							
						Thread.sleep(350);
						System.out.println("                          HOT COFFEE ");
						Thread.sleep(350);
						System.out.println("   Description                                       Price");							
						System.out.println();
						Thread.sleep(350);
						System.out.println("   " + coffeeNames[indexCoffee] + "                                     " + coffeePrice[indexCoffee]);																  
						System.out.println();
						System.out.println();
						Thread.sleep(350);
						System.out.println("------------------------------------------------------------");
						Thread.sleep(350);
						System.out.println("                          ICED COFFEE ");
						Thread.sleep(350);
						System.out.println("   Description                                       Price");							
						System.out.println();
						Thread.sleep(350);
						System.out.println();
						System.out.println();
						System.out.println();
						Thread.sleep(350);
						System.out.println("------------------------------------------------------------");						
						Thread.sleep(350);
						System.out.println("                            BAKERY ");
						Thread.sleep(350);
						System.out.println("   Description                                       Price");							
						System.out.println();
						Thread.sleep(350);
						System.out.println("   " + bakeryNames[indexSec]+ "                                    " + bakeryPrice[indexSec]);																				   
						System.out.println();
						System.out.println();
						Thread.sleep(350);
						System.out.println("------------------------------------------------------------");						
						Thread.sleep(350);
						System.out.println("   TOTAL                                            " + overall);											
						Thread.sleep(350);
						System.out.println("   Cash                                             " + myCash);													
						Thread.sleep(350);
						System.out.println("   Change                                           " + myChange);														
						System.out.println();
						Thread.sleep(350);
						System.out.println("------------------------------------------------------------");						
						Thread.sleep(350);
						System.out.println("                           THANK YOU ");
						Thread.sleep(350);
						System.out.println("____________________________________________________________");							
						Thread.sleep(350);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					scanner.nextLine();

				} else if (receipt.equals("n")) {
					System.out.println("\n                         Thank you!");
					scanner.close();
					System.exit(0);
				}
			}
		} else if (bakeryOption.equals("n")) {
			System.out.println("                     Thank you, come again");
			scanner.close();
			System.exit(0);
		}
	}
    // Method for ordering IcedCoffee
	static void icedCoffeeChoice() {

		System.out.println("                          ICED COFFEE                 ");
		System.out.println();
		int icedCoffeeOrdered = validateInput("                  Enter the number of Coffee: ", 1, 5);
		indexThird = icedCoffeeOrdered - 1;
		if (icedCoffeeOrdered >= 1 && icedCoffeeOrdered <= icedCoffeeNames.length) {
			System.out.println();
			System.out.println("             You ordered number " + icedCoffeeNames[indexThird]);
			totalIcedCoffeePrice = (icedCoffeePrice[indexThird]);
			System.out.println();
		}
		scanner.nextLine();
		System.out.println("           How many would you like to order? ");
		int IcedCoffeeQuantity = validateInput("                           Choose: ", 1, 99);
		System.out.println();

		System.out.println("           Would you like to explore our selection of  ");
		System.out.println("             fresh baked goods today ? y/n: ");

		bakeryOption = validateInputString("                           Choose: ");

		if (bakeryOption.equals("y")) {
			System.out.println();
			System.out.println("                            BAKERY");
			System.out.println();

			int bakeryOrdered = validateInput("                 Enter the number of Bakery: ", 1, 5);

			if (bakeryOrdered >= 1 && bakeryOrdered <= bakeryNames.length) {
				int indexSec = bakeryOrdered - 1;
				System.out.println("         You added number " + bakeryNames[indexSec] + " to your order");								  
				totalBakeryPrice = (bakeryPrice[indexSec]);
				System.out.println();
				scanner.nextLine();
				System.out.println("           How many would you like to order? ");
				int bakeryQuantitySec = validateInput("                           Choose: ", 1, 99);
				System.out.println();
				scanner.nextLine();

				System.out.print("                     Your name: ");

				String myName = scanner.nextLine();

				int myCash;

				System.out.print("                         Cash: ");

				while (!scanner.hasNextInt()) {
					System.out.println("                   Invalid , Enter a number");
					scanner.next();
					System.out.print("                         Cash: ");
				}
				myCash = scanner.nextInt();

				int overall = (totalIcedCoffeePrice * IcedCoffeeQuantity) + (totalBakeryPrice * bakeryQuantitySec);
				int myChange = myCash - overall;

				System.out.println("                    Print receipt? y/n: ");

				String receipt = validateInputString("                           Choose: ");

				if (receipt.equals("y")) {
                   // Another print receipt 
					try {
						System.out.println();
						System.out.println();
						Thread.sleep(350);
						System.out.println("____________________________________________________________");							
						Thread.sleep(350);
						System.out.println("                           RECEIPT");
						Thread.sleep(350);
						System.out.println("------------------------------------------------------------");						
						System.out.println();
						Thread.sleep(350);
						System.out.println("   Name: " + myName);
						Thread.sleep(350);
						System.out.println("   Cash: " + myCash);
						System.out.println();
						Thread.sleep(350);
						System.out.println("------------------------------------------------------------");						
						Thread.sleep(350);
						System.out.println("                          HOT COFFEE ");
						Thread.sleep(350);
						System.out.println("   Description                                       Price");							
						System.out.println();
						Thread.sleep(350);
						System.out.println();
						System.out.println();
						System.out.println();
						Thread.sleep(350);
						System.out.println("------------------------------------------------------------");							
						Thread.sleep(350);
						System.out.println("                          ICED COFFEE ");
						Thread.sleep(350);
						System.out.println("   Description                                       Price");							
						System.out.println();
						Thread.sleep(350);
						System.out.println("   " + icedCoffeeNames[indexThird] + "                                     " + icedCoffeePrice[indexThird]);										   										   
						System.out.println();
						System.out.println();
						Thread.sleep(350);
						System.out.println("------------------------------------------------------------");							
						Thread.sleep(350);
						System.out.println("                            BAKERY ");
						Thread.sleep(350);
						System.out.println("   Description                                       Price");						
						System.out.println();
						Thread.sleep(350);
						System.out.println("   " + bakeryNames[indexSec] + "                                    " + bakeryPrice[indexSec]);										   										  
						System.out.println();
						System.out.println();
						Thread.sleep(350);
						System.out.println("------------------------------------------------------------");					
						Thread.sleep(350);
						System.out.println("   TOTAL                                            " + overall);													
						Thread.sleep(350);
						System.out.println("   Cash                                             " + myCash);									
						Thread.sleep(350);
						System.out.println("   Change                                           " + myChange);														
						System.out.println();
						Thread.sleep(350);
						System.out.println("------------------------------------------------------------");							
						Thread.sleep(350);
						System.out.println("                           THANK YOU ");
						Thread.sleep(350);
						System.out.println("____________________________________________________________");					
						Thread.sleep(350);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					scanner.nextLine();
				} else if (receipt.equals("n")) {
					System.out.println("\n                         Thank you!");
					scanner.close();
					System.exit(0);
				}
			}
		} else if (bakeryOption.equals("n")) {
			System.out.println("                     Thank you, come again");
			scanner.close();
			System.exit(0);
		}
	}
    // Method for ordering bakery 
	static void bakeryChoice() {

		System.out.println();
		System.out.println("                            BAKERY");
		System.out.println();

		int bakeryOrdered = validateInput("                 Enter the number of Bakery: ", 1, 5);

		if (bakeryOrdered >= 1 && bakeryOrdered <= bakeryNames.length) {
			int indexSec = bakeryOrdered - 1;
			System.out.println("         You added number " + bakeryNames[indexSec] + " to your order");
			totalBakeryPrice = (bakeryPrice[indexSec]);
			System.out.println();
			scanner.nextLine();
			System.out.println("           How many would you like to order? ");
			int bakeryQuantityThird = validateInput("                           Choose: ", 1, 99);
			System.out.println();
			scanner.nextLine();
			System.out.print("                     Your name: ");

			String myName = scanner.nextLine();

			int myCash;

			System.out.print("                         Cash: ");

			while (!scanner.hasNextInt()) {
				System.out.println("                   Invalid , Enter a number");
				scanner.next();
				System.out.print("                         Cash: ");
			}

			myCash = scanner.nextInt();

			int overall = (totalBakeryPrice * bakeryQuantityThird);
			int myChange = myCash - overall;

			System.out.println("                    Print receipt? y/n: ");

			String receipt = validateInputString("                           Choose: ");

			if (receipt.equals("y")) {
              // Another print receipt 
				try {
					System.out.println();
					System.out.println();
					Thread.sleep(350);
					System.out.println("____________________________________________________________");
					Thread.sleep(350);
					System.out.println("                           RECEIPT");
					Thread.sleep(350);
					System.out.println("------------------------------------------------------------");
					System.out.println();
					Thread.sleep(350);
					System.out.println("   Name: " + myName);
					Thread.sleep(350);
					System.out.println("   Cash: " + myCash);
					System.out.println();
					Thread.sleep(350);
					System.out.println("------------------------------------------------------------");
					Thread.sleep(350);
					System.out.println("                          HOT COFFEE ");
					Thread.sleep(350);
					System.out.println("   Description                                       Price");
					System.out.println();
					Thread.sleep(350);
					System.out.println();
					System.out.println();
					System.out.println();
					Thread.sleep(350);
					System.out.println("------------------------------------------------------------");
					Thread.sleep(350);
					System.out.println("                          ICED COFFEE ");
					Thread.sleep(350);
					System.out.println("   Description                                       Price");
					System.out.println();
					Thread.sleep(350);
					System.out.println();
					System.out.println();
					System.out.println();
					Thread.sleep(350);
					System.out.println("------------------------------------------------------------");
					Thread.sleep(350);
					System.out.println("                            BAKERY ");
					Thread.sleep(350);
					System.out.println("   Description                                       Price");
					System.out.println();
					Thread.sleep(350);
					System.out.println("   " + bakeryNames[indexSec] + "                                    " +  bakeryPrice[indexSec]);								
					System.out.println();
					System.out.println();
					Thread.sleep(350);
					System.out.println("------------------------------------------------------------");
					Thread.sleep(350);
					System.out.println("   TOTAL                                            " + overall);					
					Thread.sleep(350);
					System.out.println("   Cash                                             " + myCash);
					Thread.sleep(350);
					System.out.println("   Change                                           " + myChange);			
					System.out.println();
					Thread.sleep(350);
					System.out.println("------------------------------------------------------------");
					Thread.sleep(350);
					System.out.println("                           THANK YOU ");
					Thread.sleep(350);
					System.out.println("____________________________________________________________");
					Thread.sleep(350);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				scanner.nextLine();

			} else if (receipt.equals("n")) {
				System.out.println("\n                         Thank you!");
				scanner.close();
				System.exit(0);

			}
		}
	}
	// Validate user input for integer values
	static int validateInput(String prompt, int min, int max) {
		int input;
		while (true) {
			System.out.print(prompt);
			while (!scanner.hasNextInt()) {
				System.out.println("                Invalid, please enter a number");
				scanner.next();
				System.out.print("                           Choose: ");
			}
			input = scanner.nextInt();
			if (input >= min && input <= max) {
				break;
			} else {
				System.out.println("             Invalid, please enter valid number");

			}
		}
		return input;
	}
	// Validate user input for String values
	static String validateInputString(String prompt) {
		String input;
		while (true) {
			System.out.print(prompt);
			while (scanner.hasNextInt()) {
				System.out.println("              Invalid , please enter a Character: ");
				scanner.next();
				System.out.print("                           Choose: ");
			}
			input = scanner.next();
			if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("n")) {
				break;
			} else {
				System.out.println("                      Invalid, enter y/n ");

			}

		}
		return input;
	}
}
