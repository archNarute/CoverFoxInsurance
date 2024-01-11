package javaScriptScrolling;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icicibank.com/");
		Thread.sleep(1000);
		WebElement trendingDeals = driver.findElement(By.xpath("//p[text()='Trending Deals']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();", trendingDeals);
		Thread.sleep(1000);
		
	    WebElement digitalBanking = driver.findElement(By.xpath("(//b[text()='DIGITAL BANKING'])[1]"));
	    js.executeScript("arguments[0].scrollIntoView();", digitalBanking);
	    
	    File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    
	    File dest=new File("C:\\Users\\Dell\\Desktop\\velocity\\test.png");
	    
	    FileHandler.copy(source, dest);

	}

}
