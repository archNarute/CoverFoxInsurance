package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Desktop\\velocity\\testing.xlsx");
		
	    Workbook myFile = WorkbookFactory.create(file);
	    Sheet mySheet = myFile.getSheet("Sheet2");
	    
	    //i want to print whole row
	    for(int i=0; i<=3; i++)
	    {String value = mySheet.getRow(0).getCell(i).getStringCellValue();
	     System.out.print(value+" ");
	    }
	    
	    System.out.println();
	    System.out.println("------------------------------------------");
	  //i want to print whole column
	    for(int i=0;i<=3; i++)
	    {String value = mySheet.getRow(i).getCell(5).getStringCellValue();
	    System.out.println(value);
	    }
	}

}
