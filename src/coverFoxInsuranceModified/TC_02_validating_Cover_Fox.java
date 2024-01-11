package coverFoxInsuranceModified;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC_02_validating_Cover_Fox {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

		CoverFoxHomePage homePage=new CoverFoxHomePage(driver);
		homePage.selectFemaleGender();
		
		
		CoverFoxHealthPlan healthPlan=new CoverFoxHealthPlan(driver);
		healthPlan.clickOnNextButton();
		
		CoverFoxMemberDetailsPage memberDetails= new CoverFoxMemberDetailsPage(driver);
		Thread.sleep(5000);
		memberDetails.selectAgeFromDropDown("45");
		memberDetails.clickOnNextButton();
		
		
		
		CoverFoxAddressDetailPage addressDetail=new CoverFoxAddressDetailPage(driver);
		Thread.sleep(5000);
		addressDetail.enterPinCode("413411");
		addressDetail.enterMobNum("8765412345");
		addressDetail.clickOnContinueButton();
		Thread.sleep(5000);
		CoverFoxResultPage resultPage=new CoverFoxResultPage(driver);
		Thread.sleep(5000);
		resultPage.validatePlanList();
	}

}
