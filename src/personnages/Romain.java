package personnages;

import objets.Equipement;

public class Romain {
	private String nom;
	private int force;
	private objets.Equipement[] equipements = new Equipement[2];
	private int nbEquipements = 0;

	public Romain(String nom, int force) {
		isInvariantVerified(force);
		this.nom = nom;
		this.force = force;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public String getNom() {
		return nom;
	}

	private boolean isInvariantVerified(int force) {
		return force>=0;
	}

	public void recevoirCoup(int forceCoup) {

		isInvariantVerified(forceCoup);
		int ancienne = forceCoup;

		force -= forceCoup;
		if (force > 0) {
			System.out.println("Le Romain " + nom + " : \"Aïe\"");
		} else {
			System.out.println("Le Romain " + nom + " : \"J'abandonne !\"");
		}

		assert forceCoup <= ancienne;
	}
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipements) {
		case 2:
			  System.out.println("Le soldat" + nom + "est déjà bien protégé ! ");
			break;
		case 1:

			 if (equipements[0] == equipement) {
                 System.out.println("Le soldat " + nom + " possède déjà un " + equipement + " !");
             } else {
                equipements[nbEquipements++]=equipement;
                System.out.println("Le soldat " + nom + "s’équipe avec un "+ equipement + ".");
             }
			 break;
		case 0 : 
			equipements[nbEquipements++]=equipement ;
			System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
			
		}
		
	}	
			  
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		  minus.sEquiper(Equipement.CASQUE);
		  minus.sEquiper(Equipement.CASQUE);
		  minus.sEquiper(Equipement.BOUCLIER);
		  minus.sEquiper(Equipement.CASQUE);
		
	}

}