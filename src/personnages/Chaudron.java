package personnages;

public class Chaudron {
	private int quantitePotion = 0;
	private int forcePotion = 0;
	 
	
	
	public boolean resterPotion() {
	    return quantitePotion > 0;
	}
	
	public void remplirChaudron(int doses,int force) {
		this.forcePotion = force;
	    this.quantitePotion = doses;
	    
	    
		
	}
	
	
	
}

