public class Sandwich {

	private String nameSando;
	private static int sandoCounter = 0;
	int score = 0;
	Ingredient[] sandoContents = new Ingredient[1];

	// create a new sandwich with an empty ingredient array
	// with a length of a given number of expected ingredients "n"
	public Sandwich(String nameSando, int n) {
		this.sandoContents = new Ingredient[n];
		for (int i = 0; i <= n - 1; i++) {
			this.sandoContents[i] = new Ingredient("open");
		}
		this.nameSando = nameSando;
		sandoCounter++;

	}

	// build a sandwich with a specified name and a given Ingredient array
	public Sandwich(String nameSando, Ingredient[] sandoContents) {
		this.nameSando = nameSando;
		this.sandoContents = sandoContents;
		sandoCounter++;
		// Menu.addToMenu(this);

	}

	// keep track of total sandwiches
	public static int getTotalSandos() {
		return sandoCounter;
	}
//	public static String getNameSando() {
//		return nameSando;
//	}

	// print sandwich as "Name: ingredients, score"
	public String toString() {
		if (this.equals(null)) {
			return "";
		}
		String s = "";
		for (int n = 0; n < this.sandoContents.length - 1; n++) {
			s += sandoContents[n] + ", ";
		}
		s += sandoContents[sandoContents.length - 1] + ".";

		String sando = nameSando + ": " + s + "\nOur experts rate it..." + SandwichScore.scoreSando(this) + "\n";
		if (this.secret) {
			sando += this.bonus + "\n";
		}
		return sando;
	}

	public static String toStringForMenu(Sandwich s) {
		if (s == null) {
			return "";
		}
		String menuSando = "";
		for (int n = 0; n < s.sandoContents.length - 1; n++) {
			menuSando += s.sandoContents[n] + ", ";
		}
		menuSando += s.sandoContents[s.sandoContents.length - 1] + ".";

		String sando = s.nameSando + ": " + menuSando + "\n";
		return sando;
	}

	public String getIngredName(Sandwich s, int n) {
		return s.sandoContents[n].getIngredName();
	}

	public int getIngredSize(Sandwich s) {
		return sandoContents.length;
	}

	// testing a scoring logic for sandwich

	// first break down to compare
	public String deconstruct(Sandwich s) {
		String innards = "";
		if (s == null) {
			return "";
		}
		innards += this.nameSando;
		for (int j = 0; j <= s.sandoContents.length - 1; j++) {
			innards += sandoContents[j];

		}
		return innards;
	}

	// modify this Sandwich's score with any int value as an argument
	public int sandoScore(int n) {
		return this.score + n;
	}
	
	private boolean secret = false;
	private String bonus = "";
	int bonusCount = 0;
	public String bonusUnlock(String s) {
		this.bonus += s;
		this.secret = true;
		this.bonusCount++;
		if (this.bonusCount >= 3) {
			this.bonus = "";
			this.bonus += "I like the cut of your jib...\n" + "Hell, throw an apron on - you're hired!";
			return bonus;
		}
		return bonus;
	}

}
