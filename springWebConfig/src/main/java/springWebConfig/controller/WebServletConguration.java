package springWebConfig.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

public class WebServletConguration implements WebApplicationInitializer {
// dispature-servlet을 web과 연결해주는 web.xml을 대체하는 클래스
	private static AnnotationConfigApplicationContext ctx = null;
	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		ctx = new AnnotationConfigApplicationContext();
		
		ctx.register(SpringConfig.class);
		
		ServletRegistration.Dynamic servlet = 
				servletContext.addServlet("dispatcher", new DispatcherServlet());
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
		
		ctx.close();
		
	}

}
