package insuranceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Borland_Home_Page 
{
    @FindBy(id="quick-link:jump-menu") private WebElement selectService;
    
    
    public Borland_Home_Page(WebDriver driver) 
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void selectSerciceDropdown()
    {
    	Select s=new Select(selectService);
    	s.selectByVisibleText("Auto Quote");
    }
}
