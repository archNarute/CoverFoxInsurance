package coverFox_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateTotalPlansInCoverfox {
    WebDriver driver;
	CoverFoxHomePage home;
	CoverFoxHealthPlan healthPlan;
	CoverFoxMemberDetailsPage memberDetail;
	CoverFoxAddressDetailPage addressDetail;
	CoverFoxResultPage result;
	
	@BeforeClass
	public void openBrowser() throws InterruptedException
	{
		driver=new ChromeDriver();
		home=new CoverFoxHomePage(driver);
		healthPlan=new CoverFoxHealthPlan(driver);
		memberDetail=new CoverFoxMemberDetailsPage(driver);
		addressDetail=new CoverFoxAddressDetailPage(driver);
		result=new CoverFoxResultPage(driver);
		
		driver.get("https://www.coverfox.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
	
	@BeforeMethod
	public void enterRequiredDetails() throws InterruptedException
	{
		Reporter.log("clicking on female button", true);
		home.selectFemaleGender();
		Thread.sleep(2000);
		
		Reporter.log("clicking on next button", true);
		healthPlan.clickOnNextButton();
		Thread.sleep(2000);
		
		Reporter.log("selecting age from dropDown", true);
		memberDetail.selectAgeFromDropDown("33");
		Reporter.log("clicking on next button", true);
		memberDetail.clickOnNextButton();
		Thread.sleep(2000);
		
		Reporter.log("entering zipcode", true);
		addressDetail.enterPinCode("413411");
		Reporter.log("entering mobNum", true);
		addressDetail.enterMobNum("9876452312");
		Reporter.log("clicking on continue button", true);
		addressDetail.clickOnContinueButton();
		Thread.sleep(2000);
	
	}
	
	@Test
  public void validateResultFromTextAndBanner() throws InterruptedException
	{   Thread.sleep(6000);
		Reporter.log("fetching result from text", true);
		int textResult = result.planCountFromText();
		Thread.sleep(6000);
		
		Reporter.log("fetching result from banner", true);
	     int bannerResult = result.planCountFromBanner();
	     Thread.sleep(6000);
	     Assert.assertEquals(textResult, bannerResult,"textResult & bannerResult are not matched, TC is failed");
  
	     Reporter.log("TC is passed", true);
	}
	
	@AfterMethod
	public void closeTheBrowser() throws InterruptedException
	{
		Reporter.log("closing browser", true);
		Thread.sleep(5000);
		driver.close();
		
	}
}
