package syncranization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//Thread.sleep(10000); //13 sec
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000)); //7 sec 
		
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("mobile");

	}

}
