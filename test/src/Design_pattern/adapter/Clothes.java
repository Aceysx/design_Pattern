package Design_pattern.adapter;

public class Clothes {
	//�·���Ǯ
	private Integer price = 500;
	
	public void sale(){
		System.out.println("�·�ԭ�ۣ�"  + price);
	}
	
	public Integer getPrice() {
		return price;
	}
}
