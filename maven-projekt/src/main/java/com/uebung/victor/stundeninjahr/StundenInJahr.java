package com.uebung.victor.stundeninjahr;

public class StundenInJahr {
	public static void main(String[] args) {

		int stundenInJahr = 24 * 365;
		int stundenInSchaltjahr = 24 * 366;

		int minInSchaltjahren = 60 * 24 * 366 * 2;
		int minInNormalenJahren = 60 * 24 * 365 * 8;
		int minutenInJahrzent = minInSchaltjahren + minInNormalenJahren;

		int meineJahreInSekunden = 30 * 365 * 24 * 60 * 60;
		int meineTageInSekunden = 272 * 24 * 60 * 60;
		int meinAlterInSekunden = meineJahreInSekunden + meineTageInSekunden;

		int alterDesAutors = 1_160_000_000 / 60 / 60 / 24 / 365;
		int alterDesAutorsAnfangDesBuches = 800_000_000 / 60 / 60 / 24 / 365;

		System.out.printf("Das sind die minuten in einer Jahrzehnt:%d ", minutenInJahrzent);
		System.out.printf("\nIn einem Jahr sind:%d Stunden\n", stundenInJahr);
		System.out.printf("\nIn einem Jahr sind:%d Stunden\n", stundenInSchaltjahr);
		System.out.printf("\ndas ist mein Alter in Sekunden:%d Sekunden\n", meinAlterInSekunden);
		System.out.printf(
				"\ndas ist das Alter des Autors, als er angefangen hat das buch zu schreiben:%d Jahre\nund das hier, sein aktuelles Alter:%d Jahre\n",
				alterDesAutorsAnfangDesBuches, alterDesAutors);

	}
}