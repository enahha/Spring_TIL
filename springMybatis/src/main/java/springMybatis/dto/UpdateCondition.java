package springMybatis.dto;

public class UpdateCondition {
	int id;
	String address;
	
	public UpdateCondition() {}
	
	public UpdateCondition(int id, String address) {
		super();
		this.id = id;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
