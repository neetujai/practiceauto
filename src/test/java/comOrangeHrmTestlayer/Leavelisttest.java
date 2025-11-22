package comOrangeHrmTestlayer;

import org.testng.annotations.Test;

import comOrangeHrmTestBase.TestBase;

public class Leavelisttest extends TestBase{

	@Test
	public void leavelist() {
		login_obj.enterusername(read_config.getusername());
		login_obj.enterpassword(read_config.getpassword());
	    login_obj.clickOnLoginButton();
	    driver.navigate().refresh();
		dashboard_obj.clickonleavebtn();
		
		leavelist_obj.leavelist_btn();
		leavelist_obj.calenderfromdata();
		leavelist_obj.calendertodata();
		leavelist_obj.includrpastemployeswitch_btn();
		//leavelist_obj.showleavestatusvalue();
		//leavelist_obj.showleavetypevalue();
	}
	
}
