package miscelenious;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonlyUsedMethods 
{
   //if we make this method as nonstatic then we have to create object but here main method is not present. as well
	// as for create object of every method there is space or memory wastage so we make these method a static

    //takesScreenshot
	//wait
	//excelsheet
	//scrollIntoView
	
	public static void takeScreenshot(WebDriver driver,String fileName ) throws IOException
	{
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Dell\\Desktop\\velocity\\selenium practice ss\\"+fileName+".png");
		FileHandler.copy(src, dest);
	}

	public static void implicitWait(WebDriver driver, int time) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	public static void scrollIntoView1(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
	
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

    public static void excelSheet(String filename,String sheet) throws EncryptedDocumentException, IOException
    {
    	FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Desktop\\velocity\\"+filename+".xlsx");
    	Workbook myWorkBook = WorkbookFactory.create(file);
    	Sheet mySheet = myWorkBook.getSheet(sheet);
    	
//    	wrong way
    }
    
    public static String excelSheet(String sheet, int row, int cell) throws EncryptedDocumentException, IOException
    {
    	FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Desktop\\velocity\\testing.xlsx");
    	Workbook myWorkBook = WorkbookFactory.create(file);
    	 String result = myWorkBook.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
    	 return result;
    	
    	
    }



}
