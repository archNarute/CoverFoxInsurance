package locators_use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains_Text {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805688%7Cb%7C%23fb%7C&placement=&creative=550525805688&keyword=%23fb&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221592%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-311723615984%26loc_physical_ms%3D9062114%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwsp6pBhCfARIsAD3GZuZdRXn1yS-3GwOWJ027kG8vDvi5enwfMVX_pNpyszATbQpnvG7fjCAaAlBvEALw_wcB");

		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you')]")).click();
		
		//driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("hi");
	}

}
