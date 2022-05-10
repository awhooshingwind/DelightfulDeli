
public class Ingredient {

	// define Ingredients parameters
	private String nameIngredient;
	@SuppressWarnings("unused")
	private int typeIngredient;

	// string arrays of potentially score-able Ingredients
	public static String[] breads = { "white", "wheat", "rye", "sourdough", "ciabatta", "bagel", "hoagie",
			"sesame roll" };
	public static String[] mains = { "ham", "turkey", "chicken", "tuna", "egg", "avocado", "pastrami", "salami",
			"steak", "meatball" };
	public static String[] cheeses = { "american", "swiss", "cheddar", "provolone", "cream cheese", "nacho",
			"pepperjack", "mozzarella", "gouda", "brie" };
	public static String[] sauces = { "mayo", "mustard", "fish sauce", "ketchup", "ranch dressing", "thousand island",
			"special", "tartar", "pesto" };
	public static String[] freshies = { "lettuce", "tomato", "sprouts", "onion", "bell pepper", "cucumber", "celery",
			"spinach" };
	public static String[] pickles = { "pickles", "pepperoncini", "capers", "olives", "caramelized onions",
			"banana peppers" };

	// strings of Ingredient types from int values
	public static String[] ingredTypeName = { "Bread", "Main", "Cheese", "Sauce/condiment", "Fresh Veg.",
			"Pickles/Cooked Veg.", "Misc." };
	private int amountIngredient; // 0 - 3 (none, lite, reg, lots)
	String[] ingredAmount = { "none", "lite", "regular", "lots" };

	// keep track of number of ingredients created
	private static int numberIngredients = 0;

	/**
	 * construct an Ingredient with just a name
	 * 
	 * @param nameIngredient
	 * 
	 */
	public Ingredient(String nameIngredient) {
		this.nameIngredient = nameIngredient;
		numberIngredients++;
	}

	/**
	 * Ingredient constructor with only name and type values
	 * 
	 * @param nameIngredient
	 * @param typeIngredient
	 */
	public Ingredient(String nameIngredient, int typeIngredient) {
		this.nameIngredient = nameIngredient;
		this.typeIngredient = typeIngredient;
		numberIngredients++;
	}

	/**
	 * Ingredient constructor with all three values
	 * 
	 * @param nameIngredient
	 * @param typeIngredient
	 * @param amountIngredient
	 */
	public Ingredient(String nameIngredient, int typeIngredient, int amountIngredient) {
		this.nameIngredient = nameIngredient;
		this.typeIngredient = typeIngredient;
		this.amountIngredient = amountIngredient;

		if (this.amountIngredient == 0) {
			this.nameIngredient = "";
			this.typeIngredient = 0;
		}
		if (this.amountIngredient > 3) {
			this.amountIngredient = 3;
		}

		numberIngredients++;
	}

	/**
	 * Print Ingredient will only print toppings (excludes bread and main types in
	 * final print out) and should only print amount if Lite or Lots (excludes
	 * regular amount) should make final sandwich array print out less clunky
	 */
	public String toString() {
		String ingred = "";

		if (this.amountIngredient == 1 || this.amountIngredient == 3) {
			ingred = this.nameIngredient + "-" + ingredAmount[amountIngredient];
		} else
			ingred = this.nameIngredient;

		return ingred;
	}

	public String getIngredName() {
		return this.nameIngredient;
	}

	/**
	 * Ingredient counter
	 * 
	 * @return
	 */
	public static int getNumberIngredients() {
		return numberIngredients;
	}

}
