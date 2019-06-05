import java.util.Collection;
import java.util.Random;

public class VirtualPet {
	
	private Random generator = new Random();
	
	protected String name = "";
	protected String type = "";
	protected int play = 50;
	protected int happiness = 50;
	protected int bored = 50;
	protected int adopt = 1;
	protected int admit = 1;

	public VirtualPet() {
		
	}
	
	public VirtualPet(String userPetName, String userPetId, int userPetHealth, int Hunger, int Thirst, int bored, int clean, int catLitterBox) {
		this.name = userPetName;
		this.type = userPetId;
		
	}
	
	
	public String getUserPetName() {
		return this.name;
	}

	public String getUserPetId() {
		return this.type;
	}
	
	
	public int getUserPetPlay() {
		return this.play;
	}
	
	public int getUserPetBored() {
		return this.bored;
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
	
	public boolean isAdopted() {
		return adopt <=1;
	}
	
	
	public boolean isAdmit() {
		return admit >=1;
	}
	
	public int generateRandom() {
		return generator.nextInt(1);
	}
	
	//Tick Method
	
	public void tick() {
	play -= (1 + generateRandom());
	bored += (1 + generateRandom());
	}
	
	//Tick Rest
	
	public void resetBored() {
		bored = 0;
	}

	public Collection<VirtualPet> values() {
		// TODO Auto-generated method stub
		return values();
	}
	
}