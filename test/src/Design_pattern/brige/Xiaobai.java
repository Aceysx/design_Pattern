package Design_pattern.brige;

public class Xiaobai extends Person{

	//��ȡ�·�
	public Xiaobai(Clothes clothes) {
		super(clothes);
	}
	//�Դ��·�
	@Override
	public void tryIt() {
		System.out.print("����С�ף�");
		this.getClothes().clothe();
	}
}
