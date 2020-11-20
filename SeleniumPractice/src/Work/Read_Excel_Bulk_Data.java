package Work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel_Bulk_Data {

	public static void main(String[] args) throws Exception {
		File src=new File("E:\\Selenium\\Test_data.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		int rowCount = sheet1.getLastRowNum();
		System.out.println("Row count is "+rowCount);
		for(int i=0;i<rowCount;i++) {
			String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Total row count is "+data0);
		}
		wb.close();

	}

}
