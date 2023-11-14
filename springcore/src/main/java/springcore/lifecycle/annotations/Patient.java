package springcore.lifecycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
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
	
	@PostConstruct	// 생성 전 표시
	public void hi() {
		System.out.println("hi()");
	}
	
	@PreDestroy   // 클로즈 전 표시
	public void bye() {
		System.out.println("bye()");
	}
}
