public class SecretMenu {

	private static String[][] favoriteSandwiches = { { "White", "Ham", "Mayo", "Lettuce", "Tomato" },
			{ "Rye", "Pastrami", "Mustard", "Pickles", }, { "Ciabatta", "Lettuce", "Spinach", "Tomato" },
			{ "Sourdough", "Turkey", "Mustard", "Mayo", "Pepperjack", "Pickles" } };

	public static String[] getArray(String[][] s, int n) {
		return s[n];
	}

	public static boolean compareSandwich(Sandwich s) {
		int x = 1;
		for (int i = 0; i < favoriteSandwiches.length; i++) {
			if (SecretMenu.getArray(favoriteSandwiches, i)[1].toLowerCase().trim().compareTo("turkey") == 0
					|| SecretMenu.getArray(favoriteSandwiches, i)[1].toLowerCase().trim().compareTo("chicken") == 0
					|| SecretMenu.getArray(favoriteSandwiches, i)[1].toLowerCase().trim().compareTo("tuna") == 0
					|| SecretMenu.getArray(favoriteSandwiches, i)[1].toLowerCase().trim().compareTo("egg") == 0
					|| SecretMenu.getArray(favoriteSandwiches, i)[1].toLowerCase().trim().compareTo("avocado") == 0
					|| SecretMenu.getArray(favoriteSandwiches, i)[1].toLowerCase().trim().compareTo("ham") == 0
					|| SecretMenu.getArray(favoriteSandwiches, i)[1].toLowerCase().trim().compareTo("pastrami") == 0
					|| SecretMenu.getArray(favoriteSandwiches, i)[1].toLowerCase().trim().compareTo("salami") == 0) {
				x = 1;
				String[] compare = new String[SecretMenu.getArray(favoriteSandwiches, i).length];
				for (int j = 0; j < SecretMenu.getArray(favoriteSandwiches, i).length; j++) {
					if (s.getIngredSize(s) != SecretMenu.getArray(favoriteSandwiches, i).length) {
						x = 0;
					}
					for (int o = 0; o < compare.length; o++) {
						if (compare[o] == null) {
							compare[o] = "Fillerthattheycannotguess";
						}
					}
					for (int y = 0; y < s.getIngredSize(s); y++) {
						if (s.getIngredName(s, y).toLowerCase().trim()
								.compareTo(SecretMenu.getArray(favoriteSandwiches, i)[j].toLowerCase().trim()) == 0) {
							compare[j] = s.getIngredName(s, y);
						}

					}
				}
				for (int ii = 0; ii < compare.length - 1; ii++) {
					for (int xx = ii + 1; xx < compare.length; xx++) {
						if (compare[ii].trim().compareTo(compare[xx].trim()) == 0
								|| compare[ii].trim().compareTo("Fillerthattheycannotguess") == 0
								|| compare[compare.length - 1].trim().compareTo("Fillerthattheycannotguess") == 0) {
							x = 0;
						}
					}
				}
				if (x == 1) {
					return true;
				}

			}

			else {

				x = 1;
				String[] compare = new String[SecretMenu.getArray(favoriteSandwiches, i).length];
				for (int j = 0; j < SecretMenu.getArray(favoriteSandwiches, i).length; j++) {
					if (s.getIngredSize(s) != SecretMenu.getArray(favoriteSandwiches, i).length + 1) {
						x = 0;
					}
					for (int o = 0; o < compare.length; o++) {
						if (compare[o] == null) {
							compare[o] = "Fillerthattheycannotguess";
						}
					}
					for (int y = 0; y < s.getIngredSize(s); y++) {
						if (s.getIngredName(s, y).toLowerCase().trim()
								.compareTo(SecretMenu.getArray(favoriteSandwiches, i)[j].toLowerCase().trim()) == 0) {
							compare[j] = s.getIngredName(s, y);
						}

					}
				}
				if (SecretMenu.getArray(favoriteSandwiches, i)[0].toLowerCase().trim()
						.compareTo(s.getIngredName(s, 0)) != 0) {

					x = 0;
				}
				for (int ii = 2; ii < compare.length - 1; ii++) {
					for (int xx = ii + 1; xx < compare.length; xx++) {
						if (compare[ii].trim().compareTo(compare[xx].trim()) == 0
								|| compare[ii].trim().compareTo("Fillerthattheycannotguess") == 0
								|| compare[compare.length - 1].trim().compareTo("Fillerthattheycannotguess") == 0) {

							x = 0;
						}
					}
				}
				if (x == 1) {
					return true;
				}

			}

		}
		return false;
	}

	// sets a daily menu array with a random size of n, can be called in main method
	// with Menu.setRandomMenu();
	// ... make sure to put the methods in the comments at the bottom of this class
	// into the menu class for this method to work.
	public static Sandwich[] randomSandos(int n) {

		int currentindex = 0;
		Sandwich[] s = new Sandwich[n];
		int[] d = new int[n];
		for(int i = 0; i<n; i++) {
			double x = Math.random()*10;
			int v = 0;
			int w = 2;
			for (int j = 0; j<d.length; j++) {
				if((int)Math.floor(x) == d[j]) {
					while (v == 0) {
					w = 2;
					x = Math.random()*10;
					for (int y = 0; y<d.length; y++) {
						if(d[y] == (int)Math.floor(x)) {
							w = 0;
						}
					}	
							if(w == 2) {
								v = 1;
								}
						}
					continue;
					}
				continue;
				}
			
			
			if(x>=0 && x<1) {
				int p = (int)Math.floor(Math.random()*Ingredient.freshies.length);
				int u = (int)Math.floor(Math.random()*Ingredient.freshies.length);
					while (p == u) {
						p = (int)Math.floor(Math.random()*Ingredient.freshies.length);
				}
				int m = (int)Math.floor(Math.random()*Ingredient.freshies.length);
				while(m == p || m == u) {
					m = (int)Math.floor(Math.random()*Ingredient.freshies.length);
				}
				Ingredient[] a = {new Ingredient(Ingredient.breads[(int)Math.floor(Math.random()*Ingredient.breads.length)], 1), new Ingredient(Ingredient.mains[(int)Math.floor(Math.random()*Ingredient.mains.length)], 2, 3), new Ingredient(Ingredient.freshies[p], 5, 2), new Ingredient(Ingredient.freshies[u], 5, 2), new Ingredient(Ingredient.freshies[m], 5, 2)};
				Sandwich b = new Sandwich("Awesome Sandwich", a);
				s[currentindex] = b;
				d[currentindex] = 0;
				currentindex++;
			}
			if(x>=1 && x<2) {
				int p = (int)Math.floor(Math.random()*Ingredient.freshies.length);
				int u = (int)Math.floor(Math.random()*Ingredient.freshies.length);
					while (p == u) {
						p = (int)Math.floor(Math.random()*Ingredient.freshies.length);
				}
				Ingredient[] a = {new Ingredient(Ingredient.breads[(int)Math.floor(Math.random()*Ingredient.breads.length)], 1), new Ingredient(Ingredient.mains[(int)Math.floor(Math.random()*Ingredient.mains.length)], 2, 3), new Ingredient(Ingredient.freshies[p], 5, 2), new Ingredient(Ingredient.freshies[u], 5, 2), new Ingredient(Ingredient.cheeses[(int)Math.floor(Math.random()*Ingredient.cheeses.length)], 3, 2)};
				Sandwich b = new Sandwich("Cool Sandwich", a);
				s[currentindex] = b;
				d[currentindex] = 1;
				currentindex++;
			}
			if(x>=2 && x<3) {
				Ingredient[] a = {new Ingredient(Ingredient.breads[(int)Math.floor(Math.random()*Ingredient.breads.length)], 1), new Ingredient(Ingredient.mains[(int)Math.floor(Math.random()*Ingredient.mains.length)], 2, 3), new Ingredient(Ingredient.cheeses[(int)Math.floor(Math.random()*Ingredient.cheeses.length)], 3, 2),new Ingredient(Ingredient.freshies[(int)Math.floor(Math.random()*Ingredient.freshies.length)], 5, 2)};
				Sandwich b = new Sandwich("Tastes so Good!", a);
				s[currentindex] = b;
				d[currentindex] = 2;
				currentindex++;
			}
			if(x>=3 && x<4) {
				Ingredient[] a = {new Ingredient(Ingredient.breads[(int)Math.floor(Math.random()*Ingredient.breads.length)], 1), new Ingredient(Ingredient.mains[(int)Math.floor(Math.random()*Ingredient.mains.length)], 2, 3), new Ingredient(Ingredient.freshies[(int)Math.floor(Math.random()*Ingredient.freshies.length)], 5, 2), new Ingredient(Ingredient.pickles[(int)Math.floor(Math.random()*Ingredient.pickles.length)], 6, 2), new Ingredient(Ingredient.cheeses[(int)Math.floor(Math.random()*Ingredient.cheeses.length)], 3, 2)};
				Sandwich b = new Sandwich("WOW!", a);
				s[currentindex] = b;
				d[currentindex] = 3;
				currentindex++;
			}
			if(x>=4 && x<5) {
				Ingredient[] a = {new Ingredient(Ingredient.breads[(int)Math.floor(Math.random()*Ingredient.breads.length)], 1), new Ingredient(Ingredient.mains[(int)Math.floor(Math.random()*Ingredient.mains.length)], 2, 3), new Ingredient(Ingredient.cheeses[(int)Math.floor(Math.random()*Ingredient.cheeses.length)], 3, 2)};
				Sandwich b = new Sandwich("Wombo Combo", a);
				s[currentindex] = b;
				d[currentindex] = 4;
				currentindex++;
			}
			if(x>=5 && x<6) {
				int p = (int)Math.floor(Math.random()*Ingredient.freshies.length);
				int u = (int)Math.floor(Math.random()*Ingredient.freshies.length);
					while (p == u) {
						p = (int)Math.floor(Math.random()*Ingredient.freshies.length);
				}
				int m = (int)Math.floor(Math.random()*Ingredient.freshies.length);
				while(m == p || m == u) {
					m = (int)Math.floor(Math.random()*Ingredient.freshies.length);
				}
				Ingredient[] a = {new Ingredient(Ingredient.breads[(int)Math.floor(Math.random()*Ingredient.breads.length)], 1), new Ingredient(Ingredient.mains[(int)Math.floor(Math.random()*Ingredient.mains.length)], 2, 3), new Ingredient(Ingredient.freshies[p], 5, 2), new Ingredient(Ingredient.freshies[u], 5, 2), new Ingredient(Ingredient.freshies[m], 5, 2)};
				Sandwich b = new Sandwich("YumYum", a);
				s[currentindex] = b;
				d[currentindex] = 5;
				currentindex++;
			}
			if(x>=6 && x<7) {
				Ingredient[] a = {new Ingredient(Ingredient.breads[(int)Math.floor(Math.random()*Ingredient.breads.length)], 1), new Ingredient(Ingredient.mains[(int)Math.floor(Math.random()*Ingredient.mains.length)], 2, 3), new Ingredient(Ingredient.sauces[(int)Math.floor(Math.random()*Ingredient.sauces.length)], 4, 2), new Ingredient(Ingredient.freshies[(int)Math.floor(Math.random()*Ingredient.freshies.length)], 5, 2)};
				Sandwich b = new Sandwich("Tasty!", a);
				s[currentindex] = b;
				d[currentindex] = 6;
				currentindex++;
			}
			if(x>=7 && x<8) {
				int p = (int)Math.floor(Math.random()*Ingredient.freshies.length);
				int u = (int)Math.floor(Math.random()*Ingredient.freshies.length);
					while (p == u) {
						p = (int)Math.floor(Math.random()*Ingredient.freshies.length);
				}
				Ingredient[] a = {new Ingredient(Ingredient.breads[(int)Math.floor(Math.random()*Ingredient.breads.length)], 1), new Ingredient(Ingredient.mains[(int)Math.floor(Math.random()*Ingredient.mains.length)], 2, 3), new Ingredient(Ingredient.freshies[p], 5, 2), new Ingredient(Ingredient.freshies[u], 5, 2)};
				Sandwich b = new Sandwich("Good Sandwich", a);
				s[currentindex] = b;
				d[currentindex] = 7;
				currentindex++;
			}
			if(x>=8 && x<9) {
				int p = (int)Math.floor(Math.random()*Ingredient.freshies.length);
				int u = (int)Math.floor(Math.random()*Ingredient.freshies.length);
					while (p == u) {
						p = (int)Math.floor(Math.random()*Ingredient.freshies.length);
				}
				int m = (int)Math.floor(Math.random()*Ingredient.freshies.length);
				while(m == p || m == u) {
					m = (int)Math.floor(Math.random()*Ingredient.freshies.length);
				}
				Ingredient[] a = {new Ingredient(Ingredient.breads[(int)Math.floor(Math.random()*Ingredient.breads.length)], 1), new Ingredient(Ingredient.mains[(int)Math.floor(Math.random()*Ingredient.mains.length)], 2, 3), new Ingredient(Ingredient.cheeses[(int)Math.floor(Math.random()*Ingredient.cheeses.length)], 3, 2), new Ingredient(Ingredient.freshies[p], 5, 2), new Ingredient(Ingredient.freshies[u], 5, 2), new Ingredient(Ingredient.freshies[m], 5, 2)};
				Sandwich b = new Sandwich("The Random", a);
				s[currentindex] = b;
				d[currentindex] = 8;
				currentindex++;
			}
			if(x>=9 && x<10) {
				Ingredient[] a = {new Ingredient(Ingredient.breads[(int)Math.floor(Math.random()*Ingredient.breads.length)], 1), new Ingredient(Ingredient.mains[(int)Math.floor(Math.random()*Ingredient.mains.length)], 2, 3), new Ingredient(Ingredient.freshies[(int)Math.floor(Math.random()*Ingredient.freshies.length)], 5, 2)};
				Sandwich b = new Sandwich("WhatADelight", a);
				s[currentindex] = b;
				d[currentindex] = 9;
				currentindex++;
			}
		}
		return s;
	}
}