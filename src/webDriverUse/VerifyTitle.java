package webDriverUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) throws InterruptedException
	{
		//we need to check expected and actual result
		
		String expectedResult= "Groww - Online Demat, Trading and Direct Mutual Fund Investment in India";
		WebDriver driver= new ChromeDriver();
		driver.get("https://groww.in/");
		
		Thread.sleep(2000);
		String actualResult = driver.getTitle();
		
       if(expectedResult.equals(actualResult))
       {
    	   System.out.println("Title is matched and result is pass");
       }
       else
       {
    	   System.out.println("Title is not matched and result is fail");
       }
	}

}
