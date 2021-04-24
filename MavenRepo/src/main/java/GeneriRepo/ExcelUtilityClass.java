package GeneriRepo;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilityClass 
{
	public String getReaddata(String sheetnum,int num,int cellnum) throws Exception
	{
		FileInputStream fii = new FileInputStream(Bhavi.excelpath);
		Workbook bo = WorkbookFactory.create(fii);
		Sheet sh = bo.getSheet(sheetnum);
		Row r = sh.getRow(num);
		Cell c = r.getCell(cellnum);
		String data = c.getStringCellValue();
		return data;
	}
}
