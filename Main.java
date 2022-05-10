import java.util.Scanner;

public class Main {

	public static Sandwich newGame(Scanner s) {

		String startSando = "Welcome to the Delightful Deli!\n" + "\n"
				+ "Here's how it works, first, name your sandwich.\n" + "Then, we'll build one together,\n"
				+ "starting with bread, a main ingredient, then up to 3 extras.\n" + "\n" + "Ready?" + "\n"
				+ "So, what sorta sandwich sounds good today...? (sandwich name)";

		Sandwich userNewSando = SandoScanner.userSandoPrompt(s, startSando);
		System.out.println(userNewSando);

		// run score logic method based on sando score
		SandwichScore.scoreLogic(SandwichScore.scoreSando(userNewSando));
		return userNewSando;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// start a new game
		// add the result of the first round to menu "today"
		Menu today = new Menu("today", 6);
		today.addToMenu(newGame(s));

		// End of round menu options
		boolean keepPlaying = true;
		int rounds = 1;
		while (keepPlaying == true) {

			int chosenOption = SandoScanner.selector(s, SandoScanner.playAgainPrompt(), "", 1,
					SandoScanner.options.length);
			if (chosenOption == 1) {
				Sandwich againNewSando = SandoScanner.userSandoPrompt(s,
						"Welcome back...\nWhat'll it be this time? (sandwich name)");
				today.addToMenu(againNewSando);
				System.out.println(againNewSando);
				SandwichScore.scoreLogic(SandwichScore.scoreSando(againNewSando));
				rounds++;
				// warning about to get booted 
				if (rounds == 5) {
					System.out.println(
							"Alright, buster, one more sandwich then I'm cuttin' you off, there's other people in line, ya know!\n" + "(Start over if you want to keep playing...)");
				}
				// get tossed out of the deli
				// force user to restart for not following rules :)
				if (rounds == 6) {
					System.out.println("I think that's enough for today, you totally cleaned us out...");
					break;
				}
			}

			// [2] Print Menu "today"
			if (chosenOption == 2 && today.getMenu().length > 0) {
				System.out.println("Here are the sandos you've made:\n");
				System.out.println(today.printMenu());
			}

			// [3] Generate and print random menu with scores
			// creates a separate menu "rando" so sandwiches can be saved and scored

			if (chosenOption == 3) {
				System.out.println("Some of the house specials to inspire you...\n");
				Menu rando = new Menu("Random", SecretMenu.randomSandos(5));
				for (int i = 0; i <= rando.getMenu().length - 1; i++) {
					System.out.println(rando.getMenu()[i]);
				}
			}

			// [4] Start Over
			if (chosenOption == 4 && today.getMenu().length > 0) {
				System.out.println(
						"Starting over will delete all existing Sandos!\nEnter Y to continue or N to stay here.");
				String keepOnPlaying = "Y";
				if (SandoScanner.playAgain(s, keepOnPlaying)) {
					if (chosenOption == 4 && today.getMenu().length > 0) {
						Menu startOver = new Menu("today", 6);
						today = startOver;
						today.addToMenu(newGame(s));
					}
					rounds = 1;
					continue;
				} else {
					continue;
				}

			}

			// [5] Exit
			if (chosenOption == 5) {
				System.out.println(
						"Your current sandwich making progess will come to an end!\nEnter Y to stay, or N to quit.");
				String keepOnPlaying = "Y";
				if (SandoScanner.playAgain(s, keepOnPlaying)) {
					continue;
				} else {
					keepPlaying = false;
				}

			}
		}

		System.out.println("OK, thanks for stopping by!");
		return;

	}

}
