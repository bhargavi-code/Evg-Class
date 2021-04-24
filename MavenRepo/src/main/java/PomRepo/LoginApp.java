package PomRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginApp 
{
	@FindBy(name="user_name")
	private WebElement usernamebtn;
	
	@FindBy(name="user_password")
	private WebElement passwordbtn;
	
	@FindBy(id="submitButton")
	private WebElement loginbtn;

	public WebElement getUsernamebtn() {
		return usernamebtn;
	}

	public WebElement getPasswordbtn() {
		return passwordbtn;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
}
