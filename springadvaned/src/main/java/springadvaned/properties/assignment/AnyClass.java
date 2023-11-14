package springadvaned.properties.assignment;

public class AnyClass {
	private String userName;
	
	public AnyClass() {}
	
	public AnyClass(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	@Override
	public String toString() {
		return getUserName();
	}
}
