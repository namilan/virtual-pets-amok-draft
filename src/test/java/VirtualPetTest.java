import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VirtualPetTest {
	
	private String userPetName;
	private String userPetId;
	private int userPetHealth;
	private int userPetHunger;

	VirtualPet underTest = new VirtualPet (userPetName, userPetId, userPetHealth, userPetHunger, 0, 0, 0);
	
	@Test
	public void doesPetNameGetterWork () {
		String userPetName = "";
		underTest.name = userPetName;
		assertEquals("", underTest.getUserPetName());
	}
	
	@Test
	public void doesUserPetIdGetterWork() {
		String userPetId = "";
		underTest.type = userPetId;
		assertEquals("", underTest.getUserPetId());
	}
	
	@Test
	public void doesUserPetHealthGetterWork() {
		underTest.health = 50;
		assertEquals(50, underTest.getUserPetHealth());
	}
	
	@Test
	public void doesUserPetHungerGetterWork(){
		underTest.hunger = 50;
		assertEquals(50, underTest.getUserPetHunger());
	}
	
	@Test
	public void doesUserPetTreatGetterWork() {
		underTest.treat = 1;
		assertEquals(1, underTest.getUserPetTreat());
	}
	
	@Test
	public void doesUserPetThirstGetterWork() {
		underTest.thirst = 50;
		assertEquals(50, underTest.getUserPetThirst());
	}
	
	@Test
	public void doesUserPetPlayGetterWork() {
		underTest.play = 50;
		assertEquals(50, underTest.getUserPetPlay());
	}
	
	@Test
	public void doesUserPetBoredGetterWork() {
		underTest.bored = 25;
		assertEquals(25, underTest.getUserPetBored());
	}
	
	@Test
	public void doesUserPetCleanGetterWork() {
		underTest.clean = 25;
		assertEquals(25, underTest.getUserPetClean());
	}
	
	@Test 
	public void doesUserPetSoilGetterWork() {
		underTest.soil = 50;
		assertEquals(50, underTest.getUserPetSoil());
	}
	
	@Test
	public void isHungryMethodWorking_ShouldReturnTrue() {
		underTest.hunger = 50;
		assertTrue(underTest.isHungry());
	}
	
	@Test
	public void isTreatMethodWorking_ShouldReturnTrue() {
		underTest.treat = 1;
		assertTrue(underTest.isTreat());
	}
	
	@Test
	public void isFullMethodWorking_ShouldReturnTrue() {
		underTest.hunger = 50;
		assertTrue(underTest.isFull());
	}
	
	@Test
	public void isPetThirstyMethodWorking_ShouldReturnTrue() {
		underTest.thirst = 50;
		assertTrue(underTest.isThirsty());
	}
	
	@Test
	public void isPetNotThirstyMethodWorking_ShouldReturnTrue() {
		underTest.thirst = 50;
		assertTrue(underTest.isNotThirsty());
	}
	
	@Test
	public void isPetNeedingPlayMethodWorking_ShouldReturnTrue() {
		underTest.play = 50;
		assertTrue(underTest.isNeedingPlay());
	}
	
	@Test
	public void isPetSatisfiedMethodWorking_ShouldReturnTrue() {
		underTest.play = 50;
		assertTrue(underTest.isNotNeedingPlay());
	}
	
	@Test
	public void isPetBoredMethodWorking_ShouldReturnTrue() {
		underTest.bored = 50;
		assertTrue(underTest.isVeryBored());
	}
	
	@Test
	public void isPetNotBoredMethodWorking_ShouldReturnTrue() {
		underTest.bored = 50;
		assertTrue(underTest.isNotBored());
	}
	
	@Test
	public void isPetCageCleanMethodWorking_ShouldReturnTrue() {
		underTest.clean = 25;
		assertTrue(underTest.isClean());
	}
	
	@Test
	public void isPetCageDirtyMethodWorking_ShouldReturnTrue() {
		underTest.clean = 25;
		assertTrue(underTest.isNotClean());
	}
	
	@Test
	public void isPetGettingAdopted_ShouldReturnTrue() {
		underTest.adopt = 1;
		assertTrue(underTest.isAdopted());
	}
	
	@Test
	public void isPetGettingAddmitted_ShouldReturnTrue() {
		underTest.admit = 1;
		assertTrue(underTest.isAdmit());
	}
	
	@Test
	public void isHungerTicking() {
		underTest.hunger = 50;
		underTest.getUserPetHunger();
		assertEquals(50, underTest.getUserPetHunger());	
	}
	
	@Test
	public void isThirstTicking() {
		underTest.thirst = 50;
		underTest.getUserPetThirst();
		assertEquals(50, underTest.getUserPetThirst());
	}
	
	@Test
	public void isPlayTicking() {
		underTest.play = 50;
		underTest.getUserPetPlay();
		assertEquals(50, underTest.getUserPetPlay());
	}
	
	@Test
	public void isBoredTicking() {
		underTest.bored = 50;
		underTest.getUserPetBored();
		assertEquals(50, underTest.getUserPetBored());
	}
	
	@Test
	public void isCleanTicking() {
		underTest.clean = 50;
		underTest.getUserPetClean();
		assertEquals(50, underTest.getUserPetClean());
	}
	
	@Test
	public void tickResetHunger() {
		underTest.hunger = 50;
		underTest.getUserPetHunger();
		assertEquals(50, underTest.getUserPetHunger());
	}
	
	@Test
	public void tickResetThirst() {
		underTest.thirst = 50;
		underTest.getUserPetThirst();
		assertEquals(50, underTest.getUserPetThirst());
	}
	
	@Test
	public void tickResetPlay() {
		underTest.play = 50;
		underTest.getUserPetPlay();
		assertEquals(50, underTest.getUserPetPlay());
	}
	
	@Test
	public void tickResetBored() {
		underTest.bored = 50;
		underTest.getUserPetBored();
		assertEquals(50, underTest.getUserPetBored());
	}
	
	@Test
	public void tickResetClean() {
		underTest.clean = 50;
		underTest.getUserPetClean();
		assertEquals(50, underTest.getUserPetClean());
	}
	

}
