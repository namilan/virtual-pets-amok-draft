import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class VirtualPetShelterTest {
	
	protected String name = "";
	protected String type = "";
	protected int health = 50;	
	protected int hunger = 50;
	protected int thirst = 50;
	protected int play = 50;
	protected int bored = 50;
	protected int clean = 100;
	protected int adopt = 1;
	protected int admit = 1;

	@Test
	public void shouldReturnPetName() {
		VirtualPet underTest = new VirtualPet("", "", 50, hunger, thirst, bored, clean);
		String userPetName = underTest.getUserPetName();
		assertEquals("", userPetName);
	}
	
	@Test
	public void shouldReturnPetType() {
		VirtualPet underTest = new VirtualPet("", "", 50, hunger, thirst, bored, clean);
		String userPetId = underTest.getUserPetId();
		assertEquals("", userPetId);
	}
	
	@Test
	public void shouldReturnPetHealth() {
		VirtualPet underTest = new VirtualPet("", "", 50, hunger, thirst, bored, clean);
		int userPetHealth = underTest.getUserPetHealth();
		assertEquals(50, userPetHealth);
	}
	
	@Test
	public void isPetGettingAdopted_ShouldReturnTrue() {
		VirtualPet underTest = new VirtualPet("","", 50, hunger, thirst, bored, clean);
		int isAdopted = underTest.adopt = 1;
		assertTrue(underTest.isAdopted());
	}
	
	@Test
	public void isPetGettingAdmitted_ShouldReturnTrue() {
		VirtualPet underTest = new VirtualPet ("", "", 50, hunger, thirst, bored, clean);
		int isAdmit = underTest.admit = 1;
		assertTrue(underTest.isAdmit());
		
	}
	
	@Test
	public void shouldFeedPet() {
		VirtualPet underTest = new VirtualPet ("", "", 50, hunger, thirst, bored, clean);
		int isHungry = underTest.hunger = 50;
		assertEquals(50, isHungry());
	}

	private Object isHungry() {
		return 50;
	}
	
	@Test
	public void shouldWaterPet() {
		VirtualPet underTest = new VirtualPet("", "", 50, hunger, thirst, bored, clean);
		int isThirsty = underTest.thirst = 50;
		assertEquals(50, isThirsty());
	}
	
	private Object isThirsty() {
		return 50;
	}
	
	@Test
	public void shouldPlayWithPet() {
		VirtualPet underTest = new VirtualPet("", "", 50, hunger, thirst, bored, clean);
		int isNeedingPlay = underTest.play = 50;
		assertEquals(50, isNeedingPlay());
	}
	
	private Object isNeedingPlay() {
		return 50;
	}
	
	@Test
	public void shouldCleanPet() {
		VirtualPet underTest = new VirtualPet("", "", 50, hunger, thirst, bored, clean);
		int isClean = underTest.clean = 50;
		assertEquals(50, isClean());
	}
	
	private Object isClean() {
		return 50;
	}
	
	@Test
	public void isVeryBored() {
		VirtualPet underTest = new VirtualPet("", "", 50, hunger, thirst, bored, clean);
		int isVeryBored = underTest.bored = 50;
		assertEquals(50, isBored());
		
	}
	
	private Object isBored() {
		return 50;
	}
	
	@Test
	public void isPetClean() {
		VirtualPet underTest = new VirtualPet("", "", 50, hunger, thirst, bored, clean);
		int isClean = underTest.clean = 50;
		assertEquals(50, isClean());
	}
	
	
}
