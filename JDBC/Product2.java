package jDBC;

public class Product2 {
	
	int pid;
	String name;
	int price;
	String cate;
	
	public Product2(int pid, String name, int price, String cate) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.cate = cate;
	}
	
	
	@Override
	public String toString() {
		return "Product2 [pid=" + pid + ", name=" + name + ", cate=" + cate + "]";
	}
	

}
