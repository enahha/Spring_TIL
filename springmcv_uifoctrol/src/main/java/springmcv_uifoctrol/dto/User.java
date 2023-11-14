package springmcv_uifoctrol.dto;

public class User {
	private String id;
	private String password;
	private String name;
	private String address;

	public User() {}

	public User(String id, String password, String name, String address) {
		this.id = id;
		this.setPassword(password);
		this.name = name;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return getId() 
				+ ":" + getPassword() 
				+ ":"  + getName() 
				+ ":" + getAddress();
	}


}
