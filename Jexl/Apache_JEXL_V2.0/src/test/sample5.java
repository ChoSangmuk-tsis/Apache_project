package test;

import org.apache.commons.jexl2.Expression;
import org.apache.commons.jexl2.JexlContext;
import org.apache.commons.jexl2.JexlEngine;
import org.apache.commons.jexl2.MapContext;

public class sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 JexlEngine jexl = new JexlEngine();

		 String jexlExp = "my.merge(A, '22')";

		 Expression e = jexl.createExpression( jexlExp );

		 

		 JexlContext jc = new MapContext();
		 jc.set("my", new UserClass());
		 jc.set("A", "111" );

		 

		 System.out.println(e.evaluate(jc));
	}

}
