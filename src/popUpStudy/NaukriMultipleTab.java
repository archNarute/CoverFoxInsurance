package popUpStudy;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriMultipleTab {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='HR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Data Science']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Software & IT']")).click();
		Thread.sleep(2000);
        Set<String> allTabs = driver.getWindowHandles();
        
        ArrayList<String> alId=new ArrayList<>(allTabs);
        
        for(int i=0; i<=alId.size()-1; i++)
        {
        	Thread.sleep(500);
        	driver.switchTo().window(alId.get(i));
        	Thread.sleep(500);
        	System.out.println(driver.getTitle());
        }
	}

}
