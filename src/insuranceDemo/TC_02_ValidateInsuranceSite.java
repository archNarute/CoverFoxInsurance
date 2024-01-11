package insuranceDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_02_ValidateInsuranceSite {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.borland.com/InsuranceWebExtJS/index.jsf");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		
		Borland_Home_Page homePage=new Borland_Home_Page(driver);
		homePage.selectSerciceDropdown();
		
		Borland_Quote_Auto_Page auto_page=new Borland_Quote_Auto_Page(driver);
		auto_page.enterZipCode();
		auto_page.enterEmail();
		auto_page.selectAutomobileTypeRadioButton();
		auto_page.clickOnNextButton();
		auto_page.enterAge();
		auto_page.selectGenderRadioButton();
		auto_page.selectDrivingRecordRadioButton();
		auto_page.clickOnSecondNextButton();
		
		Borland_Quote_Auto_page2 autoPage2=new Borland_Quote_Auto_page2(driver);
		autoPage2.enterYearOnYearField();
		
		autoPage2.selectMakeFieldDropDown(driver);
		
		autoPage2.selectModelFieldDropDown(driver);
		
		autoPage2.clickOnFinancialInfoRadioButton();
		
		autoPage2.clickOnthirdNextButton();
	}

}
