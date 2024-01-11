package webDriverUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_title_method {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://groww.in/");
		
		Thread.sleep(1000);
		
		String title = driver.getTitle();
		
		System.out.println("Title is "+title);
		

	}

}
