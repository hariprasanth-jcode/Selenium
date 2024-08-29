package ddtproperties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ToRetriveDataFromExcel {
public static void main(String[] args) throws IOException {
FileInputStream fis = new FileInputStream("./DDT/Excel.xlsx");
//XSSFWorkbook w = new XSSFWorkbook(fis);
//XSSFSheet res = w.getSheet(" Sheet1");
Workbook w = WorkbookFactory.create(fis);//generic for xlsx,.xls
System.out.println(w.getSheet("Sheet1").getRow(1).getCell(1).getBooleanCellValue());
System.out.println(w.getSheet("Sheet1").getRow(2).getCell(2).getLocalDateTimeCellValue());
System.out.println(w.getSheet("Sheet1").getRow(2).getCell(2).getDateCellValue());
System.out.println(w.getSheet("Sheet1").getRow(1).getCell(1).toString());
System.out.println(w.getSheet("Sheet1").getRow(2).getCell(2).toString());
System.out.println(w.getSheet("Sheet1").getRow(2).getCell(2).getDateCellValue());
w.getSheet("Sheet1").createRow(0).createCell(3).setCellValue("ABCDEf");
w.getSheet("Sheet1").createRow(0).createCell(4).setCellValue("Hari");
//FileOutputStream fos = new FileOutputStream("./DDT/Excel.xlsx");
//w.write(fos);
System.out.println(w.getSheet("Sheet1").getRow(0).getCell(3).toString());
}
}
