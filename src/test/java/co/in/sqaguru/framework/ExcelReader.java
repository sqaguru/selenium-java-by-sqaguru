package co.in.sqaguru.framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelReader {
	@Test
	public void printExcelData() {
		Map<String, String> testdata = getExcelDataBackup();
		Set<String> keys = testdata.keySet();
		Iterator<String> keysIterator = keys.iterator();
		while (keysIterator.hasNext()) {
			String key = keysIterator.next();
			// System.out.println("key: " + key);
			System.out.println(key + " data: " + testdata.get(key));
		}
	}

	@Test(dataProvider = "cohortBuilder")
	public void dpTest(Map<String, String> testData) {
		System.out.println(testData.get("TestCaseName"));
		System.out.println(testData.get("UserName"));
		System.out.println(testData.get("Password"));
	}
	
	public static Object[] readExcelData(String tdFilePath, String sheetName) {
		HSSFWorkbook workbook;
		Object[] object = null;

		try {
			workbook = new HSSFWorkbook(new FileInputStream(tdFilePath));
			HSSFSheet sheet = workbook.getSheet(sheetName);
			int totalRows = sheet.getPhysicalNumberOfRows();
			HSSFRow row = sheet.getRow(0);
			int totalColumns = row.getPhysicalNumberOfCells();
			object = new Object[totalRows - 1];
			for (int rowCounter = 1; rowCounter < totalRows; rowCounter++) {
				Map<String, String> testdata = new HashMap<String, String>();
				HSSFRow rowHeader = sheet.getRow(0);
				HSSFRow rowData = sheet.getRow(rowCounter);
				for (int columnCounter = 0; columnCounter < totalColumns; columnCounter++) {
					HSSFCell cellHeader = rowHeader.getCell(columnCounter);
					HSSFCell cellData = rowData.getCell(columnCounter);
					String headerName = cellHeader.getStringCellValue();
					String dataValue = cellData.getStringCellValue();
					testdata.put(headerName, dataValue);

				}
				object[rowCounter - 1] = testdata;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;

	}

	@DataProvider(name = "cohortBuilderBackup")
	public Map<String, String> getExcelDataBackup() {
		HSSFWorkbook workbook;

		Map<String, String> testdata = new HashMap<String, String>();
		try {
			workbook = new HSSFWorkbook(new FileInputStream(
					"C:\\StellarAlgo_QA\\TestAutomation\\TAStellarAlgo\\src\\test\\resources\\testdata\\TD_InsightsCohortBuilderCustomerSearchByGender.xls"));
			HSSFSheet sheet = workbook.getSheet("TestData");
			int totalRows = sheet.getPhysicalNumberOfRows();
			HSSFRow row = sheet.getRow(0);
			int totalColumns = row.getPhysicalNumberOfCells();
			System.out.println("Rows# " + totalRows);
			System.out.println("Cols# " + totalColumns);
			for (int rowCounter = 1; rowCounter < totalRows; rowCounter++) {
				HSSFRow rowHeader = sheet.getRow(0);
				HSSFRow rowData = sheet.getRow(rowCounter);
				for (int columnCounter = 0; columnCounter < totalColumns; columnCounter++) {
					HSSFCell cellHeader = rowHeader.getCell(columnCounter);
					HSSFCell cellData = rowData.getCell(columnCounter);
					String headerName = cellHeader.getStringCellValue();
					String dataValue = cellData.getStringCellValue();
					System.out.println(headerName + " :" + dataValue);
					testdata.put(headerName, dataValue);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testdata;

	}

}
