package springadvaned.annotation.Stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("instrc")		// 아무것도 안적는다면 instructor가 component가 된다.
@Scope("prototype")			// 이렇게 하면 스프링 컨테이너는 두개의 객체를 생성한다.
public class Instructor {
	
	@Value("10")			// 값을 초기화하는 annotation인 value
	private int id;
	@Value("홍길동")
	private String name;
	@Value("#{topics}")
	private List<String> topics;
	@Autowired
	Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
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
	public List<String> getTopics() {
		return topics;
	}
	public void setTopics(List<String> topics) {
		this.topics = topics;
	}
	
	@Override
	public String toString() {
		return getId() + "          " + getName() + "        " + getTopics() + "        " + getAddress();
	}
	
}
