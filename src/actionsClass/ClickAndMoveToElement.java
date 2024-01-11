package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndMoveToElement {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//1 locate the element and store in it reference variable
		WebElement loginButton = driver.findElement(By.name("login"));
		Thread.sleep(1000);
		
		//2 create object of Actions class and in that pass driver as a argument
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		
		//3 use different methods
		// first way
		//act.moveToElement(loginButton).perform();
	    Thread.sleep(1000);
		//act.click().perform();
		//second way
		//act.click(loginButton).perform();
		//third way method chaining
		act.moveToElement(loginButton).click().build().perform();
		

	}

}
