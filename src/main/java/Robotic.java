

public interface Robotic {

	int getUserRobotMaintenance();

	int getUserRobotOil();

	boolean robotOil();

	boolean isRobotNotNeedingOil();

	boolean robotMaintenance();

	boolean robotNotNeedingMaint();

	//Tick Method Reset
	void tickResetOil();

	void tickRoboMaint();

}