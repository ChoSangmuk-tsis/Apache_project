package test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class SimpleAddWriteDocx {

	public static void main(String[] args) {
		try {
			File target = new File("doc/test.docx");
			
			FileInputStream fis = new FileInputStream(target);
			
			XWPFDocument docx = new XWPFDocument(fis);
			
			List<XWPFParagraph> paragraphs = docx.getParagraphs();
			
			System.out.println("Original Data\n");
			for(int i=0;i<paragraphs.size();i++) {
				System.out.println(paragraphs.get(i).getText());
			}
			
			XWPFParagraph paragraph = docx.createParagraph();
			
			XWPFRun run = paragraph.createRun();
			Date date = new Date();
			run.setText(date.toString());
			run.addCarriageReturn();
			System.out.println("Add Data\n"+paragraph.getText());
			
			FileOutputStream fos = new FileOutputStream(target);
			
			docx.write(fos);
			
			docx.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

