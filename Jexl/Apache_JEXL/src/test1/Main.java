package test1;
import org.apache.commons.jexl2.JexlContext;
import org.apache.commons.jexl2.JexlEngine;
import org.apache.commons.jexl2.UnifiedJEXL;
import org.apache.commons.jexl2.MapContext;

public class Main {

	private static JexlEngine engine = new JexlEngine();
	private static UnifiedJEXL unified = new UnifiedJEXL(engine);
	//JexlEngine, UnifiedJEXL 초기 설정
	
	public static void main(String[] args) {
		String expression = "Hello, ${SOME_VAR}!\nMy name is ${person.name}. I live in ${person.address.addressNum}, ${person.address.city}";
		/*
		 * 표현식을 저장 합니다. 
		 * 1. ${변수명}을 통해 변수를 불러 사용할 수 있습니다.
		 * 2. ${변수명.변수명}을 통해 변수명 안에저장된 변수를 사용할 수 있습니다.
		 * 3. expression = "${person.age>=27?'adult':'child'}"; 이러한 방법으로 조건문을 생성하고 동작 시킬 수 있습니다.
 		 */
		
		JexlContext context = new MapContext();
		Person somePerson = new Person("1234567890","Cho Sangmuk",new Address(4529,"seoul"),27);
		context.set("person",somePerson);
		context.set("SOME_VAR","Jexl Video Demo");
		/* JexlContext는 expression안에 들어갈 내용들을 셋팅합니다.
		 * 변수에 객체를 지정할 수도 있습니다.
		*/
		
		Object value = unified.parse(expression).evaluate(context);
		//unified.parse(expression).evaluate(context)를 통해 실행 결과를 저장 합니다.
		
		System.out.println(value);
		//결과를 프린트합니다.
	}
	
}
