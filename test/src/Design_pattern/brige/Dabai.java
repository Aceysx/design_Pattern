package Design_pattern.brige;

public class Dabai extends Person{
	//获取衣服
	public Dabai(Clothes clothes) {
		super(clothes);
	}
	//试穿衣服
	@Override
	public void tryIt() {
		System.out.print("我是大白：");
		this.getClothes().clothe();
	}

}
