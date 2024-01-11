package popUpStudy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(1000);
        //get text of main page
        WebElement mainPageText = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']"));
	    System.out.println("Main page text is "+mainPageText.getText());
	    
	    Thread.sleep(1000);
	    driver.findElement(By.name("NewWindow")).click();
	    
	    //need to switch focus from main page to child window for this we need window id
	    
	    Set<String> allPageId = driver.getWindowHandles();
	    
	    Iterator<String> it = allPageId.iterator();
	    String mainPage = it.next();
	    String child1 = it.next();
	    //String child2 = it.next();
	    
	    System.out.println("id of main page "+mainPage);
	    System.out.println("id of child page "+child1);
	    //System.out.println("id of child page "+child2);
	    
	    driver.switchTo().window(child1);
	    Thread.sleep(1000);
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    driver.findElement(By.id("the7-search")).sendKeys("Hello");
	    
	    /*need to switch on main page 
	    Thread.sleep(1000);
	    driver.switchTo().window(mainPage);
	    Thread.sleep(1000);
	    
	    
	    //driver.findElement(By.xpath("//p[text()='Click below to open link in new tab']")).getText();
	    System.out.println( driver.findElement(By.xpath("//p[text()='Click below to open link in new tab']")).getText());*/
	    
		 
	    
		   // driver.switchTo().window(child2);
		    
		    
		    
		    //driver.findElement(By.name("NewTab")).click();
		    //Thread.sleep(1000);
		    //driver.findElement(By.xpath("//h3[contains(text(),'QA tools')]")).getText();*/
		    
	   
	}

}
