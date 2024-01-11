package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Desktop\\velocity\\testing.xlsx");
		
		Workbook myFile = WorkbookFactory.create(file);
		Sheet mySheet = myFile.getSheet("Sheet1");
		Row myRow = mySheet.getRow(0);
		Cell myCell = myRow.getCell(0);
	//	String value = myCell.getStringCellValue();
	//	System.out.println(value);
		CellType myCellType = myCell.getCellType();
		System.out.println(myCellType);
		
		
		

	}

}
