package insuranceDemo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Borland_Quote_Auto_page2 
{
   @FindBy(id="autoquote:year") private WebElement yearField;
   @FindBy(id="makeCombo") private WebElement makeFieldDropDown;
   @FindBy(id="modelCombo" ) private WebElement modelFieldDropDown;
   @FindBy(xpath = "(//input[@type='radio'])[1]") private WebElement financialInfoRadioButton;
   @FindBy(xpath="//input[@class='cbutton']") private WebElement thirdNextButton;
   
   public Borland_Quote_Auto_page2(WebDriver driver)
   {
	PageFactory.initElements(driver, this);
   }  
   
   public void enterYearOnYearField ()
   {
	   yearField.sendKeys("2015");
   }
   public void selectMakeFieldDropDown (WebDriver driver) 
   {  
	  JavascriptExecutor js= (JavascriptExecutor) driver;
	  
	   js.executeScript("arguments[0].value='Toyota'", makeFieldDropDown);
	   
	   
	   
	   
   }
   public void selectModelFieldDropDown(WebDriver driver) 
   {
	  JavascriptExecutor js= (JavascriptExecutor) driver;
	  
	   js.executeScript("arguments[0].value='Camry'",modelFieldDropDown );
   }
   
   public void clickOnFinancialInfoRadioButton()
  {
  financialInfoRadioButton .click();
   }
   public void clickOnthirdNextButton()
   {
	   thirdNextButton.click();
   }
   
}
