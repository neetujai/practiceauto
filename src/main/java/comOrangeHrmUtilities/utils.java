package comOrangeHrmUtilities;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import comOrangeHrmTestBase.TestBase;

public class utils extends TestBase {

	public utils()
	{
		PageFactory.initElements(driver,this);
	}
	public String getwebpageurl()
	{
		String url = driver.getCurrentUrl();
		return url;
	}

	public static void takess(String filename)
	{ 
		try
		{
			
		String path = "E:\\testing revision data\\program\\PracticeAutomation\\screnshot";
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(path+filename+".png");
		FileHandler.copy(src,des);
		
		
		}
		catch(Exception e)
		{
			System.out.println("file path is not correct");
			e.printStackTrace();
		
	    }

	
		
	}
}
