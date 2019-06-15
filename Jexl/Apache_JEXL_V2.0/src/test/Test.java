package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.jexl2.JexlContext;
import org.apache.commons.jexl2.JexlEngine;
import org.apache.commons.jexl2.MapContext;
import org.apache.commons.jexl2.Script;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JexlEngine jexl = new JexlEngine();
		File A = new File("txt/test.txt");
		Script a = null;
		try {
			a = jexl.createScript(A);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JexlContext jc = new MapContext();
		jc.set("my", new UserClass());
		jc.set("A", "111" );
		System.out.println( a.execute(jc));
		 		 
	}
	
}
