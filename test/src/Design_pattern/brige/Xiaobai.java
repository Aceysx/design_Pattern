package Design_pattern.brige;

public class Xiaobai extends Person{

	//获取衣服
	public Xiaobai(Clothes clothes) {
		super(clothes);
	}
	//试穿衣服
	@Override
	public void tryIt() {
		System.out.print("我是小白：");
		this.getClothes().clothe();
	}
}
