package coverFoxInsuranceModified;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC_02_validating_Cover_Fox2_Excel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		FileInputStream myFile=new FileInputStream("C:\\Users\\Dell\\Desktop\\velocity\\testing.xlsx");
	    Sheet mySheet = WorkbookFactory.create(myFile).getSheet("CoverFox");
		String ageData = mySheet.getRow(0).getCell(0).getStringCellValue();
		String zipCodeData = mySheet.getRow(0).getCell(1).getStringCellValue();
		String mobnumData = mySheet.getRow(0).getCell(2).getStringCellValue();

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
		memberDetails.selectAgeFromDropDown(ageData);
		memberDetails.clickOnNextButton();
		
		
		
		CoverFoxAddressDetailPage addressDetail=new CoverFoxAddressDetailPage(driver);
		Thread.sleep(5000);
		addressDetail.enterPinCode(zipCodeData);
		addressDetail.enterMobNum(mobnumData);
		addressDetail.clickOnContinueButton();
		Thread.sleep(5000);
		CoverFoxResultPage resultPage=new CoverFoxResultPage(driver);
		Thread.sleep(5000);
		resultPage.validatePlanList();
	}

}
