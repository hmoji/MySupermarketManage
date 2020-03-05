package smmanage.entity;


public class Goods {
	private String name;
	private int price;
	private int number;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", number=" + number + "]";
	}
	
}
