package swagLabDemoLink;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swag_Lab_Login_Page 
{
    //1. variable---> private
	 
	@FindBy (name= "user-name") private WebElement userName;
	
	@FindBy (id= "password") private WebElement password;
	@FindBy (xpath = "//input[@type='submit']") private WebElement loginButton;
	
	//2. constructor
	public Swag_Lab_Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this); //this keyward is used to access ghobal variable in local area
	}
	
	//3. Methods----> public
	
	public void enterUserName()
	{
		userName.sendKeys("problem_user");
	}
	
	public void enterPassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
}
