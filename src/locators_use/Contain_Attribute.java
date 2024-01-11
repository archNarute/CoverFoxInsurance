package locators_use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contain_Attribute {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");

		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(500);
		//input[contains(@id,'u_0_b_')]
		driver.findElement(By.xpath("//input[contains(@id,'u_0_b_')]")).click();
	}

}
