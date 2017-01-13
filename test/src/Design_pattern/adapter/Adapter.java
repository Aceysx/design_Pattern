package Design_pattern.adapter;

public class Adapter {
	private Clothes clothe;
	
	//��ȡ�·���Ϣ
	public Adapter(Clothes clothe) {
		this.clothe = clothe;
	}
	
	//һ����Ա
	public void VIP1(){
		this.clothe.sale();
		System.out.println("���Ŀ�ΪVIP1����9�ۣ����ۺ�ļ۸�Ϊ��" + 0.9 * this.clothe.getPrice());
	}
	
	//������Ա
	public void VIP2(){
		this.clothe.sale();
		System.out.println("���Ŀ�ΪVIP2����7�ۣ����ۺ�ļ۸�Ϊ��" + 0.7 * this.clothe.getPrice());
	}
}
