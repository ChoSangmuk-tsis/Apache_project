import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class SimpleReadDocx {// 해당 예제는 test.docx 파일을 불러와 내용을 java의 콘솔창에 보여주는 예제입니다.

	public static void main(String[] args) {
		try {
			File target = new File("doc/test.docx");
			//"doc/test.docx"문서를 target 파일을 지정합니다. 
			
			FileInputStream fis = new FileInputStream(target);
			//target을 읽어 올 수 있도록 FileInputStream(이하 fis)을 생성합니다.
			
			XWPFDocument docx = new XWPFDocument(fis);
			/* XWPFDocument : .docx 혹은 .dotx 파일 작업을 위한 높은 수준의 클래스로, fis와 연결합니다. 이제 docx를 통해서 test.docx에 접근할 수 있습니다.
			 * .doc 문서는 접근 할 수 없습니다.
			 */
			
			System.out.println(docx.getDocument()+"\n");
 			/* getDocument()메소드를 통해 문서의 내용을 XML 형태로 확인할 수 있습니다.
				예시)
				<xml-fragment >
				  <w:body>
				    <w:p w:rsidR="00616E23" w:rsidRDefault="00770C52">
				      <w:r>
				        <w:t>I want delicious food.</w:t>
				      </w:r>
				      <w:bookmarkStart w:id="0" w:name="_GoBack"/>
				      <w:bookmarkEnd w:id="0"/>
				    </w:p>
				    <w:sectPr w:rsidR="00616E23" w:rsidSect="00251F38">
				      <w:pgSz w:w="11900" w:h="16840"/>
				      <w:pgMar w:top="1701" w:right="1440" w:bottom="1440" w:left="1440" w:header="851" w:footer="992" w:gutter="0"/>
				      <w:cols w:space="425"/>
				      <w:docGrid w:linePitch="360"/>
				    </w:sectPr>
				  </w:body>
				</xml-fragment>
			*/
			
			XWPFWordExtractor we = new XWPFWordExtractor(docx);
			//XWPFWordExtractor : OOXML Word 파일에서 텍스트를 추출하는 클래스입니다.
			
			System.out.println(we.getText());
			/*  target 파일에 저장된 내용이 출력됩니다. 
			 	I want delicious food. 
			 */
			we.close();
			//XWPFWordExtractor를 닫아 줍니다.
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
