package locators_use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Study {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//CSS Selector
		//tag and id---tag#id
		driver.findElement(By.cssSelector("input#email")).sendKeys("Veda@123");
		
		/*Thread.sleep(1000);
		//tag and class---tag.class
		driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy _9npi")).sendKeys("Archhu");*/
		
		Thread.sleep(1000);
		//tag and attribute---tag[attribute=attribute value
		driver.findElement(By.cssSelector("input[placeholder=Password]")).sendKeys("Archu@123");
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div._6ltj")).click();
		
		/*Thread.sleep(1000);
		//tag and attribute, class---tag.class[attribute=attribute value]
		driver.findElement(By.cssSelector("button._42ft[name='login']")).click();*/
		
		
		
		
		

	}

}
