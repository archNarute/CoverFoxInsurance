package dropDownStudy;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Brand&utm_term=jeevansathi&gclid=CjwKCAjwp8OpBhAFEiwAG7NaEpIpEnztmu9qH9v1daV_06X6ADNvFJrXVVW9SiBVStPor20gDPibhRoCwTcQAvD_BwE");
		Thread.sleep(1000);
		//driver.manage().window().maximize();
		Thread.sleep(1000);
		//Date
		//1. find element and find their locator and store it in reference variable
	    WebElement date = driver.findElement(By.id("reg_dtofbirth_day"));
		//WebElement date = driver.findElement(By.className("w57 fl"));
	
		//2 create object of select class and pass webelement as a argument
		Select sDate=new Select(date);
		
		//by using select class method select value from the dropdown or list box
		//sDate.selectByIndex(28);
		//sDate.selectByValue("27");
		sDate.selectByVisibleText("27");  //>27<
		Thread.sleep(1000);
		//Month
		//WebElement month = driver.findElement(By.className("fl ml_10 w68"));
		driver.findElement(By.id("reg_dtofbirth_month")).sendKeys("Jan");
//		Select sMonth=new Select(month);
//		sMonth.selectByIndex(5);
//		Thread.sleep(1000);
		//year
		//WebElement year = driver.findElement(By.xpath("(//select[@onfocus='show_help(this)'])[1]"));
		//WebElement year = driver.findElement(By.id("reg_dtofbirth_year"));
		WebElement year = driver.findElement(By.name("reg[dtofbirth][year]"));
		Select sYear=new Select(year);
		sYear.selectByValue("1997"); 
		
		
		
		
		

	}

}
