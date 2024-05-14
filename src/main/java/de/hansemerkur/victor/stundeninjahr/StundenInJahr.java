package de.hansemerkur.victor.stundeninjahr;

public class StundenInJahr {
	public static void main(String[] args) {

		var stundenInJahr = 24 * 365;
		var stundenInSchaltjahr = 24 * 366;

		var minInSchaltjahren = 60 * 24 * 366 * 2;
		var minInNormalenJahren = 60 * 24 * 365 * 8;
		var minutenInJahrzent = minInSchaltjahren + minInNormalenJahren;

		var meineJahreInSekunden = 30 * 365 * 24 * 60 * 60;
		var meineTageInSekunden = 272 * 24 * 60 * 60;
		var meinAlterInSekunden = meineJahreInSekunden + meineTageInSekunden;

		var alterDesAutors = 1_160_000_000 / 60 / 60 / 24 / 365;
		var alterDesAutorsAnfangDesBuches = 800_000_000 / 60 / 60 / 24 / 365;

		System.out.printf("\nDas sind die minuten in einer Jahrzehnt: %d ", minutenInJahrzent);
		System.out.printf("\nIn einem Jahr sind: %d Stunden\n", stundenInJahr);
		System.out.printf("\nIn einem Jahr sind: %d Stunden\n", stundenInSchaltjahr);
		System.out.printf("\ndas ist mein Alter in Sekunden: %d Sekunden\n", meinAlterInSekunden);
		System.out.printf(
				"\ndas ist das Alter des Autors, als er angefangen hat das buch zu schreiben: %d Jahre\nund das hier, sein aktuelles Alter: %d Jahre\n",
				alterDesAutorsAnfangDesBuches, alterDesAutors);

	}
}