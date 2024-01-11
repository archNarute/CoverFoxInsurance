package miscelenious;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfCommonlyUsedMethod {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		CommonlyUsedMethods.implicitWait(driver, 10);
		
	    WebElement sponsoredCompanies = driver.findElement(By.xpath("//h2[text()='Sponsored companies']"));
		CommonlyUsedMethods.scrollIntoView1(driver, sponsoredCompanies);
		
		CommonlyUsedMethods.takeScreenshot(driver, "naukri123");
	   
		CommonlyUsedMethods.excelSheet("testing", "Sheet5");
		

	}

}
