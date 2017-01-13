package Design_pattern.adapter;

public class Adapter {
	private Clothes clothe;
	
	//获取衣服信息
	public Adapter(Clothes clothe) {
		this.clothe = clothe;
	}
	
	//一级会员
	public void VIP1(){
		this.clothe.sale();
		System.out.println("您的卡为VIP1，打9折，打折后的价格为：" + 0.9 * this.clothe.getPrice());
	}
	
	//二级会员
	public void VIP2(){
		this.clothe.sale();
		System.out.println("您的卡为VIP2，打7折，打折后的价格为：" + 0.7 * this.clothe.getPrice());
	}
}
