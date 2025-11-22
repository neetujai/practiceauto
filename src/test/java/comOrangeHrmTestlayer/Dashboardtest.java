package comOrangeHrmTestlayer;



import org.testng.Assert;
import org.testng.annotations.Test;

import comOrangeHrmTestBase.TestBase;

public class Dashboardtest extends TestBase {
@Test
	public void clickonoption()
{
	String excepted_output="https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList";

	login_obj.enterusername(read_config.getusername());
	login_obj.enterpassword(read_config.getpassword());
    login_obj.clickOnLoginButton();
	dashboard_obj.clickonleavebtn();
	String actual_output=util_obj.getwebpageurl();
	Assert.assertEquals(actual_output,excepted_output);
}
}
