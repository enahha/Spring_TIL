package springcore.shoppingcart;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("classpath:/springcore/shoppingcart/assigconfig.xml");
		
		ShoppingCart cart = (ShoppingCart)ctx.getBean("shoppingcart");
		
		System.out.println(cart.getItem());
	}
}