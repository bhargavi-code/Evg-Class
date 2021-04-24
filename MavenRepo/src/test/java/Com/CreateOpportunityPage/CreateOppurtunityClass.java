package Com.CreateOpportunityPage;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import GeneriRepo.BaseClass;
import GeneriRepo.ExcelUtilityClass;
import PomRepo.HomePageClass;

public class CreateOppurtunityClass extends BaseClass
{
	@Test
	public void Samplepage() throws Exception 
	{
		ExcelUtilityClass exc = new ExcelUtilityClass();
		HomePageClass hpc = PageFactory.initElements(driver, HomePageClass.class);
		Actions act = new Actions(driver);
		act.moveToElement(hpc.getMorebtn()).perform();
		hpc.getOppurtunitybtn().click();
		System.out.println("Success");

		hpc.getCreatebtn().click();
		String data = exc.getReaddata("Sheet3", 1, 2);
		hpc.getOpportunityname().sendKeys(data);
		hpc.getCheckboxbtn().click();
		hpc.getSavebtn().click();
		System.out.println("success");
		
	}
}
