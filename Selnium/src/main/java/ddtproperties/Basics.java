package ddtproperties;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Basics {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./DDT/Excel.xlsx");
	Workbook w = WorkbookFactory.create(fis);
	w.getSheet("Sheet2").createRow(0).createCell(0).setCellValue("mail");
	w.getSheet("Sheet2").createRow(0).createCell(1).setCellValue("pwd");
	//System.out.println(w.getSheet("Sheet2").getRow(0).getCell(0).toString());
}
}
