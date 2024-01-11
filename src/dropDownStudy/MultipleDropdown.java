package dropDownStudy;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);
		
		WebElement result = driver.findElement(By.name("cars"));
		Select s = new Select(result);
		System.out.println("status is "+ s.isMultiple());
		
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByValue("volvo");
		Thread.sleep(1000);
		s.selectByVisibleText("Opel");
		Thread.sleep(1000);
		//s.selectByIndex(3);
		//Thread.sleep(1000);
		//s.deselectByIndex(1);
		
		//s.deselectAll();
		
		 System.out.println(s.getFirstSelectedOption().getText());
		 System.out.println("==========================================");
		 
		 List<WebElement> op = s.getOptions(); //gives all options
		 for(WebElement o:op)
		 {
			 System.out.println(o.getText());
		 }
		 Thread.sleep(1000);
		 System.out.println("==========================================");
		for(int i=0; i<=op.size()-1; i++)
		{
			System.out.println(op.get(i).getText());
		}
		 Thread.sleep(1000);
		 System.out.println("==========================================");
		 Iterator<WebElement> it = op.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next().getText());
		 }
		 Thread.sleep(1000);
		 System.out.println("==========================================");
		 ListIterator<WebElement> li = op.listIterator();
		 while(li.hasNext())
		 {
			 System.out.println(li.next().getText());
		 }
		 System.out.println("==========================================");
		 System.out.println("==========================================");
		 List<WebElement> all = s.getAllSelectedOptions();
		  for(int m=0; m<=all.size()-1; m++)
		  {
			  System.out.println(all.get(m).getText());
		  }
		  System.out.println("==========================================");
		  for(WebElement a:all)
		  {
			  System.out.println(a.getText());
		  }
		  Iterator<WebElement> a1 = all.iterator();
		  while(a1.hasNext())
		  {
			  System.out.println(a1.next().getText());
		  }
	}
        
}
