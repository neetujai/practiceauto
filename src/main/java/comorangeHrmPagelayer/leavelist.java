package comorangeHrmPagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class leavelist
{
	WebDriverWait wait;
public leavelist(WebDriver driver) 
{
PageFactory.initElements(driver,this);	
}

@FindBy(xpath="//a[normalize-space()='Leave List']")
private WebElement leavelist_tab ;

@FindBy(xpath="//div[@class='oxd-table-filter']//div[1]//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//input[1]")
private WebElement calenderfrom ;
@FindBy(xpath="//div[@class='oxd-form-row']//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]")
private WebElement calenderto ;
@FindBy(xpath="//i[@class='oxd-icon bi-caret-up-fill oxd-select-text--arrow']")
private WebElement showleavestatus_select ;
@FindBy(xpath="//div[4]//div[1]//div[2]//div[1]//div[1]//div[1]")
private WebElement leavetypeselect;
@FindBy(xpath="//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
private WebElement switch_btn;

// -------------------- METHOD 2 : SELECT FROM CALENDAR -----------------

public void leavelist_btn()
{
	leavelist_tab .click();	
}

public void calenderfromdata()
{
	calenderfrom.sendKeys("2000-07-03");
}
public void calendertodata()
{
	calenderto.sendKeys("2000-15-03");
}
public void includrpastemployeswitch_btn()
{
	switch_btn .click();	
}
public void showleavestatusvalue()
{
	Select s=new Select(showleavestatus_select);
	s.selectByIndex(2);;
	
}
public void showleavetypevalue()
{
	Select s=new Select(leavetypeselect);
	s.selectByIndex(3);;
	
}




}
