package personnages;

import personnages.Gaulois;

public class Druide {
	private String nom;
	private int force;
	private int forcePotion;
	private int quantitePotion;

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	public String prendreParole() {
		return "Le Druide " + nom + " : ";
	}

	public void fabriquerPotion(int doses, int force) {

		this.forcePotion = force;
		this.quantitePotion = doses;

		parler("J'ai concoté " + doses + "doses de potion magiques .Elle a une force" + forcePotion + ".");
	}

	public void boosterGaulois(Gaulois gaulois) {
		String nomGaulois = gaulois.getNom();
		if ("Obélix".equals(nomGaulois)) {
			parler("Non," + gaulois.getNom() + "Non!.... Et tu le sais trés bien !");
		} else {
			if (quantitePotion > 0) {
				quantitePotion--;
				gaulois.boirPotion(forcePotion);
				parler("Tiens " + nomGaulois + "un peu de potion magique .");
			} else {
				parler("Désolé" + nomGaulois + "il n'y a plus une seule goutte de potion;");
			}
		}
	}
}
