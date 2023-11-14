package springcore.lifecycle.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {	
	
	public static 
		ClassPathXmlApplicationContext ctx = null;
	
	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext(
						"classpath:/springcore/lifecycle/xml/lcconfig.xml");
		Patient patient = 
				(Patient)ctx.getBean("patient");
		System.out.println(patient);
		ctx.close();
	}
}
