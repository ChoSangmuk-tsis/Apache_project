import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class SimpleWriteDocx {// 해당 예제는 test.docx 파일에 현재시간을 입력하는 예제입니다.

	public static void main(String[] args) {
		try {
			File target = new File("doc/test.docx");
			//"doc/test.docx"문서를 target 파일을 지정합니다. 
			
			XWPFDocument docx = new XWPFDocument();
			/* XWPFDocument : .docx 혹은 .dotx 파일 작업을 위한 높은 수준의 클래스로, fis와 연결합니다. 이제 docx를 통해서 test.docx에 접근할 수 있습니다.
			 * .doc 문서는 접근 할 수 없습니다.
			 */
			
			XWPFParagraph paragraph = docx.createParagraph();
			//현재 시간을 작성할 문단을 생성합니다. 
			
			XWPFRun run = paragraph.createRun();
			Date date = new Date();
			run.setText(date.toString());
			run.addCarriageReturn();
			System.out.println("Write Data\n"+paragraph.getText());
			//paragraph의 run을 만들어 내용을 입력하고 저장합니다.
			
			FileOutputStream fos = new FileOutputStream(target);
			//target에 작성할 수 있도록  FileOutputStream(이하 fos)을 생성합니다.
			
			docx.write(fos);
			//fos를 통해 현재 내용을 저장 합니다.
			
			docx.close();
			//사용한 XWPFDocument를  닫아 줍니다.
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

