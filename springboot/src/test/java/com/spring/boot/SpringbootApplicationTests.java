package com.spring.boot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.spring.boot.service.Service;

@SpringBootTest
class SpringbootApplicationTests {

//	@Test
//	void contextLoads() {
//	}
	
	//SpringbootApplication.java에서 생성된 컨텍스트를 autowired로 test로 가져와 실행함.	
	@Autowired
	ApplicationContext ctx;

	@Test
	public void serviceTest() {
		Service service = ctx.getBean(Service.class);
		
		service.save();
	}
}
