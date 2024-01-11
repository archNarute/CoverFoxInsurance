package webDriverUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VeriftCurrentUrl {

	public static void main(String[] args) throws InterruptedException
	{
		String expectedReult="https//www.redbus.in/";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		Thread.sleep(1000);
		String actualResult = driver.getCurrentUrl();
		
		if(expectedReult.equals(actualResult))
		{
			System.out.println("url is matched");
		}
		else
		{
			System.out.println("url is not matched");
		}
	}

}
