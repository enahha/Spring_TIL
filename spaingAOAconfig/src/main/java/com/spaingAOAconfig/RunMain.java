package com.spaingAOAconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunMain {

	private static AnnotationConfigApplicationContext ctx = null;
	public static void main(String[] args) {
		ctx = new AnnotationConfigApplicationContext
				(SpringConfig.class);
		
//		Dao dao = ctx.getBean(Dao.class);
//		dao.create();
		Service svc = ctx.getBean(Service.class);
		svc.save();
		
		ctx.close();
		
	}

}
