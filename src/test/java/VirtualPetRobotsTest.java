import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VirtualPetRobotsTest {

		private String userRobotName;
		private String userRobotType;
		private int userRobotMaintenance;
		private int userRobotOil;
		
		VirtualPetRobots underTest = new VirtualPetRobots (userRobotName, userRobotType, userRobotMaintenance, userRobotOil, 0, 0);
		
		@Test
		public void doesRobotNameGetterWork() {
			String userRobotName = "";
			underTest.robotName = userRobotName;
			assertEquals("", underTest.getUserRobotName());
		}
		
		@Test
		public void doesRobotTypeGetterWork() {
			String userRobotType = "";
			underTest.robotType = userRobotType;
			assertEquals("", underTest.getUserRobotType());
		}

		@Test
		public void getUserRobotMaintenanceGetterWork() {
			int userRobotMaintenance = 0;
			underTest.robotMaintenance = userRobotMaintenance;
			assertEquals( 0 , underTest.getUserRobotMaintenance());
		}
		
		@Test
		public void getUserRobotOilGetterWork() {
			int userRobotOil = 0;
			underTest.robotOil = userRobotOil;
			assertEquals( 0 , underTest.getUserRobotOil());
		}
		
		@Test
		public void getUserRobotHappinessGetterWork() {
			int userRobotHappiness = 0;
			underTest.robotHappiness = userRobotHappiness;
			assertEquals( 0 , underTest.getUserRobotHappiness());
		}
		
		@Test
		public void getUserRobotBorderGetterWork() {
			int userRobotBored = 0;
			underTest.robotBored = userRobotBored;
			assertEquals( 0 , underTest.getUserRobotBored());
		}
		
		@Test
		public void isRobotMaintenanceWorking_ShouldReturnTrue() {
			underTest.robotMaintenance = 0;
			assertTrue(underTest.robotMaintenance());
		}
		
		@Test 
		public void isRobotOilWorking_ShouldReturnTrue() {
			underTest.robotOil = 0;
			assertTrue(underTest.robotOil());
		}
		
		@Test
		public void isRobotHappinessWorking_ShouldReturnTrue() {
			underTest.robotHappiness = 0;
			assertTrue(underTest.robotHappiness());
		}
		
		@Test
		public void isRobotBoredWorking_ShouldReturnTrue() {
			underTest.robotBored = 0;
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
			underTest.robotMaintenance = 0;
			underTest.getUserRobotMaintenance();
			assertEquals(0, underTest.getUserRobotMaintenance());
		}
		
		@Test
		public void isRobotOilTickWorking() {
			underTest.robotOil = 0;
			underTest.getUserRobotOil();
			assertEquals(0, underTest.getUserRobotOil());
		}
		
		@Test
		public void isRobotHappinessTickWorking() {
			underTest.robotHappiness = 0;
			underTest.getUserRobotHappiness();
			assertEquals(0, underTest.getUserRobotHappiness());
		}
		
		@Test
		public void isRobotBoredTickWorking() {
			underTest.robotBored = 0;
			underTest.getUserRobotBored();
			assertEquals(0, underTest.getUserRobotBored());
		}


}
