package PomRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageClass 
{
	@FindBy(xpath="//a[text()='More']")
	private WebElement morebtn;
	
	@FindBy(xpath="//a[text()='Opportunities'][1]")
	private WebElement oppurtunitybtn;
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createbtn;
	
	@FindBy(xpath="//input[@name='potentialname']")
	private WebElement Opportunityname;
	
	
	@FindBy(xpath="//input[@name='assigntype'][1]")
	private WebElement checkboxbtn;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]'][1]")
	private WebElement savebtn;

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getMorebtn() {
		return morebtn;
	}

	public WebElement getOppurtunitybtn() {
		return oppurtunitybtn;
	}

	public WebElement getCreatebtn() {
		return createbtn;
	}

	public WebElement getOpportunityname() {
		return Opportunityname;
	}


	public WebElement getCheckboxbtn() {
		return checkboxbtn;
	}
}
