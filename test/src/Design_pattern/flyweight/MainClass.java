package Design_pattern.flyweight;

public class MainClass {
	public static void main(String[] args) {
		//����һ���յıʴ�
		PenFactory factory = new PenFactory();
		//���η�����ֻ��
		PenFlyweight redPen = factory.getPen("��ɫ");
		PenFlyweight bluePen = factory.getPen("��ɫ");
		PenFlyweight greenPen = factory.getPen("��ɫ");
		System.out.println("�ʴ��бʵ�������" + factory.getCount());
		System.out.println("----------------------------------------");
		
		//���ӱʴ������̱�ʱ�����ֱʴ����оͲ����ٴ���
		PenFlyweight greenPen1 = factory.getPen("��ɫ");
		System.out.println("�ʴ��бʵ�������" + factory.getCount());
		System.out.println("----------------------------------------");
		//���ӱʴ����Һڱ�ʱ�����ֱʴ���û�У���ô�ͻᴴ���ڱ�
		PenFlyweight blackPen = factory.getPen("��ɫ");
		System.out.println("�ʴ��бʵ�������" + factory.getCount());

	}
}
