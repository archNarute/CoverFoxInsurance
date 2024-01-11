package screenShot;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import org.apache.poi.hwpf.usermodel.DateAndTime;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot_use {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		//driver.get("https://meet.google.com/?authuser=0");
		driver.get("https://in.bookmyshow.com/");
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(500);
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); //typecast //it will store in temporary location
		//we have to store in it specific folder so create folder and copy path
		RandomString rs=new RandomString();  //if not done it then it will override ss
		String r = rs.make(3);
//		DateAndTime dt=new DateAndTime();
//		Calendar d = dt.getDate();
        File dest=new File("C:\\Users\\Dell\\Desktop\\velocity\\selenium practice ss\\myscreenshot"+r+".png");
		FileHandler.copy(source, dest);

	}

}
