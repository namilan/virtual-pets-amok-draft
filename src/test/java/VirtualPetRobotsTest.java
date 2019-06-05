import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VirtualPetRobotsTest {

		private String userPetRobotName;
		private String userPetRobotType;
		private int userRobotMaintenance;
		private int userRobotOil;
		
		VirtualPetRobots underTest = new VirtualPetRobots (userPetRobotName, userPetRobotType, userRobotMaintenance, userRobotOil, 0, 0);
		
		@Test
		public void doesRobotNameGetterWork() {
			String userRobotName = "";
			underTest.robotName = userRobotName;
			assertEquals("", underTest.getUserPetRobotName());
		}
		
		@Test
		public void doesRobotTypeGetterWork() {
			String userRobotType = "";
			underTest.robotType = userRobotType;
			assertEquals("", underTest.getUserRobotType());
		}

		@Test
		public void getUserRobotMaintenanceGetterWork() {
			int userRobotMaintenance = 23;
			underTest.robotMaintenance = userRobotMaintenance;
			assertEquals(23, underTest.getUserRobotMaintenance());
		}
		
		@Test
		public void getUserRobotOilGetterWork() {
			int userRobotOil = 50;
			underTest.robotOil = userRobotOil;
			assertEquals(50, underTest.getUserRobotOil());
		}
		
		@Test
		public void getUserRobotHappinessGetterWork() {
			int userRobotHappiness = 50;
			underTest.robotHappiness = userRobotHappiness;
			assertEquals(50, underTest.getUserRobotHappiness());
		}
		
		@Test
		public void getUserRobotBorderGetterWork() {
			int userRobotBored = 50;
			underTest.robotBored = userRobotBored;
			assertEquals(50, underTest.getUserRobotBored());
		}
		
		@Test
		public void isRobotMaintenanceWorking_ShouldReturnTrue() {
			underTest.robotMaintenance = 23;
			assertTrue(underTest.robotMaintenance());
		}
		
		@Test 
		public void isRobotOilWorking_ShouldReturnTrue() {
			underTest.robotOil = 50;
			assertTrue(underTest.robotOil());
		}
		
		@Test
		public void isRobotHappinessWorking_ShouldReturnTrue() {
			underTest.robotHappiness = 50;
			assertTrue(underTest.robotHappiness());
		}
		
		@Test
		public void isRobotBoredWorking_ShouldReturnTrue() {
			underTest.robotBored = 50;
			assertTrue(underTest.robotBored());
		}
		
		@Test
		public void isRobotAdoptedWorking_ShouldReturnTrue() {
			underTest.robotAdopt = 1;
			assertTrue(underTest.robotAdopt());
		}
		
		@Test
		public void isRobotAdmitWorking_ShouldReturnTrue() {
			underTest.robotAdmit = 1;
			assertTrue(underTest.robotAdmit());
		}
		
		@Test
		public void isRobotMaintenanceTickWorking() {
			underTest.robotMaintenance = 23;
			underTest.getUserRobotMaintenance();
			assertEquals(23, underTest.getUserRobotMaintenance());
		}
		
		@Test
		public void isRobotOilTickWorking() {
			underTest.robotOil = 50;
			underTest.getUserRobotOil();
			assertEquals(50, underTest.getUserRobotOil());
		}
		
		@Test
		public void isRobotHappinessTickWorking() {
			underTest.robotHappiness = 50;
			underTest.getUserRobotHappiness();
			assertEquals(50, underTest.getUserRobotHappiness());
		}
		
		@Test
		public void isRobotBoredTickWorking() {
			underTest.robotBored = 50;
			underTest.getUserRobotBored();
			assertEquals(50, underTest.getUserRobotBored());
		}
		
		@Test
		public void isRobotMaintenanceTickResetWorking() {
			underTest.robotMaintenance = 23;
			underTest.getUserRobotMaintenance();
			assertEquals(23, underTest.getUserRobotMaintenance());
		}
		
		@Test
		public void isRobotOilLevelTickResetWorking() {
			underTest.robotOil = 50;
			underTest.getUserRobotOil();
			assertEquals(50, underTest.getUserRobotOil());
		}
		
		@Test
		public void isRobotHappinessTickResetWorking() {
			underTest.robotHappiness = 50;
			underTest.getUserRobotHappiness();
			assertEquals(50, underTest.getUserRobotHappiness());
		}
		
		@Test
		public void isRobotBoredTickResetWorking() {
			underTest.robotBored = 50;
			underTest.getUserRobotBored();
			assertEquals(50, underTest.getUserRobotBored());
		}


}
