
public class Cat extends VirtualPet {
	
	protected int health = 50;	
	protected int hunger = 50;
	protected int thirst = 50;
	protected int catLitterBox = 25;
	protected int treat = 1;
	
	public int getUserPetHealth() {
		return this.health;
	}
	
	public int getUserPetHunger() {
		return this.hunger;
	}
	
	public int getUserPetTreat() {
		return this.treat;
	}
	
	public int getUserPetThirst() {
		return this.thirst;
	}
	public int getUserCatLitterBox() {
		return this.catLitterBox;
	}
	
	public boolean isHungry() {
		return hunger >= 50;
	}
	
	public boolean isTreat() {
		return treat == 1;
	}
	
	public boolean isFull() {
		return hunger <= 50;
	}
	
	public boolean isThirsty() {
		return thirst >=50;
	}
	
	public boolean isNotThirsty() {
		return thirst <=50;
	}
	
	public boolean isLitterBoxClean() {
		return catLitterBox >= 25;
	}
	
	public boolean isLitterBoxNotClean() {
		return catLitterBox <=25;
	}
	
	public boolean isStarving() {
		return hunger <= 100;
	} 
	
	public void tick() {
	hunger += (1 + generateRandom());
	thirst += (1 + generateRandom());
	catLitterBox += (3 + generateRandom());
	}
	
	public void resetHungerTick() {
		hunger = 0;
	}
	
	public void resetThirstTick() {
		thirst = 0;
	}
	
	public void resetCleanLitter() {
		catLitterBox = 0;
	}
	
	boolean isAlive() {
		if(hunger < 100 && bored < 100 && thirst < 100 ) {
			return true;
		} else {
			return false;
		}
		
	}
	
	boolean isSoiled() {
		if (catLitterBox < 100 ) {
			return true;
		} else {
			return false;
		}
	}

}
