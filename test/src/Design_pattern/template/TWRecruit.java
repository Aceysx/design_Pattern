package Design_pattern.template;

//TW��Ƹ
public class TWRecruit extends Recruit{

	//����
	@Override
	public void propaganda() {
		System.out.println("TW����---");
	}

	//����
	@Override
	public void preach() {
		System.out.println("TW������------");		
	}

	//����
	@Override
	public void signUp() {
		System.out.println("TW������---------");		
	}

	//����
	@Override
	public void interview() {
		System.out.println("TW������------------");		
	}
	
	//���
	@Override
	public void result() {
		System.out.println("TW����Ƹ���---------------");		
	}

}
