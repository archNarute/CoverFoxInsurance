package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		/*FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Desktop\\velocity\\testing.xlsx");
		
		Workbook myFile = WorkbookFactory.create(file);
        Sheet mySheet = myFile.getSheet("Sheet5");
       int lastRowNum = mySheet.getLastRowNum();
       int totalRowNum= lastRowNum;
       
      short lastCellNum = mySheet.getRow(0).getLastCellNum();
      int totalCellNum= lastCellNum-1;
        
      for(int i=0; i<=totalRowNum; i++)
      {
    	  for(int j=0; j<=totalCellNum; j++)
    	  {
    		CellType dataCellType = mySheet.getRow(i).getCell(j).getCellType();
    		//System.out.println(dataCellType);
    		
    		if(dataCellType==CellType.STRING)
    		{
    			String stringType = mySheet.getRow(i).getCell(j).getStringCellValue();
    			System.out.print(stringType+" ");
    		}
    		else if(dataCellType==CellType.NUMERIC)
    		{
    			double numericType = mySheet.getRow(i).getCell(j).getNumericCellValue();
    			System.out.print(numericType+" ");
    		}
    		else if(dataCellType==CellType.BOOLEAN)
    		{
    			boolean booleanType = mySheet.getRow(i).getCell(j).getBooleanCellValue();
    			System.out.print(booleanType+" ");
    		}
    	  }
    	  System.out.println();
      }*/
       
		
	
	}

}
