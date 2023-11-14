package springadvaned.annotation.Stereotype;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	
	public static void main(String[] args) {
		
		String path = "classpath:springadvaned/annotation/Stereotype/config.xml";
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(path);
		
		Instructor instructor = (Instructor)ctx.getBean("instrc");
		Instructor instructor1 = (Instructor)ctx.getBean("instrc");
		Address address = (Address)ctx.getBean("address");
		
		System.out.println(instructor.hashCode());
		System.out.println(instructor1.hashCode());
		
		System.out.println(instructor);
		System.out.println(instructor1);
		System.out.println(address);
		
		ctx.close();
	}
}