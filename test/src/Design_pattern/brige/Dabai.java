package Design_pattern.brige;

public class Dabai extends Person{
	//��ȡ�·�
	public Dabai(Clothes clothes) {
		super(clothes);
	}
	//�Դ��·�
	@Override
	public void tryIt() {
		System.out.print("���Ǵ�ף�");
		this.getClothes().clothe();
	}

}
