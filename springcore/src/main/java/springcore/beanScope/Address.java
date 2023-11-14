package springcore.beanScope;

import org.springframework.beans.factory.annotation.Required;

public class Address {
	private String street;
	private String city;
	
	@Required		// 반드시 프로퍼티를 이용하여 값을 주입받도록 정의. 값이 안들어오면 에러나게 함.
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return getCity() + " (" + getStreet() + ")";
	}
}
