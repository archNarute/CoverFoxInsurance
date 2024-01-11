package selenium_program;

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
    
    driver.findElement(By.xpath("//a[@rel='async']")).click();
    Thread.sleep(2000);
    
    WebElement femalegender = driver.findElement(By.xpath("//input[@value='1']"));
    boolean result = femalegender.isSelected();
    System.out.println("selection status is "+result);
    
    Thread.sleep(2000);
    femalegender.click();
    boolean result1 = femalegender.isSelected();
    System.out.println("selection status is "+result1);
    
    


	}

}
