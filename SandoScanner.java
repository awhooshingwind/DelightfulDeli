import java.util.Scanner;

public class SandoScanner {
	// menus for ingredient validation by scanner
	public static String breadMenu = "white, wheat, rye, sourdough, ciabatta, bagel, hoagie, sesame roll";
	public static String mainMenu = "ham, turkey, chicken, tuna, egg, avocado, pastrami, salami, steak, meatball";
	public static String cheeseMenu = "american, swiss, cheddar, provolone, cream cheese, nacho, pepperjack, mozzarella, gouda, brie";
	public static String sauceMenu = "mayo, mustard, fish sauce, ketchup, ranch dressing, thousand island, special, tartar, pesto, teriyaki";
	public static String freshMenu = "lettuce, tomato, sprouts, onion, bell pepper, cucumber, celery, spinach";
	public static String pickleMenu = "pickles, pepperoncini, capers, olives, carmelized onions, banana peppers";

	// bulk menu for scoring?
	public static String[] bigMenu = { breadMenu, mainMenu, cheeseMenu, sauceMenu, freshMenu, pickleMenu };

	public static String userInput = "";

	/**
	 * gets an int with a specified minimum and maximum. if you don't want a custom
	 * error message, put in "" instead and it will auto assign the generic message
	 * 
	 * @param s
	 * @param prompt
	 * @param error
	 * @param min
	 * @param max
	 * @return
	 */
	public static int selector(Scanner s, String prompt, String error, int min, int max) {
		System.out.println(prompt);
		String codeIsBROKEN = "";
		if (error == "") {
			error = "That's not a valid number! Try again.";
		}
		while (true) {

			if (s.hasNextInt()) {
				int input = s.nextInt();
				if (input >= min && input <= max) {
					return input;
				} else {
					System.out.println(error);
					s.nextLine();
					continue;
				}
			} else {
				codeIsBROKEN = s.next();
			}
			if (!codeIsBROKEN.isEmpty()) {
				System.out.println("What, you don't like our numbers? Please try again.");
				s.nextLine();
			}
		}
	}

	// breadValidate, mainIngredValidate, and extraIngredValidate
	// all could've been consolidated into one method using the same
	// structure as extraIngredValidate, but it's fine how it is.

	/**
	 * specifically validates stuff for bread
	 * 
	 * @param s
	 * @return
	 */
	public static String breadValidate(Scanner s) {

		// System.out.println("Entering breadValidate method");//for testing (delete for
		// final product)
		while (true) {
			if (s.hasNext()) {
				String baseInput = s.nextLine();
				String ingredName = baseInput.toLowerCase();
				if (ingredName.matches("menu")) {
					System.out.println("Our bread options~ ");
					// need to put in the bread menu
					System.out.println(SandoScanner.breadMenu);
					System.out.println("Please choose a bread from the menu: ");
					continue;
				}
				if (ingredName.isEmpty()) {
					continue;
				}
				for (int i = 0; i < Ingredient.breads.length; i++) {
					if (ingredName.matches(Ingredient.breads[i])) {
						System.out.println(ingredName + ", you got it");
						return ingredName;
					}
				}
				System.out.println("That's not on our menu! Please try again.");
			}
		}
	}

	/**
	 * specifically validates main ingredient inputs
	 * 
	 * @param s
	 * @return
	 */
	public static String mainIngredValidate(Scanner s) {

		while (true) {
			if (s.hasNext()) {
				String ingredName = s.nextLine();
				ingredName = ingredName.toLowerCase();
				if (ingredName.matches("menu")) {
					System.out.println("For main ingredients we have~ ");
					System.out.println(SandoScanner.mainMenu);
					System.out.println("Please choose a main ingredient from the menu: ");
					continue;
				}
				if (ingredName.matches("something else")) {
					System.out.println(
							"Whatever you enter next will become your ingredient, so check your spelling! (Menu command doesn't work here)");
					while (true) {
						if (s.hasNextLine()) {
							ingredName = s.nextLine();
							ingredName = ingredName.toLowerCase();
							if (ingredName.isEmpty()) {
								continue;
							} else {
								return ingredName;
							}
						}
					}
				}
				if (ingredName.isEmpty()) {
					continue;
				}
				for (int i = 0; i < Ingredient.mains.length; i++) {
					if (ingredName.matches(Ingredient.mains[i])) {
						System.out.println(ingredName + ", you got it");
						return ingredName;
					}
				}
				System.out.println("That's not on our menu! Please try again.");
			}
		}
	}

	/**
	 * validates all other kinds of ingredients
	 * 
	 * @param s
	 * @param ingredType
	 * @return
	 */
	public static String extraIngredValidate(Scanner s, int ingredType) {
		String ingredName;
		if (ingredType == 2) {
			while (true) {
				if (s.hasNext()) {
					ingredName = s.nextLine();
					ingredName = ingredName.toLowerCase();
					if (ingredName.matches("menu")) {
						System.out.println("So many cheeses~ ");
						System.out.println(SandoScanner.cheeseMenu);
						System.out.println("Please choose a cheese from the menu: ");
						continue;
					}
					if (ingredName.isEmpty()) {
						continue;
					}
					for (int i = 0; i < Ingredient.cheeses.length; i++) {
						if (ingredName.matches(Ingredient.cheeses[i])) {
							System.out.println(ingredName + ", you got it");
							return ingredName;
						}
					}
					System.out.println("That's not on our menu! Please try again");
				}
			}
		}
		if (ingredType == 3) {
			while (true) {
				if (s.hasNext()) {
					ingredName = s.nextLine();
					ingredName = ingredName.toLowerCase();
					if (ingredName.matches("menu")) {
						System.out.println("Might as well make it saucey~ ");
						System.out.println(SandoScanner.sauceMenu);
						System.out.println("Please choose a sauce from the menu: ");
						continue;
					}
					if (ingredName.isEmpty()) {
						continue;
					}
					for (int i = 0; i < Ingredient.sauces.length; i++) {
						if (ingredName.matches(Ingredient.sauces[i])) {
							return ingredName;
						}
					}
					System.out.println("That's not on our menu! Please try again");
				}
			}
		}
		if (ingredType == 4) {
			while (true) {
				if (s.hasNext()) {
					ingredName = s.nextLine();
					ingredName = ingredName.toLowerCase();
					if (ingredName.matches("menu")) {
						System.out.println("Freshies~ ");
						System.out.println(SandoScanner.freshMenu);
						System.out.println("Please choose a fresh item from the menu: ");
						continue;
					}
					if (ingredName.isEmpty()) {
						continue;
					}
					for (int i = 0; i < Ingredient.freshies.length; i++) {
						if (ingredName.matches(Ingredient.freshies[i])) {
							return ingredName;
						}
					}
					System.out.println("That was not an ingredient (String)! Please try again");
				}
			}
		}
		if (ingredType == 5) {
			while (true) {
				if (s.hasNext()) {
					ingredName = s.nextLine();
					ingredName = ingredName.toLowerCase();
					if (ingredName.matches("menu")) {
						System.out.println("Pickles and things~ ");
						System.out.println(SandoScanner.pickleMenu);
						System.out.println("Please choose a pickled item from the menu: ");
						continue;
					}
					if (ingredName.isEmpty()) {
						continue;
					}
					for (int i = 0; i < Ingredient.pickles.length; i++) {
						if (ingredName.matches(Ingredient.pickles[i])) {
							return ingredName;
						}
					}
					System.out.println("That's not on our menu! Please try again");
				}
			}
		}
		if (ingredType == 6) {// this is the other option
			System.out.println(
					"Welcome to the 'other' selection.\nPlease feel free to enter any ingredient you would like that's not on the menu.\nWarning, custom objects may negatively affect your score!");
			System.out.println(
					"Whatever you enter next will become your ingredient, so check your spelling! (Menu command doesn't work here)");
			while (true) {
				if (s.hasNextLine()) {
					ingredName = s.nextLine();
					ingredName = ingredName.toLowerCase();
					if (ingredName.isEmpty()) {
						continue;
					} else {
						return ingredName;
					}
				}
			}
		}
		// This will only trigger if ingredType is not one of the specified numbers
		// but since ingredType is verified before being put into the method this will
		// never happen
		return null;
	}

	// get a string from user
	public static String input(Scanner s) {
		while (true) {
			userInput = s.nextLine();
			if (userInput.isEmpty()) {
				continue;
			}
			System.out.println(userInput + ", you got it");
			return userInput;
		}
	}

	// start taking a new sandwich order
	public static Sandwich userSandoPrompt(Scanner s, String prompt) {
		String ingredName = "";
		System.out.println(prompt);
		String userSandName = input(s);

		// escape method, typing EAT in all caps
		// will return a null sandwich and abort
		if (userSandName.equals("EAT")) {
			System.out.println("Heard, let's eat!");
			return null;
		}
		// otherwise, any input the user makes
		// will be taken as a String and used to name their sando

		// asks user about add-ons for sandwich
		int userIngredChoice = selector(s,
				"All our sandwiches come with:" + "\n - your choice of bread" + "\n - a main ingredient"
						+ "\n - up to 6 extras\n" + "\n" + "How many toppings would you like to add today?",
				"Are you insane?? That's entirely too much sandwich...please, be reasonable...", 0, 6);

		// adds two ingredients to user input to account for bread and main
		int userIngredTotal = userIngredChoice + 2;
		// System.out.println(userIngredTotal);
		// defaults to 2 if user inputs too small a value
		// to ensure a valid sandwich array can still be created
		// with bread and a main
		System.out.println("Great! Let's get to it...");
		// creates Ingredient array "userContents"
		// to hold contents of sando
		// length already determined above
		Ingredient[] userContents = new Ingredient[userIngredTotal];
		// creates new Sandwich object "userSando"
		// which the prompt will modify
		// to match user's order
		Sandwich userSando = new Sandwich(userSandName, userContents);

		// while loop for sandwich building
		int i = 0;
		while (i <= userContents.length - 1) {

			// first round, ask for bread type
			// will accept any string
			// and default it to bread, regular amount

			if (i == 0) {
				System.out.println(
						"First, name your bread - \nHint: Type in the word 'menu' to see our options! (works during any regular ingredient selection)");
				ingredName = breadValidate(s);
				// System.out.println(ingredName + " , got it."); // must be between 1-7
				int ingredType = 1; // force to bread
				int ingredAmount = 2; // force to regular

				// adds user input to [0] of userContents
				// Ingredient [] built above

				userContents[i] = new Ingredient(ingredName, ingredType, ingredAmount);
				i++;
			}

			// second round, pick main ingredient
			// will accept any String and force it to the "main" type
			// will prompt user for amount

			if (i == 1) {
				int ingredType = 1; // force to main
				System.out.println("Ok, and for your main ingredient - ");
				ingredName = mainIngredValidate(s);

				// prompt for amount with error msgs
				int ingredAmount = selector(s, "Specify Amount (1-3) [Lite, Regular, Lots]", "", 0, 3);

				if (ingredAmount == 0) {
					System.out
							.println("It's human to err, sometimes we must change our minds...\n" + "especially about "
									+ ingredName + ". Consider your next choice carefully, you can't change it again!");
					// gives you one more chance to select a new ingredient
					System.out.println("Ok, and for your main ingredient -");
					ingredName = mainIngredValidate(s);
					ingredAmount = selector(s, "Specify Amount (1-3) [Lite, Regular, Lots]", "", 1, 3);

				}
				if (ingredAmount >= 3) {
					System.out.println("Guess you really like " + ingredName + ". How about some toppings?");

				}
				if (ingredAmount > 0 && ingredAmount < 3) {
					System.out.println(ingredName + " it is!");
				}
				userContents[i] = new Ingredient(ingredName, ingredType, ingredAmount);
				i++;

			}

			// special case for final ingredient
			// last round "make it count" prompt
			if (i == userContents.length - 1) {
				// allows user to choose type
				int ingredType = selector(s,
						"Last ingredient, make it count!\n"
								+ "[1]Cheese [2]Sauce [3]Fresh or [4]Pickled Vegetables or [5]Something else?",
						"", 1, 5);
				ingredType++;
				// then asks for user to name
				System.out.println("Ok, what kind of " + Ingredient.ingredTypeName[ingredType] + "?");
				ingredName = extraIngredValidate(s, ingredType);

				// use selector to get an int value for amount
				int ingredAmount = selector(s, "And how much? (1-3)[Lite, Regular, Lots]", "", 0, 3);
				// too few error
				if (ingredAmount == 0) {
					System.out.println("It's human to err, sometimes we must change our minds...\n"
							+ "especially about " + ingredName);
					System.out.println("Ok, what kind of " + Ingredient.ingredTypeName[ingredType] + "?");
					ingredName = extraIngredValidate(s, ingredType);
					ingredAmount = selector(s, "Specify Amount (1-3) [Lite, Regular, Lots]", "", 1, 3);
				}
				if (ingredAmount >= 3) {
					System.out.println("Ok! Load it up with " + ingredName);
				}
				if (ingredAmount > 0 && ingredAmount < 3) {
				}
				System.out.println("You got it, pal.\n" + "One " + userSandName + " sando comin' right up!");
				// adds final ingredient to sandwich
				// and exits method
				// System.out.println("i is equal to: " + i);//for testing
				userContents[i] = new Ingredient(ingredName, ingredType, ingredAmount);
				break;
			}

			// loop for adding middle ingredients
			// following same rules
			// first, an int for the type
			// any string for name
			// and an int for value
			// adding each ingredient to userContents []
			if (i < userContents.length - 1 && i > 1) {
				// prompt for int value using selectorType method
				// with built in error handling
				int ingredType = selector(s, "What about: [1]Cheese [2]Sauce [3]Fresh or [4]Pickled Vegetables\n"
						+ "or [5] Something else?\n" + "Type the number next to your selection", "", 1, 5);
				ingredType++;
				// prompt for any string for name
				System.out.println("Ok, what kind of " + Ingredient.ingredTypeName[ingredType] + "? ");
				ingredName = extraIngredValidate(s, ingredType);

				// use selector to get an int value for amount
				int ingredAmount = selector(s, "And how much? (1-3)[Lite, Regular, Lots]", "", 0, 3);
				// situational immediate errors
				// too few
				if (ingredAmount == 0) {
					System.out
							.println("It's human to err, sometimes we must change our minds...\n" + "especially about "
									+ ingredName + ". Consider your next choice carefully, you can't change it again!");
					// gives you one more chance to select a new ingredient
					System.out.println("Ok, what kind of " + Ingredient.ingredTypeName[ingredType] + "?");
					ingredName = extraIngredValidate(s, ingredType);
					ingredAmount = selector(s, "Specify Amount (1-3) [Lite, Regular, Lots]", "", 1, 3);
				}
				// too many
				if (ingredAmount == 3) {
					System.out.println("Guess you really like " + ingredName);
				}
				if (ingredAmount > 0 && ingredAmount < 3) {
				}
				System.out.println("Let's keep goin', what else?");
				// add ingredient to userContents[]
				userContents[i] = new Ingredient(ingredName, ingredType, ingredAmount);
				// System.out.println("i is equal to: " + i);//for testing
				i++;
			}
			// exit ordering loop

		}
		// create a new Sandwich object that matches
		// the order provided by the user
		userSando = new Sandwich(userSandName, userContents);
		return userSando;
	}

	// prompt user for a string
	public static String promptRead(Scanner s, String prompt) {
		System.out.println(prompt);
		String userInput = s.nextLine();
		return userInput;
	}

	// Keep Playing

	// if user enters Y or y
	// more sandwiches get made
	// N or n will exit
	public static boolean playAgain(Scanner s, String keepPlaying) {
		while (true) {
			if (s.hasNext()) {
				keepPlaying = s.next();
				keepPlaying = keepPlaying.toLowerCase();
				if (keepPlaying.matches("y")) {
					if (s.hasNextLine()) {
						s.nextLine();
					}
					return true;
				}
				if (keepPlaying.matches("n")) {
					return false;
				}
			}
			System.out.println("That's not a valid option! Please enter 'y' or 'n'");
			if (s.hasNextLine()) {
				s.nextLine();
			}
		}
	}

	public static String[] options = { "Make Another Sando", "View Current Sandos", "Make Random Sandos", "Start Over",
			"Leave DelightfulDeli" };

	public static String playAgainPrompt() {
		String a = "";
		a += "What would you like to do now? \n";
		for (int i = 0; i < options.length; i++) {
			a += (i + 1) + ". " + options[i] + "\n";
		}
		return a;
	}

}
