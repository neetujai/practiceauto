package comorangeHrmPagelayer;



import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class LoginPage
{
	WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username_txtbox;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password_txtbox;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	
	private WebElement login_btn;

	public void enterusername(String username)
	{
	/*	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20)) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username_txtbox")));*/
		username_txtbox.sendKeys(username);
	}
	
	public void enterpassword(String password)
	{
		
		password_txtbox.sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20)) ;
	     wait.until(ExpectedConditions.elementToBeClickable(login_btn));
		login_btn.click();
	}

	
}
