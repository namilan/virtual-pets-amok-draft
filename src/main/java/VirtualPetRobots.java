import java.util.Collection;
import java.util.Random;

public class VirtualPetRobots {
	
	private Random generator = new Random();
	
	protected String robotName = "";
	protected String robotType = "";
	protected int robotMaintenance = 23;
	protected int robotOil = 50;
	protected int robotHappiness = 50; 
	protected int robotBored = 50;
	protected int robotAdopt = 1; 
	protected int robotAdmit = 1;
	
	public VirtualPetRobots() {
		
	}
	
	public VirtualPetRobots(String userRobotName, String userRobotType, int userRobotMaintenance, int userRobotOil, int userRobotHappiness, int userRobotBored) {
	this.robotName = userRobotName;
	this.robotType = userRobotType;
	this.robotMaintenance = userRobotMaintenance;
	
	}

	public String getUserRobotName() {
		return this.robotName;
	}
	
	public String getUserRobotType() {
		return this.robotType;
	}
	
	public int getUserRobotMaintenance() {
		return robotMaintenance = 23;
	}
	
	public int getUserRobotOil() {
		return robotOil = 50; 		
	}
	
	public int getUserRobotHappiness() {
		return robotHappiness = 50;
	}
	
	public int getUserRobotBored() {
		return robotBored = 50;
	}
	
	public boolean robotOil() {
		return robotOil == 50;
	}
	
	public boolean robotMaintenance() {
		return robotMaintenance == 23;
	}
	
	public boolean robotHappiness() {
		return robotHappiness == 50;		
	}
	
	public boolean robotBored() {
		return robotBored == 50;
	}
	
	public boolean robotAdopt() {
		return robotAdopt >= 1;
	}
	
	public boolean robotAdmit() {
		return robotAdmit <= 1;
	}
	
	public int generateRandom() {
		return generator.nextInt(1);
	}
	
	public Collection <VirtualPetRobots> robotValues() {
		return robotValues();
	}
	
	//Tick Method
	public void tick() {
		robotMaintenance += (1 + generateRandom());
		robotOil += (1 + generateRandom());
		robotHappiness += (1 + generateRandom());
		robotBored += (1 + generateRandom());
	}
	
	//Tick Method Reset
	public void tickReset() {
		robotMaintenance = 0;
		robotOil = 0;
		robotHappiness = 50;
		robotBored = 0;
	}
	
	boolean isRobotAlive() {
		if ( robotOil == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	boolean isRobotBored() {
		if ( robotBored >= 100) {
			return true;
		} else {
			return false;
		}
	}
}
