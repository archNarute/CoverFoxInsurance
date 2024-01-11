package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot2 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(500);
		File start = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		System.out.println(start);
		
		RandomString rs=new RandomString();
		String r = rs.make(4);
		 File end=new File("C:\\Users\\Dell\\Desktop\\velocity\\selenium practice ss\\myTest"+r+".png");
		 FileHandler.copy(start, end);
		

	}

}
