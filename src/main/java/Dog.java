
public class Dog extends VirtualPet {
	
	protected int health = 50;	
	protected int hunger = 50;
	protected int thirst = 50;
	protected int clean = 25;
	protected int soil = 50;
	protected int walkDog = 25;
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
	
	public int getUserPetClean() {
		return this.clean;
	}
	
	public int getUserPetSoil() {
		return this.soil;
	}
	
	public int getUserWalkDog() {
		return this.walkDog;
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
	
	public boolean isClean() {
		return clean >= 25;
	}
	
	public boolean isNotClean() {
		return clean <=25;
	}
	public boolean isDogNeedingWalked() {
		return walkDog <=25;
	}
	
	public boolean isDogNeedingBreak() {
		return walkDog >=25;
	}
	
	public boolean isStarving() {
		return hunger <= 100;
	} 
	
	public void tick() {
	hunger += (1 + generateRandom());
	thirst += (1 + generateRandom());
	clean += (4 + generateRandom());
	walkDog -= (3 + generateRandom());
	}
	
	public void resetHungerTick() {
		hunger = 0;
	}
	
	public void resetThirstTick() {
		thirst = 0;
	}
	
	boolean isAlive() {
		if(hunger < 100 && bored < 100 && thirst < 100 ) {
			return true;
		} else {
			return false;
		}
		
	}
	
	boolean isSoiled() {
		if (clean < 100 ) {
			return true;
		} else {
			return false;
		}
	}
}
