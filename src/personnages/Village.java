package personnages;

public class Village {

	private String nom;
	private Gaulois chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	public Gaulois getChef() {
        return chef;
    }

    public String getNom() {
        return nom;
    }
	public Village(String nom, Gaulois chef, int maxVillageois) {
		this.nom = nom;
		this.chef = chef;
		this.villageois = new Gaulois[maxVillageois];
	}


	public void ajouterVillageois(Gaulois gaulois) {
		if (nbVillageois < villageois.length) {
			villageois[nbVillageois] = gaulois;
			gaulois.Village(this);
			nbVillageois++;
		} else {
			System.out.println("Le village est plein !");
		}
	}

	public Gaulois trouverVillageois(int numero) {
		if (numero > 0 && numero <= nbVillageois) {
			return villageois[numero - 1];
		} else {
			System.out.println("Il n’y a pas autant d’habitants dans notre village !");
			return null;
		}
	}

	public void afficherVillageois() {
		System.out.println(
				"Dans le village \"" + nom + "\" du chef " + chef.getNom() + " vivent les légendaires gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i].getNom());
		}
	}

	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village("Village des Irréductibles", abraracourcix, 30);
		village.ajouterVillageois(abraracourcix);
        abraracourcix.sePresenter();
        
		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterVillageois(asterix);
        asterix.sePresenter();
        
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterVillageois(obelix);
		
		Gaulois DoublePolemix = new Gaulois("DoublePolémix", 4);
		
		DoublePolemix.sePresenter();
		
		/*Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois.getNom());*/
        System.out.println();
		village.afficherVillageois();
	}

}

