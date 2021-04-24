package GeneriRepo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import PomRepo.LoginApp;
import PomRepo.LogoutApp;

public class BaseClass 
{
	public static WebDriver driver;
	FileutilityClass fc = new FileutilityClass();
	@BeforeClass
	public void BC() throws Exception
	{
		System.out.println("Launch Browser");
		String browser = fc.getdataproperty("browser");
		if(browser.contains("chrome"))
		{
			driver = new ChromeDriver();
		}
		else
		{
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Bhavi.imwait,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void BM() throws Exception
	{
		System.out.println("Login Application");
		LoginApp la = PageFactory.initElements(driver, LoginApp.class);
		String url = fc.getdataproperty("url");
		String us = fc.getdataproperty("username");
		String pwd = fc.getdataproperty("password");
		driver.get(url);
		la.getUsernamebtn().sendKeys(us);
		la.getPasswordbtn().sendKeys(pwd);
		la.getLoginbtn().click();
	}
	@AfterMethod
	public void AM()
	{
		System.out.println("Logout Application");
		LogoutApp lo = PageFactory.initElements(driver, LogoutApp.class);
		Actions act = new Actions(driver);
		act.moveToElement(lo.getAdminstratorbtn()).perform();
		lo.getSingoutbtn().click();
	}
	@AfterClass
	public void AC()
	{
		System.out.println("Close Browser");
		driver.quit();
	}
}
