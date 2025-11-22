package comorangeHrmPagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard {

	public DashBoard(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[normalize-space()='Leave']")
	private WebElement leave_btn;
	
	public void clickonleavebtn()
	{
		leave_btn.click();
	}
}
