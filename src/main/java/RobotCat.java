

public class RobotCat extends VirtualPet implements Robotic {

	protected int robotMaintenance = 23;
	protected int robotOil = 50;
	
	public int getUserRobotMaintenance() {
		return robotMaintenance = 23;
	}
	public boolean robotMaintenance() {
		return robotMaintenance >= 23;
	}
	
	public boolean robotNotNeedingMaint() {
		return robotMaintenance <= 23;
	}
		
	public int getUserRobotOil() {
		return robotOil = 50; 		
	}
	public boolean robotOil() {
		return robotOil >= 50;
	}
	
	public boolean isRobotNotNeedingOil() {
		return robotOil <=50;
	}
	public void tick() {
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
