package springMybatis.dto;

public class SelectionConditions {
	private int id;
	private String pass;
	
	public SelectionConditions(int id, String pass) {
		super();
		this.id = id;
		this.pass = pass;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
