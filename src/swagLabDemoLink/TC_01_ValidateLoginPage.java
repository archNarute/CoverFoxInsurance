package swagLabDemoLink;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01_ValidateLoginPage {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		//create object of POM class
		
		Swag_Lab_Login_Page login=new Swag_Lab_Login_Page(driver); //automatically call goes to constructor
		login.enterUserName();
		login.enterPassword();
		login.clickOnLoginButton();
		
		Swag_Inventory_Page inventory=new Swag_Inventory_Page(driver);
		inventory.backpackAddToCart();
		inventory.onesieAddToCart();
		inventory.clickAddToCart();

	}

}
