package springcore.beanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {	
	
	public static 
		ClassPathXmlApplicationContext ctx = null;
	
	public static void main(String[] args) {
		
		ctx = new ClassPathXmlApplicationContext(
			"classpath:/springcore/beanScope/beanScopeConfig.xml");
		
		University uni = 
				(University)ctx.getBean("university");
		
		System.out.println(uni);
		
		ctx.close();
	}
}
