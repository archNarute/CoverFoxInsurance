package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		WebElement day = driver.findElement(By.id("day"));
		
		Actions act=new Actions(driver);
		/*act.click(day).sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).perform();
		act.sendKeys(Keys.ENTER).perform();*/
		
		act.click(day).perform();
		
		//we want to print 9 nov date---> difference between 9 and 29 nov is 20 days
		
		for(int i=0; i<=20; i++) 
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(1000);
		}
		act.sendKeys(Keys.ENTER).perform();
		
		//I want to write name in first field
		// sendkeys is velocity but result is VELOCITY
		
		WebElement firstnamefield = driver.findElement(By.name("firstname"));
		act.keyDown(firstnamefield, Keys.SHIFT).sendKeys("archana").build().perform();
		

	}

}
