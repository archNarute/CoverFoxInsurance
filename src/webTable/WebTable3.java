package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		int noOfRows = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();	
		int noOfCells = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]/th")).size();	
		
		System.out.println("============================================================");
		//print header
		for(int h=1; h<=noOfCells; h++)
		{
			 WebElement header = driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]/th["+ h +"]"));	
		     System.out.print(header.getText()+" ");
		}
		System.out.println();
		System.out.println("============================================================");
		
		//print data
		//here row no 1 is given to header row as well as row no. 2
		
		for(int i=1; i<=noOfRows-1; i++)
		{
			for(int j =1;j<=noOfCells; j++)
			{
				WebElement data = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]/td["+j+"]"));
				System.out.print(data.getText()+" ");
				
			}System.out.println();
			System.out.println("============================================================");
			
		}

	}

}
