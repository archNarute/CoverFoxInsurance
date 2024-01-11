package swagLabDemoLink;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swag_Inventory_Page {

	//variables
	@FindBy(id="add-to-cart-sauce-labs-onesie")private WebElement onesieAddToCardField;
	@FindBy(id="add-to-cart-sauce-labs-backpack") private WebElement backpackAddToCardField;
	@FindBy(className ="shopping_cart_link") private WebElement addToCartButton;
	
	//constructor
	public Swag_Inventory_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
 
	//methods
	public void onesieAddToCart()
	{
		onesieAddToCardField.click();
	}
	
	public void backpackAddToCart()
	{
		backpackAddToCardField.click();
	}
	
	public void clickAddToCart()
	{
		addToCartButton.click();
	}
}
