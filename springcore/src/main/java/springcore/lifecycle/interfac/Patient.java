package springcore.lifecycle.interfac;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean  {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		String msg = getId() + ":" + getName();
		return msg;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean 사용");
		
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean 사용");
		
	}

}
