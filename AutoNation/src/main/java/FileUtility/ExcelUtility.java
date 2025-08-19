package FileUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public String getStringDataFromExcel(String sheetName,int rowNum,int celNum) throws Throwable
	{
		
		FileInputStream fis = new FileInputStream("./testData/autoNationTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetName).getRow(rowNum).getCell(celNum).getStringCellValue();
		wb.close();
		return data;
		
	}
	public double getNumericDataFromExcel(String sheetName,int rowNum,int celNum) throws Throwable
	{
		
		FileInputStream fis = new FileInputStream("./testData/autoNationTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		double data = wb.getSheet(sheetName).getRow(rowNum).getCell(celNum).getNumericCellValue();
		wb.close();
		return data;
		
	}
	
	public int getLastRowCount(String sheetName) throws Throwable {
		FileInputStream fis = new FileInputStream("./testData/autoNationTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowcount = wb.getSheet(sheetName).getLastRowNum();
		wb.close();
		return rowcount;
	}
	
	public void setDataIntoExcel(String sheetName,int rowNum,int celNum) throws Throwable
	{
		FileInputStream fis = new FileInputStream("./testdata/autoNationTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(rowNum).createCell(celNum);
		FileOutputStream fos = new FileOutputStream("./testdata/testData.xlsx");
		wb.write(fos);
		wb.close();
		
	}
		
}

