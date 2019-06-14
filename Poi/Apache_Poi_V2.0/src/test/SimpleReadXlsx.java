package test;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SimpleReadXlsx {

	public static void main(String[] args) throws Exception {
		File target = new File("doc/test.xlsx");
		
		FileInputStream fis = new FileInputStream(target);

		Workbook xlsx = WorkbookFactory.create(fis);
		
		Sheet sheet = xlsx.getSheetAt(0);
		xlsx.close();
		
		int row_count = sheet.getLastRowNum();
		
		for(int i=0;i<=row_count;i++) {
			Row row = sheet.getRow(i);
			
			System.out.println("i = "+i+" | "+row.getCell(0)+" | "+row.getCell(1));
		}

		
	}

}