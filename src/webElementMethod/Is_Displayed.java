package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Displayed {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@value='Hide']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("show-textbox")).click();
		Thread.sleep(2000);
		boolean result = driver.findElement(By.id("displayed-text")).isDisplayed();
		System.out.println("button display status is "+result);
		Thread.sleep(2000);
		
		driver.findElement(By.id("displayed-text")).sendKeys("hi");
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@value='Hide']")).click();
		
		

	}

}
