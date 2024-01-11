package testNg_FailedXML_Serial_Parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Insta {
	@Test
	  public void insta()
	  {
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.instagram.com/");
	  }
}
