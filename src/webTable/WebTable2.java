package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		int noOfRows = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr")).size();
		int noOfCell = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th")).size();
		
		for(int i=1; i<=noOfRows; i++)
		{
			for(int j=1; j<=noOfCell; j++)
			{
				if(i==1)
				{
					 WebElement header = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/th["+
				j+"]"));
					 System.out.print(header.getText()+" ");
				}
				
				else
				{
					WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td["+j+"]"));
					System.out.print(data.getText()+" ");
				}
			}
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------------");
		}

	}

}
