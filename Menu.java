public class Menu {

	// menu class
	Sandwich[] menu = new Sandwich[1];
	private int menuSpot = 0;
	private String menuName = "";

	public Menu(String s, int n) {
		this.setMenuName(s);
		this.menu = new Sandwich[n];
	}

	public Menu(String s, Sandwich[] sandos) {
		this.setMenuName(s);
		this.menu = new Sandwich[sandos.length];
		addToMenuMore(sandos);
	}

	// add a given sandwich to the menu array, keeping track of position (must be
	// within bounds established above...5..for now
	public void addToMenu(Sandwich sando) {
		menu[menuSpot] = sando;
		menuSpot++;
	}

	public void addToMenuMore(Sandwich[] s) {
		for (int i = 0; i < s.length; i++) {
			addToMenu(s[i]);
		}
	}

	public String printMenu() {
		String board = "";
		for (int n = 0; n < menu.length; n++) {
			board += Sandwich.toStringForMenu(menu[n]);
		}

		return board;
	}

	public int getMenuTally() {
		return this.menuSpot;
	}

	public Sandwich[] getMenu() {
		return this.menu;
	}

	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

}
