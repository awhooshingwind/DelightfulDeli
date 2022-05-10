public class SandwichScore {

	// rules for scoring
	// Sandwich class will handle adjusting its own score value

	// check contents of sandwich for certain score conditions
	// return an int (total value of running "tally")
	// to be used by the Sandwich class method (sandoScore) to calculate final score

	// take a finished Sandwich object "s" as an argument
	// and run some tests on its contents to calculate a score
	public static int scoreSando(Sandwich s) {
		// null Sandwich objects get scored zero
		// mostly to prevent null pointer exceptions
		// Sandwiches start with a score of zero already
		if (s == null) {
			return 0;
		}
		int tally = 0;
		// check for matches and adjust tally
		for (int i = 0; i < SandoScanner.bigMenu.length; i++) {
			for (int j = 0; j < s.sandoContents.length; j++) {
				if (SandoScanner.bigMenu[i].contains(s.getIngredName(s, j))) {
					tally += 8.927;
				}
			}
		}

		if (SecretMenu.compareSandwich(s) == true) {
			tally += 120;
		}

// a quick word from our sponsors:
//
		if (s.deconstruct(s).contains("#teamsandwich") || s.deconstruct(s).contains("teamsandwich")
				|| s.deconstruct(s).contains("#subway")) {
			tally += 500;
		}
		// Hats off to Team Sandwich!!
		if (s.deconstruct(s).contains("Patrick") || s.deconstruct(s).contains("Nicholas")
				|| s.deconstruct(s).contains("Elijah") || (s.deconstruct(s).contains("Jake"))) {
			tally += 1000;
			s.bonusUnlock("Coders are friends, not food!!!");
		}

		//
		// add bonus custom scores here:
		//
		//
		//
		//
		//
		//
		// end uncomment
		// Resume score logic:


		//idk its scoring mate what else do u want
		
		
		//bread
		if (s.deconstruct(s).contains("white")) {
			tally += 17;
		}
		if (s.deconstruct(s).contains("wheat")) {
			tally += 16;
		}
		if (s.deconstruct(s).contains("rye")) {
			tally += 19;
		}
		if (s.deconstruct(s).contains("sourdough")) {
			tally += 17;
		}
		if (s.deconstruct(s).contains("ciabatta")) {
			tally += 16;
		}
		if (s.deconstruct(s).contains("bagel")) {
			tally += 15;
		}
		if (s.deconstruct(s).contains("hoagie")) {
			tally += 20;
		}
		if (s.deconstruct(s).contains("sesame roll")) {
			tally += 16;
		}
		
		//mains
		if (s.deconstruct(s).contains("ham")) {
			tally += 20;
		}
		if (s.deconstruct(s).contains("turkey")) {
			tally += 21;
		}
		if (s.deconstruct(s).contains("chicken")) {
			tally += 23;
		}
		if (s.deconstruct(s).contains("tuna")) {
			tally += 19;
		}
		if (s.deconstruct(s).contains("egg")) {
			tally += 18;
		}
		if (s.deconstruct(s).contains("avocado")) {
			tally += 17;
		}
		if (s.deconstruct(s).contains("pastrami")) {
			tally += 24;
		}
		if (s.deconstruct(s).contains("salami")) {
			tally += 23;
		}
		if (s.deconstruct(s).contains("steak")) {
			tally += 21;
		}
		if (s.deconstruct(s).contains("meatball")) {
			tally += 20;
		}
		
		//cheeses
		if (s.deconstruct(s).contains("american")) {
			tally += 13;
		}
		if (s.deconstruct(s).contains("swiss")) {
			tally += 12;
		}
		if (s.deconstruct(s).contains("cheddar")) {
			tally += 15;
		}
		if (s.deconstruct(s).contains("provolone")) {
			tally += 14;
		}
		if (s.deconstruct(s).contains("cream cheese")) {
			tally += 11;
		}
		if (s.deconstruct(s).contains("nacho")) {
			tally += -50;
		}
		if (s.deconstruct(s).contains("pepperjack")) {
			tally += 15;
		}
		if (s.deconstruct(s).contains("mozzarella")) {
			tally += 13;
		}
		if (s.deconstruct(s).contains("gouda")) {
			tally += 14;
		}
		if (s.deconstruct(s).contains("brie")) {
			tally += 12;
		}
		
		//sauces
		if (s.deconstruct(s).contains("mayo")) {
			tally += 16;
		}
		if (s.deconstruct(s).contains("mustard")) {
			tally += 13;
		}
		if (s.deconstruct(s).contains("fish sauce")) {
			tally += -16;
		}
		if (s.deconstruct(s).contains("ketchup")) {
			tally += -13;
		}
		if (s.deconstruct(s).contains("ranch dressing")) {
			tally += 13;
		}
		if (s.deconstruct(s).contains("thousand island")) {
			tally += 12;
		}
		if (s.deconstruct(s).contains("special")) {
			tally += 14;
		}
		if (s.deconstruct(s).contains("tartar")) {
			tally += 11;
		}
		if (s.deconstruct(s).contains("pesto")) {
			tally += 13;
		}
		
		//freshies
		if (s.deconstruct(s).contains("lettuce")) {
			tally += 13;
		}
		if (s.deconstruct(s).contains("tomato")) {
			tally += 11;
		}
		if (s.deconstruct(s).contains("sprouts")) {
			tally += 12;
		}
		if (s.deconstruct(s).contains("onion")) {
			tally += 14;
		}
		if (s.deconstruct(s).contains("bell pepper")) {
			tally += 10;
		}
		if (s.deconstruct(s).contains("cucumber")) {
			tally += 11;
		}
		if (s.deconstruct(s).contains("celery")) {
			tally += 10;
		}
		if (s.deconstruct(s).contains("spinach")) {
			tally += 11;
		}
		
		//pickled
		if (s.deconstruct(s).contains("pickles")) {
			tally += 17;	
		}
		if (s.deconstruct(s).contains("pepperoncini")) {
			tally += 15;
		}
		if (s.deconstruct(s).contains("capers")) {
			tally += 11;
		}
		if (s.deconstruct(s).contains("olives")) {
			tally += 10;
		}
		if (s.deconstruct(s).contains("carmelized onions")) {
			tally += 14;
		}
		if (s.deconstruct(s).contains("banana peppers")) {
			tally += 15;
		}
		
		// bonus secret logic
		// add lox bonus
		if (s.deconstruct(s).contains("bagel") && s.deconstruct(s).contains("lox")
				|| s.deconstruct(s).contains("lox") && s.deconstruct(s).contains("cream cheese")) {
			tally += 90;
			s.bonusUnlock("You've done this before, I see");
		}
		// add bacon easy bonus
		if (s.deconstruct(s).contains("bacon")) {
			tally += 30;
			s.bonusUnlock("doesn't matter, has bacon, duh");
		}
		// NY chopped cheese jackpot
		if (s.deconstruct(s).contains("beef") && s.deconstruct(s).contains("cheese")
				&& s.deconstruct(s).contains("chop") && ((s.deconstruct(s).contains("hoagie")))) {
			tally += 500;
			s.bonusUnlock("Ay-yo who's man's is this???!");
		}
		// secret side coffee
		if (s.deconstruct(s).contains("coffee")) {
			s.bonusUnlock("coffee. Gotta have it!!");
			tally += 10;
		}
		// Burger
		if (s.deconstruct(s).contains("burger") && s.deconstruct(s).contains("cheddar")
				&& s.deconstruct(s).contains("mayo") && s.deconstruct(s).contains("fries")) {
			tally += 90;
			s.bonusUnlock("'Murica");
		}
		
		if (tally < 0) {
			tally = 0;
		}
		if (s.sandoContents.length == 3) {
			tally *= 1.09;
		}
		if (s.sandoContents.length == 4) {
			tally *= 1.07;
		}
		if (s.sandoContents.length == 5) {
			tally *= 0.77;
		}
		if (s.sandoContents.length == 6) {
			tally *= 0.69;
		}
		if (s.sandoContents.length == 7) {
			tally *= 0.55;
		}
		if (s.sandoContents.length == 8) {
			tally *= 0.7;
		}
		if (tally >100 && tally <= 105) {
			tally = 100;
		}

		return s.sandoScore(tally);
	}

	// score evaluation with feedback
	public static void scoreLogic(int score) {
		if (score <= 0) {
			System.out.println(
					"Bomb-out bad... This sandwich is so terrible that the local alley cat wouldn't touch it. \nIt's recommended that you make a new sandwich to make up for this... thing... that you've created...\n");
		}
		if (score > 0 && score < 50) {
			System.out.println(
					"It's edible... Barely. \nWe can't be held responsible for creating a sandwich that only a mother could love, we just put it together.\nFeel free to try again for a better score!\n");
		}
		if (score >= 50 && score < 75) {
			System.out.println(
					"It's not good, but it's not bad. \nYou could serve this at the local bar, as long as its average rating is 3 stars. \nTry again to make a better sandwich!\n");
		}
		if (score >= 75 && score < 90) {
			System.out.println(
					"Now THIS is a sandwich. \nYou're not winning any awards, but anybody short of a Jimmy Johns worker would be satisfied with this one. \nIf you REALLY want a great sandwich, try again and change around some ingredients to see if you can increase your score!\n");
		}
		if (score >= 90 && score < 100) {
			System.out.println(
					"You're so very close to perfection. This sandwich could cure world hunger, and satisfy a bear fresh out of hibernation.\nWe don't really know what would make this better, but there is such a thing as a perfect score. \nTry again and see if you can get a 100/100!\n");
		}
		if (score == 100) {
			System.out.println(
					"We're speechless. Your sandwich transcends the bounds of the fourth physical dimension \nand sates the hunger of every known and unknown organism in the universe. \nWe are honored to prepare such an amazing sandwich... \nBut there is even better.\nHidden in these ingredients is the key to four sandwiches that single-handedly bring you infinite power. \nTry again, and see if you can surpass perfection itself.\n");
		}
		if (score > 100) {
			System.out.println(
					"Wait... This isn't supposed to happen. You got a score higher than perfection? \nThis sandwich goes above and beyond anything in the unkown universe. \nIt travels across different multiverses in the blink of an eye, and provides sustenance to all who need it. \nYou haven't just cured world hunger, you've brought about world peace and unity. \nEveryone everywhere is united by this beautiful creation.\nGo, you no longer need us. Take everything you've learned here and do something good in the world.\n\nWe wish you luck, O' Great Sandwich Master.\n");
		}
	}

	// not working as intended, not used right now

//	private static int score = 100;
//
//	public static boolean contains(Ingredient[] userInput, Ingredient content) {
//
//		for (int i = 0; i < userInput.length; i++) { //Should check if whatever the user has selected, should be inside that ingredient list
//
//			if (userInput[i].equals(content)) {
//
//				return true;
//
//			}
//		}
//
//		return false;
//	}
//
//	public static int score(Ingredient[] userInput) {
//		
//		
//		if(contains(userInput, new Ingredient("ham")) && contains(userInput, new Ingredient(""))) { // if ingredient that user put contains to ketchup then subtract one
//			
//			score -= 5;
//			
//		}
//		
//		if(contains(userInput, new Ingredient("ketchup")) && contains(userInput, new Ingredient("fish sauce")) || contains(userInput, new Ingredient("fish sauce")) && contains(userInput, new Ingredient("mustard"))) {
//			
//			score -= 5;
//		}
//		
//		if(contains(userInput, new Ingredient("tuna")) && contains(userInput, new Ingredient("cream cheese")) || contains(userInput, new Ingredient("tuna")) &&  contains(userInput, new Ingredient("nacho"))) {
//			
//			score -= 5;
//		}
//		
//		for(int i=0; i<userInput.length; i++) {
//			
//			if(contains(userInput, new Ingredient("mayo")) || contains(userInput, new Ingredient("tartar"))) {
//				
//				score -= 100;
//				
//				
//			}
//			
//			if(contains(userInput, new Ingredient("bell pepper"))) {
//				
//				score -= 25;
//				
//			}
//			
//			if(contains(userInput, new Ingredient("mayo"))) {
//				
//				
//			}
//			
//			
//		}
//		
//		
//		return 0;
//	}

//	public static void overrideScore(int newScore) {
//		score = newScore;
//	}
//	public static int getScore() {
//		return score;
//	}

}
