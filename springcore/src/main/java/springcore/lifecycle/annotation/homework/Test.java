package springcore.lifecycle.annotation.homework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {	
	
	public static 
		ClassPathXmlApplicationContext ctx = null;
	
	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext(
						"classpath:/springcore/lifecycle/annotation/homework/lcconfig.xml");
		
		TicketReservation tr = (TicketReservation)ctx.getBean("ticketreservation");
		
		System.out.println(tr);
		
		ctx.close();
	}
}
