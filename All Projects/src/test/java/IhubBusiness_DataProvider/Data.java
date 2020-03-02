package IhubBusiness_DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data {

	@DataProvider(name = "Anusha")
	public Object[][] data() throws IOException {

		FileInputStream fis = new FileInputStream("/home/anushat/Desktop/testdata.xls");
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sh = wb.getSheetAt(0);
		
		Object[][] d = new Object[sh.getLastRowNum()][2];

		for (int i = 1; i <= sh.getLastRowNum(); i++) {
			for (int j = 1; j < 3; j++) {

				d[i - 1][j - 1] = sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return d;
	}
}
