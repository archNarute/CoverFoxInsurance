package insuranceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Borland_Quote_Auto_Page 
{
   @FindBy(id="autoquote:zipcode") private WebElement zipcodeField;
   @FindBy(id="autoquote:e-mail") private WebElement emailField;
   @FindBy(xpath = "//label[@for='autoquote:vehicle:0']") private WebElement automobileTypeRadioButton;
   @FindBy(id="autoquote:next") private WebElement nextButton;  
   @FindBy(id="autoquote:age") private WebElement ageField;
   @FindBy(xpath = "//label[@for='autoquote:gender:1']") private WebElement genderRadioButton;
   @FindBy(xpath = "//label[@for='autoquote:type:0']") private WebElement drivingRecordRadioButton;
   @FindBy(xpath = "//input[@class='cbutton']") private WebElement secondNextButton;
   
   public Borland_Quote_Auto_Page(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void enterZipCode()
   {
	   zipcodeField.sendKeys("413411");
   }
   
   public void enterEmail()
   {
	  emailField.sendKeys("test@gmail.com");
   }
   
   public void selectAutomobileTypeRadioButton()
   {
	   automobileTypeRadioButton.click();
   }
   public void clickOnNextButton()
   {
	   nextButton.click();
   }
   
   public void enterAge()
   {
	   ageField.sendKeys("25");
   }
   
   public void selectGenderRadioButton()
   {
	   genderRadioButton.click();
   }
   public void selectDrivingRecordRadioButton()
   {
	   drivingRecordRadioButton.click();
   }
   public void clickOnSecondNextButton()
   {
	   secondNextButton.click();
   }
   
}
