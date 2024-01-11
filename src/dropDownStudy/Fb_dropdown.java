package dropDownStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb_dropdown 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(2000);
	  //driver.findElement(By.linkText("Create new account")).click();
	  driver.findElement(By.partialLinkText("new account")).click();
	  
	  Thread.sleep(2000);
	  WebElement date = driver.findElement(By.xpath("//select[@title='Day']"));
	 // WebElement date = driver.findElement(By.id("day"));
	  Select s1=new Select(date);
	  s1.selectByIndex(14);
	  Thread.sleep(2000);
	  //WebElement month= driver.findElement(By.className("_9407 _5dba _9hk6 _8esg"));
	  WebElement month= driver.findElement(By.id("month"));
	  Select s2=new Select(month);
	  s2.selectByValue("10");
	  Thread.sleep(2000);
	  WebElement year = driver.findElement(By.id("year"));
	  Select s3=new Select(year);
	  s3.selectByVisibleText("1994");
	  
	  // check dropdown select multiple value or not
	  Thread.sleep(2000);
	  boolean result = s2.isMultiple();
	  System.out.println("month box multiple selectaable status is "+result);
	  Thread.sleep(2000);
	  boolean result1 = s3.isMultiple();
	  System.out.println("year box multiple selectaable status is "+result1);
	
  }
}
