package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;
import personnages.Chaudron;
public class TestGaulois {

	public static void main(String[] args) {
		/* Creation des personnages */

		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obelélix", 16);
		Romain minus = new Romain("Minus", 6);
		Romain brutus = new Romain("Brutus",14);
		
		

		/* faire parler les personnages */

		asterix.parler("Bonjour Obélix");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée.");

		System.out.println("Dans la  forêt" + asterix.getNom() + "et" + obelix.getNom()
				+ "tombe nez à nez sur le romain " + minus.getNom() + ".");

		for (int i = 1; i <= 3; i++) {
			asterix.frapper(minus);
		}
		

	}

}
