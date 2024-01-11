package locators_use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathText
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.irctc.co.in/nget/train-search");
	  Thread.sleep(1000);	
	  
	  driver.manage().window().maximize();
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//span[text()='AGENT LOGIN']")).click();
  }
}
