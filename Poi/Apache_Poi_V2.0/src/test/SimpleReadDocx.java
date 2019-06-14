package test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class SimpleReadDocx {

	public static void main(String[] args) {
		try {

			File target = new File("doc/test.xml");
			
			FileInputStream fis = new FileInputStream(target);
			OPCPackage opc = null;
			try {
				opc = OPCPackage.open(fis);
				
			} catch (InvalidFormatException e) {
				e.printStackTrace();
			}
			System.out.println("\n\n\n------------------------------------\n\n\n");
			XWPFDocument docx = new XWPFDocument(opc);
			System.out.println(docx.getDocument()+"\n");
			
			
			XWPFWordExtractor we = new XWPFWordExtractor(docx);
			
			
			System.out.println(we.getText());
			
			we.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
