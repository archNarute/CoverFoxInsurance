package webDriverUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://javagoal.com/");
		
		Thread.sleep(100);  //stop for 100milisecond
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		//driver.manage().window().minimize();
		
		//driver.close();  //close only recently focused tab  

	}

}
