import java.util.ArrayList;
import java.util.List;

public class VirtualPetShelter {
	
	List<VirtualPet> virtualPets;
	List<VirtualPet> robotInPlayhouse;

	public List <VirtualPet> getVirtualPets(){
		return virtualPets;
//	}
//	
//	
//	public String getUserPetNames() {
//		return this.getUserPetNames();
//	}
//	
//	public String getRobotPetNames() {
//		return this.getRobotPetNames();
//	}
//
//	public void printAllPetNames() {
//		System.out.println("Here are the current pets in the shelter:");
//		for (VirtualPet currentPet : getVirtualPets()){
//				System.out.println(currentPet.getUserPetName());
//		}
//	}
//	
////	public void printAllRoboPetNames() {
////		System.out.println("Here are the current robotic pets in the shelter:");
////		for (Robotic currentPets : getVirtualRobotPets()) {
////				System.out.println(currentPets.getUserPetRobotName());
////			
////		}
////	}
//	
//	public void giveATreat(VirtualPet pet) {
//		this.giveATreat(pet);
//	}
////	
////	public void giveATreatByName(String name) {
////		for(int t = 1; t < this.getVirtualPets.size(); t++) {
////			VirtualPet currentPet = new VirtualPet();
////			currentPet = this.virtualPets.get(t);
////			if(currentPet.getUserPetName().equalsIgnoreCase(name)) {
////				this.virtualPets.giveTreat(t);
////			}
////			
////		}
////	}
//	
//	public void adoptPet(VirtualPet pet) {
//		this.virtualPets.remove(pet);
//	}
//	
//	
//	public void adoptPetByName(String name) {
//		for(int x = 0; x < this.virtualPets.size(); x++) {
//			VirtualPet currentPet = new VirtualPet();
//			currentPet = this.virtualPets.get(x);
//			if(currentPet.getUserPetName().equalsIgnoreCase(name)) {
//				this.virtualPets.remove(x);
//			}	
//		}
//	}
//	
////	public void adoptRoboPets(VirtualPetRobot pet) {
////		this.robotPets.remove(pet);
////	}
////	
////	public void adoptPetByRobotName(String name) {
////		for(int r = 0; r < this.robotPets.size(); r++) {
////			Robotic currentPets = new VirtualPetRobot();
////			currentPets = this.robotPets.get(r);
////			if(currentPets.getUserPetRobotName().equalsIgnoreCase(name)) {
////				this.robotPets.remove(r);
////			}
////			
////		}
////	}
//	
//	public boolean isAdmit(VirtualPet pet) {
//		return this.virtualPets.add(pet);
//	}
//	
//	public void admitPetByName(String name, String type) {
//		VirtualPet newPet = new VirtualPet(name, type, 50, 43, 23, 67, 1, 25);
//		this.virtualPets.add(newPet);
//		}
//	
//	public boolean isAdmitRobot(VirtualPetRobot pet) {
//		return this.robotPets.add(pet);
//	}
//	
//	public void admitPetByRobotName(String robotName) {
//		VirtualPetRobot newPets = new VirtualPetRobot( robotName, " " , 23, 50, 50, 50);
//		this.robotPets.add(newPets);
//	}
//	
//	public boolean areThePetsHungry() {
//		for (VirtualPet currentPet : getVirtualPets()) {
//			if(currentPet.isHungry() == true) {
//				return true;
//			}
//		}
//		return false;
//		
//	}
//		
//	public boolean arePetsThirsty() {
//		for (VirtualPet currentPet : getVirtualPets()) {
//			if(currentPet.isThirsty() == true) {
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	public boolean areRobotsNeedingOil() {
//		for (Robotic currentPets : getVirtualRobotPets()) {
//			if(currentPets.robotOil() == true) {
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	public boolean areRobotsNeedingMaintenance() {
//		for (Robotic currentPets : getVirtualRobotPets()) {
//			if(currentPets.robotMaintenance() == true) {
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	public boolean areDogsNeedingWalked() {
//		for (VirtualPet currentPets : getVirtualPets()) {
//			if(currentPets.isDogNeedingWalked() == true) {
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	public boolean isNeedingPlay() {
//		for (VirtualPet currentPet : getVirtualPets()) {
//			if(currentPet.isNeedingPlay() == true) {
//				return true;
//			}
//		}
//		return false;
//		
//	}
//	
//	public boolean isNeedingClean() {
//		for (VirtualPet currentPet : getVirtualPets()) {
//			if(currentPet.isClean() == true) {
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	public boolean isCatLitterNeedingClean() {
//		for (VirtualPet currentPet : getVirtualPets()) {
//			if(currentPet.isLitterBoxClean() == true) {
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	public boolean isBored() {
//		for (VirtualPet currentPet : getVirtualPets ()) {
//			if(currentPet.isVeryBored() == true) {
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	public boolean isPetClean() {
//		for (VirtualPet currentPet : getVirtualPets()) {
//			if(currentPet.isClean() == true) {
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	// Tick Resets and Tick Methods ----------------------------------------
//	
//	public boolean makeDogsWalkTickReset() {
//		for (VirtualPet currentPet : getVirtualPets()) {
//			if(currentPet.isDogNeedingWalked() == true) {
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	public boolean makeAllBoredomTickReset() {
//		for (VirtualPet currentPet : getVirtualPets()) {
//			if(currentPet.isNeedingPlay() == true) {
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	public void makeAllPetsTick() {
//		for (VirtualPet currentPet : getVirtualPets()) {
//			currentPet.tick();
//		}
//	}
//	
//	public void makeAllPetBoredReset() {
//		for (VirtualPet currentPet : getVirtualPets()) {
//			currentPet.resetBored();
//		}
//	}
//	
//	public void makeAllPetTickCleanReset() {
//		for (VirtualPet currentPet : getVirtualPets()) {
//			currentPet.resetClean();
//		}
//	}
//	
//	public void makeKittyLitterCleanReset() {
//		for (VirtualPet currentPet : getVirtualPets()) {
//			currentPet.resetCleanLitter();
//		}
//	}
//	
//	public void makeAllPetHungerReset() {
//		for (VirtualPet currentPet : getVirtualPets()) {
//			currentPet.resetHungerTick();
//		}
//	}
//	
//	public void makeAllPetThirstReset() {
//		for (VirtualPet currentPet : getVirtualPets()) {
//			currentPet.resetThirstTick();
//		}
//	}
//	
//	public void makeAllRoboPetsTick() {
//			for (Robotic currentPets : getVirtualRobotPets()) {
//				currentPets.tick();
//			}
//	}
//	
//	public void makeAllRoboPetsTickOilReset() {
//		for (Robotic currentPets : getVirtualRobotPets()) {
//			currentPets.tickResetOil();
//		}
//	}
//	
//	public void makeRoboMaintenanceReset() {
//		for (Robotic currentPets : getVirtualRobotPets()) {
//			currentPets.tickRoboMaint();
//		}
//	}
//	
//	// Tick Resets and Tick Methods Ends ------------------------------------
//	
//	public boolean areAlive() {
//		for (VirtualPet currentPet : getVirtualPets()) {
//			if(currentPet.isAlive() == true) {
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	public boolean isStarving() {
//		for (VirtualPet currentPet : getVirtualPets()){
//			if(currentPet.isStarving() == true) {
//				return true;
//			}
//		}
//		return false;
//	}

}