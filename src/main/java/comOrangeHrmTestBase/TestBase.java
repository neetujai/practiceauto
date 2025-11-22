package comOrangeHrmTestBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import comOrangeHrmUtilities.readconfigration;
import comOrangeHrmUtilities.utils;
import comorangeHrmPagelayer.DashBoard;
import comorangeHrmPagelayer.LoginPage;
import comorangeHrmPagelayer.leavelist;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{	
	public static Logger logger;	
    public static WebDriver driver;
    public readconfigration read_config;
   public LoginPage login_obj;
    public utils util_obj;
    public DashBoard dashboard_obj;
    public leavelist leavelist_obj;
    
	@BeforeTest
	public void start()
	{
		logger = Logger.getLogger("orangehrm");
		PropertyConfigurator.configure("Log4j");
		logger.info("Framework Execution started");
	}
	@AfterTest
	public void end()
	{
		logger.info("Framework Execution stoped");
	}
	@Parameters("browser")
	@BeforeMethod
	public void setUp(@Optional("chrome") String br) throws InterruptedException
	{
		if(br.equalsIgnoreCase("chrome"))
		{
		//	WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", "E:\\software testing\\chromedriver_win32.zip");
			driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Please provide correct browser name");
		}
		 read_config = new readconfigration();
		driver.get(read_config.getApplicationUrl());
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		logger.info("Browser launches, url, maximize");
		
		driver.navigate().refresh();
		logger.info("Login the application");
	
		//---------- Object Creation --------------------
		 login_obj = new LoginPage(driver);
		 dashboard_obj =new DashBoard(driver);
		 leavelist_obj= new leavelist(driver);
		util_obj = new utils();
	}

	
	

	/*@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}*/
	
}
