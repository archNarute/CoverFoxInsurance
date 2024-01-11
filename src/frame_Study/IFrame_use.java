package frame_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame_use {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(200);
		driver.manage().window().maximize();
		Thread.sleep(200);
		driver.switchTo().frame("SingleFrame");
		Thread.sleep(200);
		WebElement test = driver.findElement(By.xpath("//h5[text()='iFrame Demo']"));
		System.out.println(test.getText());
		System.out.println("=============================");
		Thread.sleep(200);
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		Thread.sleep(200);
		WebElement result = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		//result.isDisplayed();
		System.out.println(result.isDisplayed());
		//System.out.println(result.isSelected());
		
		

	}

}
