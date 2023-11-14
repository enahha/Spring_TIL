package springadvaned.annotation.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	@Autowired(required=false)
	@Qualifier("address123")
	Address address;
//	@Qualifier를 쓸 시에는 생성자를 삭제해주어야 한다.
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return getAddress().toString();
	}
}
