package coverFoxInsurance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetailPage 
{
    @FindBy(xpath = "(//input[@type='number'])[1]") private WebElement pinCodeField;
    @FindBy(xpath = "(//input[@type='number'])[2]") private WebElement mobNumField;
    @FindBy(className = "next-btn") private WebElement continueButton;
    
    
    public CoverFoxAddressDetailPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void enterPinCode()
    {
    	pinCodeField.sendKeys("412413");
    }
    
    public void enterMobNum()
    {
    	mobNumField.sendKeys("9921044201");
    }
    
    public void clickOnContinueButton()
    {
    	continueButton.click();
    }
}
