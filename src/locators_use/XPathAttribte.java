package locators_use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAttribte {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		//driver.get("https://mpsconline.gov.in/candidate/login");
		driver.get("https://www.redbus.in/");
		//driver.get("https://javagoal.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@class='text-third-nav']")).click();
		//driver.findElement(By.xpath("//input[@type='search']")).sendKeys("constructor");
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("pune");
	}

}
