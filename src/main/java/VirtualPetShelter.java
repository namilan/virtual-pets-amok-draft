import java.util.ArrayList;
import java.util.List;

public class VirtualPetShelter {
	
	List<VirtualPet> virtualPets = new ArrayList<>();
	
	
	
	public List <VirtualPet> getVirtualPets(){
		return virtualPets;
	}
	
	public String getUserPetNames() {
		return this.getUserPetNames();
	}

	public void printAllPetNames() {
		System.out.println("Here are the current pets in the shelter:");
		for (VirtualPet currentPet : getVirtualPets()){
				System.out.println(currentPet.getUserPetName());
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
		VirtualPet newPet = new VirtualPet(name, type, 50, 43, 23, 67, 1);
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
	
	public void makeAllPetsTick() {
		for (VirtualPet currentPet : getVirtualPets()) {
			currentPet.tick();
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