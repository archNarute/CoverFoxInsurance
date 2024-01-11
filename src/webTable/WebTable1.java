package webTable;

import java.time.Duration;
import java.util.List;

import org.checkerframework.checker.units.qual.h;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		//get no. of rows in column
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		int totalNoofRows=rows.size();
		System.out.println("total no. of rows in table is "+totalNoofRows);
		
		System.out.println("================================================");
		
		//total no. of columns is table
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
		int noofColumns=columns.size();
		System.out.println("total no. of columns is "+noofColumns);
		System.out.println("================================================");
		
		//get total header of table
		List<WebElement> header = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
		
		for(WebElement h:header)
		{
			System.out.print(h.getText()+" ");
		}
		System.out.println();
		System.out.println("================================================");
		
		//get one header name of table
		String header4 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]/th[4]")).getText();
		System.out.println(header4);
		System.out.println("================================================");
		//get whole row of table
		List<WebElement> row6 = driver.findElements(By.xpath("//table[@name='BookTable']//tr[6]"));
        for(WebElement wholeRow:row6)
        {
        	System.out.print(wholeRow.getText()+" ");
        }
        System.out.println();
        System.out.println("================================================");
        
      //get specific data of table
       String tableData = driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]/td[3]")).getText();
       System.out.println(tableData);
       System.out.println("================================================");
       
       //get Whole Column without header
       for(int i=2; i<=7;i++)  //column fix row vary
       {WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[4]"));
    	   System.out.println(data.getText());
    	   
    	   }
       }
        
        
	}


