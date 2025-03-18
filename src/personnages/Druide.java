package personnages;

import objets.Chaudron;

public class Druide {
	private String nom;
	private objets.Chaudron chaudron = new Chaudron();
	private int forcePotion;
	private int quantitePotion;

	public String getNom() {
		return nom;
	}
	
	public Druide(String nom, int force) {
	    this.nom = nom;
	    
	}

	

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	public String prendreParole() {
		return "Le Druide " + nom + " : ";
	}

	public void fabriquerPotion(int doses, int force) {
	    chaudron.remplirChaudron(doses, force);
	    parler("J'ai concocté " + doses + " doses de potion magique. Elle a une force de " + force + ".");
	}

	public void boosterGaulois(Gaulois gaulois) {
	    if ("Obélix".equals(gaulois.getNom())) {
	        parler("Non, " + gaulois.getNom() + " ! Non !... Et tu le sais très bien !");
	    } else {
	        if (quantitePotion > 0) {
	            quantitePotion--;
	            gaulois.boirePotion(forcePotion); 
	            parler("Tiens " + gaulois.getNom() + ", un peu de potion magique.");
	        } else {
	            parler("Désolé " + gaulois.getNom() + ", il n'y a plus une seule goutte de potion.");
	        }
	    }
	}

}
