package personnages;


public class Gaulois {
	private String nom;
	private int force;
    private int effetPotion = 1;
	private personnages.Village village;
    
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
	
	public void Village(Village village) {
        this.village = village;
    }
	
	public void sePresenter() {
        if (village != null) {
            if (village.getChef() == this) {
                System.out.println("Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom + 
                                   ". Je suis le chef du village " + village.getNom() + ".\"");
            } else {
                System.out.println("Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom + 
                                   ". J'habite le village " + village.getNom() + ".\"");
            }
        } else {
            System.out.println("Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom + 
                               ". Je voyage de villages en villages.\"");
        }
    }

}
