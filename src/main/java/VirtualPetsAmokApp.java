import java.util.List;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class VirtualPetsAmokApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		VirtualPetShelter ronnysPlayHouse = new VirtualPetShelter();
		VirtualPetShelter roboInPlayhouse = new VirtualPetShelter();
		List<VirtualPet> petsInPlayhouse = ronnysPlayHouse.getVirtualPets();
		List<VirtualPet> robotInPlayhouse = roboInPlayhouse.getVirtualPets();
		 
		
		VirtualPet roofus = new VirtualPet("Roofus", "Dog", 50, 50, 50, 50, 100, 0);
		petsInPlayhouse.add(roofus);
		VirtualPet kitty = new VirtualPet("Kitty", "Cat", 50, 50, 50, 50, 0, 25);
		petsInPlayhouse.add(kitty);
		VirtualPetRobot bork = new VirtualPetRobot("Bork", "Robot Dog", 23, 50, 50, 50);
		robotInPlayhouse.add(bork);
		VirtualPetRobot cookies = new VirtualPetRobot("Cookies", "Robot Cat", 23, 50, 50, 50);
		robotInPlayhouse.add(cookies);
		
	
	do {
		
		System.out.println("Welcome to Ronny's Play House");
		System.out.println("");
		ronnysPlayHouse.printAllPetNames();
		System.out.println("");
		roboInPlayhouse.printAllRoboPetNames();

		
		System.out.println("\n This is the status of your organic pets: ");
		System.out.println("\nName\t|Hunger\t|Thirst\t|Boredom|Cage Condition |Kitty Litter|");
		System.out.println("--------|-------|-------|-------|---------------|------------");
		
		for (VirtualPet currentPet : ronnysPlayHouse.getVirtualPets()) {
			System.out.println(currentPet.name + "\t|" + currentPet.hunger + "\t|" + currentPet.thirst + "\t|"
					+ currentPet.bored + "\t|" + currentPet.clean + "\t \t|" + currentPet.catLitterBox);
		}
			
		System.out.println("\n This is the status of your robotic pets: ");
		System.out.println("\nName\t|Maintenance\t|Oil\t|Happiness");
		System.out.println("--------|---------------|-------|-------");
		
		for (VirtualPetRobot currentPets : roboInPlayhouse.getVirtualRobotPets()) {
			System.out.println(currentPets.robotName + "\t|" + currentPets.robotMaintenance + "\t \t|" + currentPets.robotOil + "\t|"
					+ currentPets.robotHappiness);
			
		}
		System.out.println("");
		System.out.println("Here are some options for you!");
		System.out.println("1: Would you like to feed the fluffy pets?");
		System.out.println("2: Would you like to oil the robot pets?");
		System.out.println("3: Would you like to water all the fluffy pets?");
		System.out.println("4: Would you like to clean the fluffy dog cages?");
		System.out.println("5: Would you like the clean the kitty litter boxes?");
		System.out.println("6: Would you like to provide maintenance for your robot pets?");
		System.out.println("7: Would you like to walk the dogs?");
		System.out.println("8: Which pet would you like to give a treat to?");
		System.out.println("9: Which pet would you like to play with?");
		System.out.println("10: Which pet would you like to adopt?");
		System.out.println("11: Would you like to admit a fluffy pet?");
		System.out.println("12: Would you like to admit a robot pet?");
		System.out.println("13: Quit. ");
		
		int userInput = input.nextInt();
		
		switch (userInput) {
		case 1:
			if (ronnysPlayHouse.areThePetsHungry()) {
				System.out.println("You fed the pets!");
				ronnysPlayHouse.makeAllPetHungerReset();
				ronnysPlayHouse.makeAllPetsTick();
			} else {
				System.out.println("Pets were not hungry afterall."); 
				ronnysPlayHouse.makeAllPetsTick();
				}
		break;
		case 2: 
			if (roboInPlayhouse.areRobotsNeedingOil()) {
				System.out.println("You oiled your robots");
				roboInPlayhouse.makeAllRoboPetsTickOilReset();
				roboInPlayhouse.makeAllRoboPetsTick();
			} else {
				System.out.println("No Oil Needed.");
				roboInPlayhouse.makeAllRoboPetsTick();
			}
		break;
		case 3:
			if (ronnysPlayHouse.arePetsThirsty()) {
				System.out.println("You watered the fluffy doggo's and kitties!");
				ronnysPlayHouse.makeAllPetThirstReset();
				ronnysPlayHouse.makeAllPetsTick();
			} else {
				System.out.println("They're just going to let the water sit. Not thirsty at this time.");
				ronnysPlayHouse.makeAllPetsTick();
			}
		break;
		case 4:
			if(ronnysPlayHouse.isNeedingClean()) {
				System.out.println("You cleaned the dog cages!");
				ronnysPlayHouse.makeAllPetTickCleanReset();
				ronnysPlayHouse.makeAllPetsTick();
			} else {
				System.out.println("Cages were just cleaned!");
				ronnysPlayHouse.makeAllPetsTick();
			}
		break;
		case 5:
			if(ronnysPlayHouse.isCatLitterNeedingClean()) {
				System.out.println("You cleaned the kitty litter boxes!");
				ronnysPlayHouse.makeKittyLitterCleanReset();
				ronnysPlayHouse.makeAllPetsTick();
			} else {
				System.out.println("Kitty litter is clean!");
				ronnysPlayHouse.makeAllPetsTick();
			}
		break;
		case 6:
			if(roboInPlayhouse.areRobotsNeedingMaintenance()) {
				System.out.println("Robots are Perfect!");
				roboInPlayhouse.makeRoboMaintenanceReset();
				roboInPlayhouse.makeAllRoboPetsTick();
			} else {
				System.out.println("Robots are already perfect!");
				roboInPlayhouse.makeAllRoboPetsTick();
			}
		break;
		case 7:
			if(ronnysPlayHouse.areDogsNeedingWalked()) {
				System.out.println("Let's take the floof dogs for a walk!");
				System.out.println("Doggos enjoyed the walk! Nice job!");
				ronnysPlayHouse.makeAllPetTickCleanReset();
				ronnysPlayHouse.makeAllPetsTick();
			} else {
				System.out.println("They're pooped. They don't need a walk.");
				ronnysPlayHouse.makeAllPetsTick();
			}
		break;
//		case 8:
//				System.out.println("Which pet would you like to give a treat to today?");
//				input.nextLine();
//				String nameOrganic = input.nextLine();
//				System.out.println("Please provide the pet a treat.");
//				String treat = input.nextLine();
//				ronnysPlayHouse.printAllPetNames();
//			if(ronnysPlayHouse.arePetsGettingATreat()) {
//				System.out.println("You gave your pet a treat!");
//				ronnysPlayHouse.makeAllPetsTick();
//			} else {
//				System.out.println("They didn't want a treat? First time for everything.");
//				ronnysPlayHouse.makeAllPetsTick();
//			}
//		case 9:
//			if(ronnysPlayHouse.isNeedingPlay()) {
//				System.out.println("You played with all your pets!");
//				ronnysPlayHouse.makeAllPetBoredReset();
//				ronnysPlayHouse.makeAllPetsTick();
//			} else {
//				System.out.println("They didn't want to play after-all.");
//				ronnysPlayHouse.makeAllPetsTick();
//			}
//			
//		break;
		case 10:
				System.out.println("Please choose a pet that you would like to adopt?");
				ronnysPlayHouse.printAllPetNames();
				roboInPlayhouse.printAllRoboPetNames();
				System.out.println("Please enter their name here. ");
				input.nextLine();
				String adoptPet = input.nextLine();
				String adoptRoboPet = input.nextLine();
				ronnysPlayHouse.adoptPetByName(adoptPet);
				roboInPlayhouse.adoptPetByRobotName(adoptRoboPet);
				System.out.println("You have adopted your pet. Please take great care of them!");
				System.out.println("Remaining pets in the shelter as follows:");
				ronnysPlayHouse.printAllPetNames();
				roboInPlayhouse.printAllRoboPetNames();
		break;
		case 11:
				System.out.println("Do you have a fluffy pet you would like to admit today?");
				System.out.println("If so, what is their name?");
				input.nextLine();
				String name = input.nextLine();
				System.out.println("Please provide the type of pet you are admitting.");
				String type = input.nextLine();
				ronnysPlayHouse.admitPetByName(name, type);
				System.out.println("We will take great care of your floofs.");
		break;
		case 12:
				System.out.println("Do you have a robot pet you would like to admit today?");
				System.out.println("If so, what is their name?");
				input.nextLine();
				String robotName = input.nextLine();
				roboInPlayhouse.admitPetByRobotName(robotName);
				System.out.println("We will take great care of your little robot.");
		break;
		case 13:
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