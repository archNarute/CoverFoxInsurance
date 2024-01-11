package testNg_FailedXML_Serial_Parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hike {
	@Test
	  public void hike()
	  {
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://my.hikeup.com/");
	  }
}
