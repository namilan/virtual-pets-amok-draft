05/30/19:

Created Gradle for eclipse. Imported project into eclipse. Created main and tests. 

05/31/19:

Added into GitHub.

06/01/19:

Added ReadMe to folder. Added ignore.git in the folder as well. Uploaded on to GIT. 
Added VirtualRobotPets class.
Added VirtualRobotPetsTest class. 
Gave values to everything that held a 0. 
	* Maintenance = 23
	* Oil = 50
	* Happiness = 50
	* Bored = 50
Removed " Clean " from VirtualPetsRobots. 
Fixed isPetCageCleanMethodWorking in VP
	* Set value to 25
Fixed isPetCageDirtyMethodWorking in VP
	* Set value to 25
Added doesUserPetSoilGetterWork to VPTest
	* set value to 50
Added soil to VP
	* set name to soil (return.soil)
	* set value to 50 / 100 ( onces hits 100, soils )
Added treat to VP & VPTest
	* set value to 1
	* return.treat
	* added isPetTreatGetterWorking to VPTest
	* set value == 1 in VP
Added isLitterBoxClean()
	* returning litterBox == 25
Added isLitterBoxDirty()
	* returning litterBox <= 25
Added getUserCatLitterBox()
	* returning litterBox
Added litterBox
	* set Value = 25 for clean
	* if litterBox hits 100, the cat will soil
	  it's cage
Removed Clean from isAlive
	* moved to isSoiled
Added isSoiled method
	* Created a " pet soiled the cage " string
	* added clean & litter box into this method
Added tickRestLitterBox() to VPTest
Added isLitterBoxTicking() to VPTest
**** checked testing and all is green and works ****
Added Tick Method Reset to VRPets
	* maintenance = 23
	* oil = 50
	* happiness = 50
	* bored = 50
Added Tick Method Reset to VRPTest
	* maintenance
	* oil
	* happiness
	* bored
Added isRobotAlive()
	* if robot hits 0, then robot powers down. 
Added is RobotBored
	* if robot hits 100, then robot breaks out of 
	  cage and rips up all papers in the office. 


