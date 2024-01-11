import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revision {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.espncricinfo.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='ds-w-[288px] card scorecard'])[1]")).click();

	}

}
