package Generic_Utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {

	/**
	 * it used to read data from excel
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws Throwable
	 * @author Shobha
	 */
	public String getExcelData(String sheetName, int rowNum, int cellNum) throws Throwable {
		FileInputStream fis2 = new FileInputStream("./src/test/resources/ExcelTestData.xlsx");

		// step2:-open workbook in read mode
		Workbook book = WorkbookFactory.create(fis2);

		// step3:-get the control of the Sheet
		Sheet sheet = book.getSheet(sheetName);

		// step4:- get control of the row
		Row row = sheet.getRow(rowNum);

		// step5:- get control of the cell
		Cell cell = row.getCell(cellNum);

		String ExcelData = cell.getStringCellValue();
		return ExcelData;
	}

	public String readExcelDataUsingDataFormatter(String sheetName, int rowNum, int cellNum) throws Throwable {
		FileInputStream fis2 = new FileInputStream("./src/test/resources/ExcelTestData.xlsx");

		// step2:-open workbook in read mode
		Workbook book = WorkbookFactory.create(fis2);

		// step3:-get the control of the Sheet
		Sheet sheet = book.getSheet(sheetName);

		// step4:- get control of the row
		Row row = sheet.getRow(rowNum);

		// step5:- get control of the cell
		Cell cell = row.getCell(cellNum);

		DataFormatter format = new DataFormatter();
		String ExcelData = format.formatCellValue(cell);
		return ExcelData;

	}
}
