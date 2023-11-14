package springcore.constructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {	
	
	public static 
		ClassPathXmlApplicationContext ctx = null;
	
	public static void main(String[] args) {
		
		ctx = new ClassPathXmlApplicationContext(
			"classpath:/springcore/constructorinjection/ciconfig.xml");
		
		Employee employee = 
				(Employee)ctx.getBean("employee");
		
		System.out.println(employee);
		
		ctx.close();
	}
}
