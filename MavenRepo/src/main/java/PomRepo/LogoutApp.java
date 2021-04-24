package PomRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutApp 
{
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminstratorbtn;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement singoutbtn;

	public WebElement getAdminstratorbtn() {
		return adminstratorbtn;
	}

	public WebElement getSingoutbtn() {
		return singoutbtn;
	}
}
