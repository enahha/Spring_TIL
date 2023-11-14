package springcore.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
	
		String path = "classpath:/springcore/lifecycle/lcconfig.xml";
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(path);
		
		Patient patient = (Patient)ctx.getBean("patient");
		
		System.out.println(patient);
		
		ctx.close();
	}

}
