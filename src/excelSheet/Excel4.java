package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
    FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Desktop\\velocity\\testing.xlsx");
		
	    Workbook myFile = WorkbookFactory.create(file);
	    Sheet mySheet = myFile.getSheet("Sheet1");
	    
	    for(int i=0;i<=1; i++)
	    {
	    	for(int j=0; j<=2; j++)
	    	{
	    	 String value = mySheet.getRow(i).getCell(j).getStringCellValue();
	    	 System.out.print(value+" ");
	    	}
	    	System.out.println();
	    }
	    	
	}

}
