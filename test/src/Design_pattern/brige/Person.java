package Design_pattern.brige;

public abstract class Person {
	private Clothes clothes;
	//�õ��·�
	public Person(Clothes clothes) {
		this.clothes = clothes;
	}
	
	//�Դ��·�
	public abstract void tryIt();
	
	
	public Clothes getClothes() {
		return clothes;
	}
}
