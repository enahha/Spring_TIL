package springadvaned.annotation.autowiring.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import springadvaned.annotation.autowiring.Employee;

public class Test {
	
	public static void main(String[] args) {
		
		String path = "classpath:springadvaned/annotation/autowiring/assignment/config.xml";
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(path);
		
		Customer customer = (Customer)ctx.getBean("customer");
		
		System.out.println(customer.getReservation().getId());
		System.out.println(customer.getReservation().getTime());
		System.out.println(customer.getName());
	}
}