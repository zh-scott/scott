package cn.com.scott.pojo;

/**
 * @ClassName: Item
 * @Description: 简单实体类
 * @Author zhuhao
 * @Date: 2021年3月10日 上午10:59:29
 */
public class Item {

	public Item () {
		System.out.println("无参构造函数");
	}
	
	public Item(int id, String name, double price) {
		System.out.println("id=" + id + ", name=" + name + ", price=" + price);
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	/*
	 * id
	 */
	private int id;
	
	/*
	 * 名称
	 */
	private String name;
	
	/*
	 * 价格
	 */
	private double price;

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
}
