package dataDriven.excelDataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {

	DataFormatter formatter = new DataFormatter();
	@Test(dataProvider="driveTest")
	public void testCaseData(String greeting, String Communication, String id) {
		System.out.println(greeting +" "+Communication +" "+ id);

	}

	// multiple sets of data to our tests
	// using array the data will get
	// 5 sets of data as 5 array from data provider to your tests
	// then you test will run 5 times 5 sepatate sets of data (arrays)
	@DataProvider(name = "driveTest")
	public Object[][] getData() throws IOException {
		// Object[][] data = {{array1},{array2},{array3}};
		// object is the super set of all data types
		// object will contain int and string hybrid data type
		//Object[][] data = { { "hello", "text", "1" }, { "bye", "mahi", "12" }, { "welcome", "Govind", "199" } };
		FileInputStream fis = new FileInputStream("//home//qqa0407/Documents//excelDriven.xlsx");
		//workbookinstance is needed msoffice - workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis); //readthe excel sheet and return the data
		XSSFSheet sheet =  wb.getSheetAt(0);
		//want to know no of row and column
		int rowcount = sheet.getPhysicalNumberOfRows();
		//below line to get no of columns
		XSSFRow row = sheet.getRow(0);
		int colcount = row.getLastCellNum();
		Object data[][] = new Object[rowcount-1][colcount];
		//iterate outerloop - row and innerloop - column
		for(int i=0;i<rowcount-1;i++) {
			//loop initially o we'll hear but o has heading so 0+1 we are we're changing
			//System.out.println("OuterLoop Started");
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colcount; j++) {
				//System.out.println(row.getCell(j));
				XSSFCell cell = row.getCell(j);
				data[i][j] = formatter.formatCellValue(cell);
				System.out.println(data[i][j]);
				//data[i][j] = row.getCell(j);
			}
			//System.out.println("OuterLoop ended");
			}
		
				
		
		return data;

	}

}
