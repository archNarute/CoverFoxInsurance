package selenium_sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args)
	{
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.get("https://web.whatsapp.com/");

	}

}
