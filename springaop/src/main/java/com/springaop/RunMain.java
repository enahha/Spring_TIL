package com.springaop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunMain {
	
/* Spring AOP 란 어떤 메소드 호출 전 후에 자동적으로 호출할 메소드를 @befor @after를 통해 호출해 줌
 * 로그를 확인할 떄 많이 쓰임. */

	private static ClassPathXmlApplicationContext ctx = null;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("classpath:/com/springaop/config.xml");
		
		ProductService productService = 
				(ProductService)ctx.getBean("productService");
		
		productService.multiply(102, 302);
		
		ctx.close();

	}

}
