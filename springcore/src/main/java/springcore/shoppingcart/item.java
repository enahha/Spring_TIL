package springcore.shoppingcart;

public class item {
	private int id;
	private String name;
	private double price;
	private int quantity;
	
	
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


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "id : " + id + "\nname : " + name + "\nprice : " + price + " qnt : " + quantity;
	}
}
