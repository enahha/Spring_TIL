package springadvaned.annotation.autowiring;


public class Employee {
	Address address;
	
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
