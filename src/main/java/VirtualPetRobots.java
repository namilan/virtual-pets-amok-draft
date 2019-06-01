import java.util.Collection;
import java.util.Random;

public class VirtualPetRobots {
	
	private Random generator = new Random();
	
	protected String robotName = "";
	protected String robotType = "";
	protected int robotMaintenance = 0;
	protected int robotOil = 0;
	protected int robotHappiness = 0; 
	protected int robotBored = 0;
	protected int robotClean = 0;
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
		return robotMaintenance = 0;
	}
	
	public int getUserRobotOil() {
		return robotOil = 0; 		
	}
	
	public int getUserRobotHappiness() {
		return robotHappiness = 0;
	}
	
	public int getUserRobotBored() {
		return robotBored = 0;
	}
	
	public boolean robotOil() {
		return robotOil == 0;
	}
	
	public boolean robotMaintenance() {
		return robotMaintenance == 0;
	}
	
	public boolean robotHappiness() {
		return robotHappiness == 0;		
	}
	
	public boolean robotBored() {
		return robotBored == 0;
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
	
	//Tick Method
	public void tick() {
		robotMaintenance += (1 + generateRandom());
		robotOil += (1 + generateRandom());
		robotHappiness += (1 + generateRandom());
		robotBored += (1 + generateRandom());
	}
}
