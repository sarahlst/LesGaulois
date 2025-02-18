package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois {

	public static void main(String[] args) {
		/* Creation des personnages */

		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obelélix", 16);

		/* faire parler les personnages */

		asterix.parler("Bonjour Obélix");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée.");

	}

}
