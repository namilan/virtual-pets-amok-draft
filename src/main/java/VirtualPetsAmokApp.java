import java.util.List;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class VirtualPetsAmokApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		VirtualPetShelter ronnysPlayHouse = new VirtualPetShelter();
		List<VirtualPet> petsInPlayhouse = ronnysPlayHouse.getVirtualPets();
		 
		
		VirtualPet ronny = new VirtualPet("Ronny", "Raptor", 50, 50, 50, 50, 100);
		petsInPlayhouse.add(ronny);
		VirtualPet spike = new VirtualPet("Spike", "Stegosaurus", 50, 50, 50, 50, 100);
		petsInPlayhouse.add(spike);
		VirtualPet ducky = new VirtualPet("Ducky", "Saurolophus", 50, 50, 50, 50, 100);
		petsInPlayhouse.add(ducky);
		
	
	do {
		
		System.out.println("Welcome to Ronny's Play House");
		System.out.println("");
		ronnysPlayHouse.printAllPetNames();
		
		
		System.out.println("\n This is the status of your pets: ");
		System.out.println("\nName\t|Hunger\t|Thirst\t|Boredom|Cage Condition");
		System.out.println("--------|-------|-------|-------|-------");
		
		for (VirtualPet currentPet : ronnysPlayHouse.getVirtualPets()) {
			System.out.println(currentPet.name + "\t|" + currentPet.hunger + "\t|" + currentPet.thirst + "\t|"
					+ currentPet.bored + "\t|" + currentPet.clean);
			
		}
		System.out.println("");
		System.out.println("Here are some options for you!");
		System.out.println("1: Would you like to feed the pets?");
		System.out.println("2: Would you like to water all the pets?");
		System.out.println("3: Would you like to clean the cages?");
		System.out.println("4: Which pet would you like to play with?");
		System.out.println("5: Which pet would you like to adopt?");
		System.out.println("6: Would you like to admit a pet?");
		System.out.println("7: Quit. ");
		
		int userInput = input.nextInt();
		
		switch (userInput) {
		case 1:
			if (ronnysPlayHouse.areThePetsHungry()) {
				System.out.println("You fed the pets!");
				ronnysPlayHouse.makeAllPetsTick();
			}else {
				System.out.println("Pets were not hungry afterall."); 
				ronnysPlayHouse.makeAllPetsTick();
				}
		break;
		case 2:
			if (ronnysPlayHouse.arePetsThirsty()) {
				System.out.println("You watered the pets!");
				ronnysPlayHouse.makeAllPetsTick();
			} else {
				System.out.println("Pet's were not thirsty afterall.");
				ronnysPlayHouse.makeAllPetsTick();
			}
		break;
		case 3:
			if(ronnysPlayHouse.isNeedingClean()) {
				System.out.println("You cleaned the cages!");
				ronnysPlayHouse.makeAllPetsTick();
			} else {
				System.out.println("Cages were just clean! Nevermind. ");
				ronnysPlayHouse.makeAllPetsTick();
			}
		break;
		case 4:
			if(ronnysPlayHouse.isNeedingPlay()) {
				System.out.println("You played with all your pets!");
				ronnysPlayHouse.makeAllPetsTick();
			} else {
				System.out.println("They didn't want to play afterall.");
				ronnysPlayHouse.makeAllPetsTick();
			}
			
		break;
		case 5:
				System.out.println("Please choose a pet that you would like to adopt?");
				ronnysPlayHouse.printAllPetNames();
				System.out.println("Please enter their name here. ");
				input.nextLine();
				String adoptPet = input.nextLine();
				ronnysPlayHouse.adoptPetByName(adoptPet);
				System.out.println("You have adopted your pet. Please take great care of them!");
				System.out.println("Remaining pets in the shelter as follows:");
				ronnysPlayHouse.printAllPetNames();
		break;
		case 6:
				System.out.println("Please provide the name of the pet to admit today.");
				input.nextLine();
				String name = input.nextLine();
				System.out.println("Please provide the type of pet you are admitting.");
				String type = input.nextLine();
				ronnysPlayHouse.admitPetByName(name, type);
				System.out.println("We will take great care of your critter.");
		break;
		case 7:
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		
		default:
			System.out.println("You did not enter a valid response. Try again.\n");
			continue;
			
		}
	
	} while (ronnysPlayHouse.areAlive());
	
	if (ronnysPlayHouse.isStarving()) {	
		System.out.println("Pets starved and died.");
	}
	System.out.println("Game Over.");
	
	input.close();
	
	} // end of app
	
} // end of class