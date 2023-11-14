package springcore.injection.hash;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
	
		String path = "classpath:/springcore/injection/hash/config.xml";
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(path);
		
		Phone phone = (Phone)ctx.getBean("smartphone");
		
		System.out.println(phone.getSmartphone());
	}

}
