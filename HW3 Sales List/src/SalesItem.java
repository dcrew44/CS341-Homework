
public class SalesItem {
	private String name;
	private double price;
	private int quantity;
	
	public SalesItem(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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
	public String formattedPrice() {
		return String.format("$%5.2f", price);
		
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getFullPrice() {
		return price*quantity;
	}
	
	public String toString() {
		return name + "		" +this.formattedPrice() + "	" + quantity;
	}
}
