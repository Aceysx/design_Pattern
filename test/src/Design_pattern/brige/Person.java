package Design_pattern.brige;

public abstract class Person {
	private Clothes clothes;
	//得到衣服
	public Person(Clothes clothes) {
		this.clothes = clothes;
	}
	
	//试穿衣服
	public abstract void tryIt();
	
	
	public Clothes getClothes() {
		return clothes;
	}
}
