package chromeOptions;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionClass {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co=new ChromeOptions();
		//co.addArguments("--headless");
		//co.addArguments("incognito");
		//co.addArguments("-disable-notifications");
		//co.addArguments("start-maximized");
		
		//to do all methods at a time create arraylist
		ArrayList<String> al=new ArrayList<>();
		al.add("incognito");
	    al.add("start-maximized");
		al.add("-disable-notifications");
		
		co.addArguments(al);
		
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.justdial.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());

	}

}
