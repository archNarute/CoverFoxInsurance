package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_method {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("study@gmail,com");
		
		
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//driver.findElement(By.id("name")).sendKeys("Archana ");
		Thread.sleep(1000);
		//driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Archana Bajrang Narute");
		driver.findElement(By.name("email")).sendKeys("success@gmail.com");
		driver.findElement(By.id("password")).sendKeys("software@123");
		driver.findElement(By.id("mobile")).sendKeys("9922003388");
		
		


	}

}
