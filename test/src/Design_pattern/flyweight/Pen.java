package Design_pattern.flyweight;

public class Pen extends PenFlyweight{
	private String color;
	
	//����һ����
	public Pen(String color) {
		this.color = color;
	}
	
	//չʾ�ʵ���ɫ
	@Override
	public void showColor() {
		System.out.println("�ʵ���ɫ��" + color);
	}

}
