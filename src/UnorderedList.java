import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
       Thread.sleep(2000);
       driver.findElement(By.name("q")).sendKeys("mahindra");
       Thread.sleep(2000);
       driver.findElement(null);
	}

}
