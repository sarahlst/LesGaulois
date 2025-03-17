package personnages;

public class Chaudron {
	private int quantitePotion = 0;
	
	 
	
	
	public boolean resterPotion() {
	    return quantitePotion > 0;
	}
	
	public void remplirChaudron(int doses,int force) {
  this.quantitePotion = doses;
	    
	    
		
	}
	
	
	
}

