package personnages;

public class Gaulois {
	private String nom;
	private int force;
    private int effetPotion = 1;
    
	public Gaulois(String nom, int force) {

		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	@Override
	public String toString() {
		return nom;
	}

	public void frapper(Romain romain) {
	    int forceCoup = (force * effetPotion) / 3; // La force du coup est multipliée par l'effet de la potion et divisée par 3
	    
	    System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
	    romain.recevoirCoup(forceCoup);
	    
	    // L'effet de la potion diminue, mais reste au minimum à 1
	    if (effetPotion > 1) {
	        effetPotion--;
	    }
	}

	public void boirePotion(int forcePotion) {
		this.effetPotion=forcePotion;
		
	}


	/* affiche l'adresse memoire */

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix);

	}

}
