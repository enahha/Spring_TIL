package springcore.lifecycle;

public class Patient {
//	필드 영역(스프링에서는 프로퍼티라고 부름)
	private int id;
	private String name;
	
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
	
	@Override
	public String toString() {
		String mag = getId() + ":" + getName();
		return mag;
	}
	
	public void init() {
		System.out.println("init() 생성");
	}
	
	public void destroy() {
		System.out.println("destroy() 삭제");
	}
}
