
public class RobotDog extends VirtualPet implements Robotic {
	
	protected int walkDog = 25;
	protected int robotMaintenance = 23;
	protected int robotOil = 50;
	
	public int getUserWalkDog() {
		return this.walkDog;
	}
	
	public int getUserRobotMaintenance() {
		return robotMaintenance = 23;
	}
	
	public int getUserRobotOil() {
		return robotOil = 50; 		
	}
	
	public boolean robotMaintenance() {
		return robotMaintenance >= 23;
	}
	
	public boolean robotNotNeedingMaint() {
		return robotMaintenance <= 23;
	}
	
	
	public boolean robotOil() {
		return robotOil >= 50;
	}
	
	public boolean isRobotNotNeedingOil() {
		return robotOil <=50;
	}
	
	public boolean isDogNeedingWalked() {
		return walkDog <=25;
	}
	
	public boolean isDogNeedingBreak() {
		return walkDog >=25;
	}
	
	public void tick() {
	walkDog -= (3 + generateRandom());
	robotMaintenance += (1 + generateRandom());
	robotOil -= (1 + generateRandom());
	}
	
	public void tickResetOil() {
		robotOil = 100;
	}
	
	public void tickRoboMaint() {
		robotMaintenance = 0;
	}
	
	boolean isRobotAlive() {
		if ( robotOil == 100) {
			return true;
		} else {
			return false;
		}
	}
	
	

}
