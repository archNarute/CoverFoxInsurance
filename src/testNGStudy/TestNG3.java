package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG3 {
  @Test
  public void launchAmazon()
  {
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.amazon.in/");  
  }
  
  @Test
  public void launchFB()
  {
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.facebook.com/login/");  
  }
  
  @Test
  public void launchHike()
  {
  WebDriver driver=new ChromeDriver();
  driver.get("https://help.hikeup.com/");  
  }
  
}
