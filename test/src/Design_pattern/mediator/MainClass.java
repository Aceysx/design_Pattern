package Design_pattern.mediator;

public class MainClass {
	public static void main(String[] args) {
		//���������
		Mediator mediator = new Mediator();
		
		//˫����Ϣ
		Man dabai = new Man(mediator, "���", 10000);
		
		Woman chunhua = new Woman(mediator, "����", 5000);
		
		//��������
		mediator.setPair(dabai, chunhua);
		//��Խ��
		mediator.getPair();
		
		System.out.println("---------------������-------------------");
		
		Woman linxuan = new Woman(mediator, "����", 10000);
		
		//��������
		mediator.setPair(dabai, linxuan);
		mediator.getPair();
	}
}
