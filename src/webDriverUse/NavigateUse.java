package webDriverUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateUse {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://javagoal.com/");
		
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.youtube.com/");
		
        Thread.sleep(800);
        
        driver.navigate().back();
        
        Thread.sleep(1000);
        
        driver.navigate().forward();
        
        Thread.sleep(1000);
        
        driver.navigate().refresh();
        
        Thread.sleep(2000);
        
        driver.quit();    //close all tabs which are open in selenium
       
	}

}
