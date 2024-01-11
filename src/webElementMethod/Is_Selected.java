package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Selected {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		//a[@rel='async']
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(2000);
		/*boolean result = driver.findElement(By.xpath("//input[@value='1']")).isSelected();
       System.out.println("selection status is "+result);
       
       driver.findElement(By.xpath("//input[@value='1']")).click();
       
       Thread.sleep(1000);
       boolean result1 = driver.findElement(By.xpath("//input[@value='1']")).isSelected();
       System.out.println("selection status is "+result1);*/
		
		
		//code optimization
		 WebElement femalegender = driver.findElement(By.xpath("//input[@value='1']"));
	    boolean result = femalegender.isSelected();
	    System.out.println("selection status is "+result);
	    Thread.sleep(2000);
	    femalegender.click();
	    boolean result1 = femalegender.isSelected();
	    System.out.println("selection status is "+result1);
	    
	    
		
		
		
		
	}

}
