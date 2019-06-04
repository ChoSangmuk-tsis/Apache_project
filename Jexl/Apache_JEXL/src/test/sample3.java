package test;

import org.apache.commons.jexl2.Expression;
import org.apache.commons.jexl2.JexlContext;
import org.apache.commons.jexl2.JexlEngine;
import org.apache.commons.jexl2.MapContext;

public class sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 JexlEngine jexl = new JexlEngine();
		 String jexlExp = "A.size()";
		 Expression e = jexl.createExpression( jexlExp );

		 JexlContext jc = new MapContext();
		 jc.set("A", "11123123asd1" );
		 System.out.println(e.evaluate(jc));
	}

}
