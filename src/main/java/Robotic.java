import java.util.Collection;

public interface Robotic {

	String getUserPetRobotName();

	String getUserRobotType();

	int getUserRobotMaintenance();

	int getUserRobotOil();

	int getUserRobotHappiness();

	int getUserRobotBored();

	boolean robotOil();

	boolean isRobotNotNeedingOil();

	boolean robotMaintenance();

	boolean robotNotNeedingMaint();

	boolean robotHappiness();

	boolean robotBored();

	boolean robotAdopt();

	boolean robotAdmit();

	int generateRandom();

	Collection<VirtualPetRobot> robotValues();

	//Tick Method
	void tick();

	//Tick Method Reset
	void tickResetOil();

	void tickRoboMaint();

}