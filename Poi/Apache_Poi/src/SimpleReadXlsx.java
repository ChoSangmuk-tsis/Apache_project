import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SimpleReadXlsx {// 해당 예제는 test.xlsx 파일을 불러와 내용을 java의 콘솔창에 보여주는 예제입니다.

	public static void main(String[] args) throws Exception {
		File target = new File("doc/test.xlsx");
		//"doc/test.xlsx"문서를 target 파일을 지정합니다. 
		
		FileInputStream fis = new FileInputStream(target);
		//target을 읽어 올 수 있도록 FileInputStream(이하 fis)을 생성합니다.

		Workbook xlsx = WorkbookFactory.create(fis);
		/* Workbook : Excel 문서를 읽거나 쓰려고 할때 사용되는 최상위 인터페이스입니다. 이제 fis와 연결하여 test.xlsx에 접근할 수 있습니다.
		 * HSSf(Excel 97~2003),XSSF(Excel 2007이상)으로 사용할 수 있으나 정확히 모를 때는 Workbook으로 선언하여 사용할 수 있습니다.
		 * .xlsb 현태는 불가능 합니다.
		 */
		
		Sheet sheet = xlsx.getSheetAt(0);
		/* 0 번째 sheet를 불러와 저장합니다.
		 * 없는 Sheet번호를 사용하게 되면 오류가 발생하게됩니다.
		 * getSheet(java.lang.String name) 메소드는 이름에 해당하는 Sheet를 불러옵니다.
		 */
		
		xlsx.close();
		//Workbook을 닫아 줍니다.
		
		int row_count = sheet.getLastRowNum();
		//sheet의 마지막 row 번호를 가지고 옵니다.
		
		for(int i=0;i<=row_count;i++) {
			Row row = sheet.getRow(i);
			/* getRow(i) i번째 row를 XML형태로 가지고 옵니다.
			 * <xml-fragment r="2" spans="1:2" >
			 * 	  <main:c r="A2">
			 * 	    <main:v>2</main:v>
			 * 	  </main:c>
			 * 	  <main:c r="B2" t="s">
			 * 	    <main:v>1</main:v>
			 * 	  </main:c>
			 * </xml-fragment>
			 */
			
			System.out.println("i = "+i+" | "+row.getCell(0)+" | "+row.getCell(1));
			//getCell(i)를 통해 i번째 cell의 데이터를 가지고 옵니다. 해당 cell에 데이터가 존재하지 않는 다면 Null을 리턴합니다.
		}

		
	}

}