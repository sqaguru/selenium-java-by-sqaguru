package sqaguru.testng.dataproviders.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import co.in.sqaguru.framework.Base;

public class TestNGDataProviderUsingExcelMap extends Base {

	@Test(dataProvider = "ExcelMaps")
	public void printExcelMapsTest(HashMap<String, String> testData) throws InterruptedException {

		// libre office - copy free
		driver.get("https://www.google.com/");// navigate to taret url

		driver.findElement(By.name("q")).sendKeys(testData.get("FirstName"));

		driver.findElement(By.name("q")).submit();
	}

	@DataProvider(name = "ExcelMaps")
	public static Object[] getExcelMaps() throws FileNotFoundException, IOException {
		/* file object */
		HSSFWorkbook workbook = new HSSFWorkbook(
				new FileInputStream("D:\\sqa-guru\\selenium-java-by-sqaguru\\resources\\testdata\\TestData.xls"));

		/* specific sheet object */
		HSSFSheet sheetTestData = workbook.getSheet("testdata");

		int totalRows = sheetTestData.getPhysicalNumberOfRows();

		HSSFRow rowHeader = sheetTestData.getRow(0);

		int totalColumns = rowHeader.getPhysicalNumberOfCells();

		Object object[] = new Object[totalRows - 1];

		// first loop Iterating for all numbers of rows
		for (int rowCounter = 1; rowCounter < totalRows; rowCounter++) {

			HashMap<String, String> hashMap = new HashMap<String, String>();

			HSSFRow row = sheetTestData.getRow(rowCounter);

			// second loop iterates for all the column for that specific row
			for (int columnCounter = 0; columnCounter < totalColumns; columnCounter++) {

				String headerData = rowHeader.getCell(columnCounter).getStringCellValue();

				String rowData = row.getCell(columnCounter).getStringCellValue();
				System.out.println("rowData: " + rowData);

				hashMap.put(headerData, rowData);

				HSSFCell cell = row.getCell(columnCounter);

				String cellData = cell.getStringCellValue();

			}

			object[rowCounter - 1] = hashMap;
		}
		return object;
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		getTestData();
	}

	private static void getTestData() {
		try {
			FileInputStream file = new FileInputStream(
					"D:\\sqa-guru\\selenium-automation-bat2021jul\\selenium-automation-bat2021jul\\resources\\testdata\\TestData_Sample.xls");
			HSSFWorkbook workbook = new HSSFWorkbook(file);
			HSSFSheet worksheet = workbook.getSheet("testdata");
			int totalRows = worksheet.getPhysicalNumberOfRows();
			System.out.println("total number of rows in excel worksheet: " + totalRows);

			int totalColumns = worksheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("total number of rows in excel worksheet: " + totalColumns);

			for (int rowCounter = 0; rowCounter < totalRows; rowCounter++) {
				HSSFRow row = worksheet.getRow(rowCounter);
				for (int columnCounter = 0; columnCounter < totalColumns; columnCounter++) {
					HSSFCell cell = row.getCell(columnCounter);
					if (cell != null) {
						String data = cell.getStringCellValue();
						System.out.println("data: " + data);
					}
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
