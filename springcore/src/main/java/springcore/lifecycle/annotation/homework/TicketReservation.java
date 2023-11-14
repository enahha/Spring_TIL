package springcore.lifecycle.annotation.homework;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	private int id;
	private String name;
	private String ticketNum;

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
	
	public String getTicketNum() {
		return ticketNum;
	}

	public void setTicketNum(String ticketNum) {
		this.ticketNum = ticketNum;
	}

	@Override
	public String toString() {
		String msg = getId() + ":" + getName() +":" + getTicketNum();
		return msg;
	}
	
	@PostConstruct	// 생성 전 표시
	public void initialize() {
		System.out.println("hi()");
	}
	
	@PreDestroy   // 클로즈 전 표시
	public void cleanUp() {
		System.out.println("bye()");
	}
}
