package work.myimss.test.testcases;

import java.util.Hashtable;

import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;
import work.myimss.test.utilities.TestUtil;

public class SepAssignTest extends TestBase{
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void sepAssignTest(Hashtable<String,String> data)
	{
		log.debug("Inside SepAssignTest");
		
		click("sepAssignTest_XPATH");
		click("sepNext_XPATH");
		type("sepName_XPATH",data.get("name"));
		type("sepMobile_XPATH",String.valueOf((int)Double.parseDouble(data.get("mobile"))));
		type("sepEmail_XPATH",data.get("email"));
		type("sepDOB_XPATH",data.get("dob"));
		type("sepPAN_XPATH",data.get("pan"));
		type("sepRemarks_XPATH",data.get("remarks"));
		type("sepResume_XPATH",data.get("upload"));
		click("sepSubmit_XPATH");
		getText("successAlert_XPATH");
		
		Reporter.log("SepAssignTest Successfully executed!!!!!!!!!!");
		
	}

}
