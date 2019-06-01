import java.util.Collection;
import java.util.Random;

public class VirtualPet {
	
	private Random generator = new Random();
	
	protected String name = "";
	protected String type = "";
	protected int health = 50;	
	protected int hunger = 50;
	protected int thirst = 50;
	protected int play = 50;
	protected int bored = 50;
	protected int clean = 25;
	protected int soil = 50;
	protected int treat = 1;
	protected int adopt = 1;
	protected int admit = 1;

	public VirtualPet() {
		
	}
	
	public VirtualPet(String userPetName, String userPetId, int userPetHealth, int Hunger, int Thirst, int bored, int clean) {
		this.name = userPetName;
		this.type = userPetId;
		this.health = userPetHealth;
		
	}
	
	
	public String getUserPetName() {
		return this.name;
	}

	public String getUserPetId() {
		return this.type;
	}
	
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
	
	public int getUserPetPlay() {
		return this.play;
	}
	
	public int getUserPetBored() {
		return this.bored;
	}
	
	public int getUserPetClean() {
		return this.clean;
	}
	
	public int getUserPetSoil() {
		return this.soil;
	}
	
	public boolean isHungry() {
		return hunger <= 50;
	}
	
	public boolean isTreat() {
		return treat == 1;
	}
	
	public boolean isFull() {
		return hunger >= 50;
	}
	
	public boolean isThirsty() {
		return thirst <=50;
	}
	
	public boolean isNotThirsty() {
		return thirst >=50;
	}
	
	public boolean isNeedingPlay() {
		return play <=50;
	}
	
	public boolean isNotNeedingPlay() {
		return play >=50;
	}
	
	public boolean isVeryBored() {
		return bored <=50;
	}

	public boolean isNotBored() {
		return bored >=50;
	}
	
	public boolean isClean() {
		return clean == 25;
	}
	
	public boolean isNotClean() {
		return clean <=25;
	}
	
	public boolean isAdopted() {
		return adopt <=1;
	}
	
	
	public boolean isAdmit() {
		return admit >=1;
	}
	
	public boolean isStarving() {
		return hunger <= 100;
	} 
	
	public int generateRandom() {
		return generator.nextInt(1);
	}
	
	//Tick Method
	
	public void tick() {
	hunger += (1 + generateRandom());
	thirst -= (1 + generateRandom());
	play -= (1 + generateRandom());
	bored += (1 + generateRandom());
	clean += (1 + generateRandom());
	}
	
	//Tick Rest
	public void reset() {
		hunger = 50;
		thirst = 50;
		play = 50;
		bored = 50;
		clean = 50;
	}

	public Collection<VirtualPet> values() {
		// TODO Auto-generated method stub
		return values();
	}
	
	boolean isAlive() {
		if(hunger < 100 && bored < 100 && thirst < 100 && clean < 100) {
			return true;
		} else {
			return false;
		}
		
	}
}