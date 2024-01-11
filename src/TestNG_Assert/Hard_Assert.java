package TestNG_Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert {
 
	//static methods
  @Test
  public void f() throws InterruptedException 
  {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(1000);
	 driver.findElement(By.linkText("Create new account")).click();
	 Thread.sleep(1000);
	 boolean genderSelection = driver.findElement(By.xpath("//input[@value='1']")).isSelected();
	 
	 //if result is true then tc is passed, if resukt is false then tc is failed
	 //for this we previously use if else statement
	 //but for this we use assert
	 
	 Assert.assertEquals(genderSelection, "gender is not selected, TC is failed");
	 
  }
}
