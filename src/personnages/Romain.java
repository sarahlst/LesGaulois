package personnages;

public class Romain {
	private String nom;
	private int force;

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
		return force >= 0;
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
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",-6);
		
		
	}

}