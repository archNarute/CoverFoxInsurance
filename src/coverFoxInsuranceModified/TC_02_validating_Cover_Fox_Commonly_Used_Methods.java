package coverFoxInsuranceModified;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import miscelenious.CommonlyUsedMethods;

public class TC_02_validating_Cover_Fox_Commonly_Used_Methods {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		
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
		Thread.sleep(1000);
		memberDetails.selectAgeFromDropDown(CommonlyUsedMethods.excelSheet("CoverFox", 0, 0));
		memberDetails.clickOnNextButton();
		
		
		
		CoverFoxAddressDetailPage addressDetail=new CoverFoxAddressDetailPage(driver);
		Thread.sleep(1000);
		addressDetail.enterPinCode(CommonlyUsedMethods.excelSheet("CoverFox", 0, 1));
		addressDetail.enterMobNum(CommonlyUsedMethods.excelSheet("CoverFox", 0, 2));
		addressDetail.clickOnContinueButton();
		Thread.sleep(1000);
		CoverFoxResultPage resultPage=new CoverFoxResultPage(driver);
		Thread.sleep(5000);
		resultPage.validatePlanList();
		Thread.sleep(6000);
		driver.close();
	}

}
