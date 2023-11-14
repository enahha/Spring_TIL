package springcore.injection.ref;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
	
		String path = "classpath:/springcore/injection/ref/refconfig.xml";
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(path);
		
		Student student = (Student)ctx.getBean("student");
		
		System.out.println(student.getScores());
	}

}
