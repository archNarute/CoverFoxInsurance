package testNG_Data_Provider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Naukricom {
  @Test(dataProvider = "regression", dataProviderClass = DataProviderNaukri.class)
  public void f(String designation, String location) throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.naukri.com/");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("(//input[@tabindex='0'])[1]")).sendKeys(designation);
	  Thread.sleep(5000);
	 // driver.findElement(By.id("expereinceDD")).sendKeys(experience);
	  
	  driver.findElement(By.xpath("//input[@placeholder='Enter location']")).sendKeys(location);
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//div[text()='Search']")).click();
	  Thread.sleep(5000);
	  driver.close();
	  
	  
  }
}
