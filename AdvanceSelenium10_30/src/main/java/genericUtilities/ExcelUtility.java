package genericUtilities;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelUtility implements  IAutoConstants {
	Workbook workbook;
	@DataProvider(name="data")
	/**
	 * This method is used to read the data from excel
	 * @return
	 */
	public Object[][] readExcel() {
		File file=new File(Excel_PATH);
		try {
			 workbook=WorkbookFactory.create(file);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sheet = workbook.getSheet("Sheet1");
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data=new Object[rowCount][cellCount];
		for(int row=0;row<rowCount;row++) {
			Row actRow = sheet.getRow(row);
			for(int cell=0;cell<actRow.getPhysicalNumberOfCells();cell++) {
				data[row][cell]=actRow.getCell(cell).toString();
			}
		}
		return data;
		}
}
