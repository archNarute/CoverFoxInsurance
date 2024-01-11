package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel5_whole {
	
  public static void main(String[] args) throws EncryptedDocumentException, IOException {
	 FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Desktop\\velocity\\new.xlsx");
	 
	 Workbook myFile = WorkbookFactory.create(file);
	 
	 Sheet mySheet = myFile.getSheet("Sheet1");
    int lastRowNum = mySheet.getLastRowNum();
    int totalRowNum=lastRowNum;
    //System.out.println(totalRowNum);
    
    short lastCellNum = mySheet.getRow(0).getLastCellNum();
    int totalCellNum=lastCellNum-1;
    
   // System.out.println(totalCellNum);
    
    for(int i=0; i<=totalRowNum; i++)
    {
    	for(int j=0; j<=totalCellNum; j++)
    	{
    		String value = mySheet.getRow(i).getCell(j).getStringCellValue();
    		System.out.print(value+" ");
    	}
    	System.out.println();
    }
}
}
