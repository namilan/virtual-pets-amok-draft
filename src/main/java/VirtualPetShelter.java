import java.util.ArrayList;
import java.util.List;

public class VirtualPetShelter {
	
	List<VirtualPet> virtualPets = new ArrayList<>();
	List<VirtualPetRobots> robotPets = new ArrayList<>();
	
	
	
	public List <VirtualPet> getVirtualPets(){
		return virtualPets;
	}
	
	public List <VirtualPetRobots> getVirtualRobotPets(){
		return robotPets;
	}
	
	
	public String getUserPetNames() {
		return this.getUserPetNames();
	}
	
	public String getRobotPetNames() {
		return this.getRobotPetNames();
	}

	public void printAllPetNames() {
		System.out.println("Here are the current pets in the shelter:");
		for (VirtualPet currentPet : getVirtualPets()){
				System.out.println(currentPet.getUserPetName());
		}
	}
	
	public void printAllRoboPetNames() {
		System.out.println("Here are the current robotic pets in the shelter:");
		for (VirtualPetRobots currentPets : getVirtualRobotPets()) {
				System.out.println(currentPets.getUserRobotName());
			
		}
	}
	
	public void adoptPet(VirtualPet pet) {
		this.virtualPets.remove(pet);
	}
	
	public void adoptPetByName(String name) {
		for(int x = 0; x < this.virtualPets.size(); x++) {
			VirtualPet currentPet = new VirtualPet();
			currentPet = this.virtualPets.get(x);
			if(currentPet.getUserPetName().equalsIgnoreCase(name)) {
				this.virtualPets.remove(x);
			}
		}
	}
	
	public boolean isAdmit(VirtualPet pet) {
		return this.virtualPets.add(pet);
	}
	
	public void admitPetByName(String name, String type) {
		VirtualPet newPet = new VirtualPet(name, type, 50, 43, 23, 67, 1, 25);
		this.virtualPets.add(newPet);
		}
	
	public boolean areThePetsHungry() {
		for (VirtualPet currentPet : getVirtualPets()) {
			if(currentPet.isHungry() == true) {
				return true;
			}
		}
		return false;
		
	}
		
	public boolean arePetsThirsty() {
		for (VirtualPet currentPet : getVirtualPets()) {
			if(currentPet.isThirsty() == true) {
				return true;
			}
		}
		return false;
	}
	
	public boolean areRobotsNeedingOil() {
		for (VirtualPetRobots currentPets : getVirtualRobotPets()) {
			if(currentPets.robotOil() == true) {
				return true;
			}
		}
		return false;
	}
	
	public boolean areRobotsNeedingMaintenance() {
		for (VirtualPetRobots currentPets : getVirtualRobotPets()) {
			if(currentPets.robotMaintenance() == true) {
				return true;
			}
		}
		return false;
	}
	
	public boolean areDogsNeedingWalked() {
		for (VirtualPet currentPets : getVirtualPets()) {
			if(currentPets.isDogNeedingWalked() == true) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isNeedingPlay() {
		for (VirtualPet currentPet : getVirtualPets()) {
			if(currentPet.isNeedingPlay() == true) {
				return true;
			}
		}
		return false;
		
	}
	
	public boolean isNeedingClean() {
		for (VirtualPet currentPet : getVirtualPets()) {
			if(currentPet.isClean() == true) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isCatLitterNeedingClean() {
		for (VirtualPet currentPet : getVirtualPets()) {
			if(currentPet.isLitterBoxClean() == true) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isBored() {
		for (VirtualPet currentPet : getVirtualPets ()) {
			if(currentPet.isVeryBored() == true) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isPetClean() {
		for (VirtualPet currentPet : getVirtualPets()) {
			if(currentPet.isClean() == true) {
				return true;
			}
		}
		return false;
	}
	
	public boolean makeDogsWalkTickReset() {
		for (VirtualPet currentPet : getVirtualPets()) {
			if(currentPet.isDogNeedingWalked() == true) {
				return true;
			}
		}
		return false;
	}
	
	public void makeAllPetsTick() {
		for (VirtualPet currentPet : getVirtualPets()) {
			currentPet.tick();
		}
	}
	
	public void makeAllPetTickCleanReset() {
		for (VirtualPet currentPet : getVirtualPets()) {
			currentPet.resetClean();
		}
	}
	
	public void makeKittyLitterCleanReset() {
		for (VirtualPet currentPet : getVirtualPets()) {
			currentPet.resetCleanLitter();
		}
	}
	
	public void makeAllPetHungerReset() {
		for (VirtualPet currentPet : getVirtualPets()) {
			currentPet.resetHungerTick();
		}
	}
	
	public void makeAllPetThirstReset() {
		for (VirtualPet currentPet : getVirtualPets()) {
			currentPet.resetThirstTick();
		}
	}
	
	public void makeAllRoboPetsTick() {
			for (VirtualPetRobots currentPets : getVirtualRobotPets()) {
				currentPets.tick();
			}
	}
	
	public void makeAllRoboPetsTickOilReset() {
		for (VirtualPetRobots currentPets : getVirtualRobotPets()) {
			currentPets.tickResetOil();
		}
	}
	
	public void makeRoboMaintenanceReset() {
		for (VirtualPetRobots currentPets : getVirtualRobotPets()) {
			currentPets.tickRoboMaint();
		}
	}
	
	public boolean areAlive() {
		for (VirtualPet currentPet : getVirtualPets()) {
			if(currentPet.isAlive() == true) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isStarving() {
		for (VirtualPet currentPet : getVirtualPets()){
			if(currentPet.isStarving() == true) {
				return true;
			}
		}
		return false;
	}

}