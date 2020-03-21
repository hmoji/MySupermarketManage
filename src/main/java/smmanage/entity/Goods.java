package smmanage.entity;

/**
 * 
 * @Title: Goods
 * @Description:实体层，映射数据库里的<code>goods</code>库
 * @author Hmoji
 * @date 2020年3月21日
 * @time 下午10:10:28
 */
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
