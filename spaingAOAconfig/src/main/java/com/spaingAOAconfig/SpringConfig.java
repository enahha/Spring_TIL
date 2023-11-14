package com.spaingAOAconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DaoConfig.class)
public class SpringConfig {
	
	@Bean(initMethod = "hello", destroyMethod = "goodbye")
	public Service service() {
		return new Service();
	}
}
