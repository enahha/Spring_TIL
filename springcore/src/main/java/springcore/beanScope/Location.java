package springcore.beanScope;

import org.springframework.beans.factory.annotation.Required;

public class Location {
	private int x;
	private int y;
	private Address address;
	
	@Required		// 반드시 프로퍼티를 이용하여 값을 주입받도록 정의. 값이 안들어오면 에러나게 함.
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return getX() + ":" + getY() + " == " + getAddress();
	}
}
