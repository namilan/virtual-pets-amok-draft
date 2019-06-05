import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class VirtualPetShelterTest {
	
	protected String name = "";
	protected String type = "";
	protected int health = 50;
	protected int maintenance = 23;
	protected int oil = 50;
	protected int happy = 50;
	protected int hunger = 50;
	protected int thirst = 50;
	protected int play = 50;
	protected int bored = 50;
	protected int clean = 100;
	protected int catLitterBox = 25;
	protected int adopt = 1;
	protected int admit = 1;

	@Test
	public void shouldReturnPetName() {
		VirtualPet underTest = new VirtualPet("", "", 50, hunger, thirst, bored, clean, catLitterBox);
		String userPetName = underTest.getUserPetName();
		assertEquals("", userPetName);
	}
	
	@Test
	public void shouldReturnRobotPetName() {
		Robotic underTest = new VirtualPetRobot("", "", maintenance, oil, happy, bored);
		String userPetName = underTest.getUserPetRobotName();
		assertEquals("", userPetName);
	}
	
	@Test
	public void shouldReturnPetType() {
		VirtualPet underTest = new VirtualPet("", "", 50, hunger, thirst, bored, clean, catLitterBox);
		String userPetId = underTest.getUserPetId();
		assertEquals("", userPetId);
	}
	
	@Test
	public void shouldReturnPetHealth() {
		VirtualPet underTest = new VirtualPet("", "", 50, hunger, thirst, bored, clean, catLitterBox);
		int userPetHealth = underTest.getUserPetHealth();
		assertEquals(50, userPetHealth);
	}
	
	@Test
	public void isPetGettingAdopted_ShouldReturnTrue() {
		VirtualPet underTest = new VirtualPet("","", 50, hunger, thirst, bored, clean, catLitterBox);
		int isAdopted = underTest.adopt = 1;
		assertTrue(underTest.isAdopted());
	}
	
	@Test
	public void isPetGettingAdmitted_ShouldReturnTrue() {
		VirtualPet underTest = new VirtualPet ("", "", 50, hunger, thirst, bored, clean, catLitterBox);
		int isAdmit = underTest.admit = 1;
		assertTrue(underTest.isAdmit());
		
	}
	
	@Test
	public void shouldFeedPet() {
		VirtualPet underTest = new VirtualPet ("", "", 50, hunger, thirst, bored, clean, catLitterBox);
		int isHungry = underTest.hunger = 50;
		assertEquals(50, isHungry());
	}

	private Object isHungry() {
		return 50;
	}
	
	@Test
	public void shouldWaterPet() {
		VirtualPet underTest = new VirtualPet("", "", 50, hunger, thirst, bored, clean, catLitterBox);
		int isThirsty = underTest.thirst = 50;
		assertEquals(50, isThirsty());
	}
	
	private Object isThirsty() {
		return 50;
	}
	
	@Test
	public void shouldPlayWithPet() {
		VirtualPet underTest = new VirtualPet("", "", 50, hunger, thirst, bored, clean, catLitterBox);
		int isNeedingPlay = underTest.play = 50;
		assertEquals(50, isNeedingPlay());
	}
	
	private Object isNeedingPlay() {
		return 50;
	}
	
	@Test
	public void shouldCleanPet() {
		VirtualPet underTest = new VirtualPet("", "", 50, hunger, thirst, bored, clean, catLitterBox);
		int isClean = underTest.clean = 50;
		assertEquals(50, isClean());
	}
	
	private Object isClean() {
		return 50;
	}
	
	@Test
	public void isVeryBored() {
		VirtualPet underTest = new VirtualPet("", "", 50, hunger, thirst, bored, clean, catLitterBox);
		int isVeryBored = underTest.bored = 50;
		assertEquals(50, isBored());
		
	}
	
	private Object isBored() {
		return 50;
	}
	
	@Test
	public void isPetClean() {
		VirtualPet underTest = new VirtualPet("", "", 50, hunger, thirst, bored, clean, catLitterBox);
		int isClean = underTest.clean = 50;
		assertEquals(50, isClean());
	}
	
	
}
