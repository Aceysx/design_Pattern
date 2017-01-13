package Design_pattern.adapter;

public class Clothes {
	//衣服价钱
	private Integer price = 500;
	
	public void sale(){
		System.out.println("衣服原价："  + price);
	}
	
	public Integer getPrice() {
		return price;
	}
}
