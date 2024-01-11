package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		
		Thread.sleep(500);
		
		boolean result = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		
		System.out.println("otp button is "+result);

	}

}
