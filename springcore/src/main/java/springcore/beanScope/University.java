package springcore.beanScope;

import org.springframework.beans.factory.annotation.Required;

public class University {
	private int id;
	private String name;
	private Location location;
	
	@Required		// 반드시 프로퍼티를 이용하여 값을 주입받도록 정의. 값이 안들어오면 에러나게 함. 
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
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return getId() + ">>" + getName() + "<<" + getLocation();
	}
}
