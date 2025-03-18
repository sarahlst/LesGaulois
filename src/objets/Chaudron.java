package objets;

public class Chaudron {
	private int quantitePotion = 0;
	private int doses ;
	private int force ;
	 
	
	
	public boolean resterPotion() {
	    return quantitePotion > 0;
	}
	
	public void remplirChaudron(int doses,int force) {
         this.doses = doses;
         this.force= force;
	    
	    
		
	}
	
	
	
}
