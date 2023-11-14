package springmcv_uifoctrol.dto;

public class Order {
	private String ordergoods;
	private int quantity;

	public Order() {}

	public Order(String ordergoods, int quantity) {
		super();
		this.ordergoods = ordergoods;
		this.quantity = quantity;
	}

	public String getOrdergoods() {
		return ordergoods;
	}

	public void setOrdergoods(String ordergoods) {
		this.ordergoods = ordergoods;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
