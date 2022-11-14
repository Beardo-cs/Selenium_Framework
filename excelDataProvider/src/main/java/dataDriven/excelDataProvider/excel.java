package dataDriven.excelDataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excel {
	@Test
	public void getExcel() throws IOException {
		FileInputStream fis = new FileInputStream("//home//qqa0407/Documents//excelDriven.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis); // readthe excel sheet and return the data
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowcount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colcount = row.getLastCellNum();
		Object data[][] = new Object[rowcount - 1][colcount];
		for (int i = 0; i < rowcount - 1; i++) {

			//System.out.println("OuterLoop Started");
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colcount; j++) {
				//System.out.println(row.getCell(j));
				data[i][j] = row.getCell(j);
			}
			//System.out.println("OuterLoop ended");

		}
	}
}
