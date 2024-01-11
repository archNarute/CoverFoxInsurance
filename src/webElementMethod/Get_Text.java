package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Text {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String exp_result ="Facebook helps you connect and share with the people in your life.";
		String actual_res = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]")).getText();
		System.out.println("text is "+actual_res);
		if(exp_result.equals(actual_res))
		{
			System.out.println("Text is matching and test case is passed");
		}
		
		else
		{System.out.println("Text is not matching and test case is failed");}

	}

}
