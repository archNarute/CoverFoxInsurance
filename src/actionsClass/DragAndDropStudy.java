package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropStudy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement start = driver.findElement(By.id("draggable"));
		WebElement end = driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		//act.moveToElement(start).clickAndHold().moveToElement(end).release().build().perform();
        //act.clickAndHold(start).release(end).build().perform();
		act.dragAndDrop(start, end).build().perform();
	}

}
