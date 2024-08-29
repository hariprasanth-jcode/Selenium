package ddtproperties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Base {
@Test
public void ExcelWrite() throws EncryptedDocumentException, IOException {
	String file="./DDT/Prop.xlsx";
	//FileOutputStream fos = new FileOutputStream(file);
	FileInputStream fis = new FileInputStream(file);
	Workbook w=WorkbookFactory.create(fis);	
	int sheet=w.getNumberOfSheets();
	System.out.println(sheet);
	w.getSheet("Sheet1").createRow(0).createCell(0).setCellValue(0.5);
	w.getSheet("Sheet1").createRow(0).createCell(1).setCellValue(12);	
	System.out.println(w.getSheet("Sheet1").getRow(0).getCell(0));
	//System.out.println(w.getSheet("Sheet1").getRow(1).getCell(0));
 
	
	
	
}
}
