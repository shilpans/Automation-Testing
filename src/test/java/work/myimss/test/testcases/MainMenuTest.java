package work.myimss.test.testcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;

public class MainMenuTest extends TestBase{
	
	@Test
	public void mainMenuSkillsTest()
	{
		
		log.debug("Inside MainMenuSkillsTest");
		click("mainMenu_XPATH");
		click("menuSkills_XPATH");
		log.debug("Successfully executed MainMenuTest");
		Reporter.log("Successfully executed MainMenuTest");
		
	}

}
