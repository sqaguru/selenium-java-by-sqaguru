package sqaguru.excel.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelReader {

	@DataProvider(name = "ExcelMaps")
	public Object[] getExcelMaps() throws FileNotFoundException, IOException {
		/* file object */
		HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(
				"D:\\sqa-guru\\workspace_bat202012147PM\\selenium-automation-by-sqaguru\\resources\\testdata\\TestData.xls"));

		/* specific sheet object */
		HSSFSheet sheetTestData = workbook.getSheet("testdata");

		int totalRows = sheetTestData.getPhysicalNumberOfRows();

		HSSFRow rowHeader = sheetTestData.getRow(0);

		int totalColumns = rowHeader.getPhysicalNumberOfCells();

		System.out.println("Total Number of Rows in the sheet: " + totalRows);

		System.out.println("Total Number of Columns in the sheet: " + totalColumns);

		Object object[] = new Object[totalRows - 1];

		// first loop Iterating for all numbers of rows
		for (int rowCounter = 1; rowCounter < totalRows; rowCounter++) {

			HashMap<String, String> hashMap = new HashMap<String, String>();

			HSSFRow row = sheetTestData.getRow(rowCounter);

			// second loop iterates for all the column for that specific row
			for (int columnCounter = 0; columnCounter < totalColumns; columnCounter++) {

				String headerData = rowHeader.getCell(columnCounter).getStringCellValue();

				String rowData = row.getCell(columnCounter).getStringCellValue();

				hashMap.put(headerData, rowData);

				HSSFCell cell = row.getCell(columnCounter);

				String cellData = cell.getStringCellValue();

				System.out.println("excel data row(" + rowCounter + "):(" + columnCounter + "): " + cellData);

			}

			object[rowCounter - 1] = hashMap;
		}
		return object;
	}

}
