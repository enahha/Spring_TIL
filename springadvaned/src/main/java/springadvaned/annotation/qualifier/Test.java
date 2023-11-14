package springadvaned.annotation.qualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	
	public static void main(String[] args) {
		
		String path = "classpath:springadvaned/annotation/qualifier/qlconfig.xml";
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(path);
		
		Employee employee = (Employee)ctx.getBean("employee");
		
		System.out.println(employee);
	}
}