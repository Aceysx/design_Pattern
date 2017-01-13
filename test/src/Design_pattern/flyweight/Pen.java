package Design_pattern.flyweight;

public class Pen extends PenFlyweight{
	private String color;
	
	//构造一个笔
	public Pen(String color) {
		this.color = color;
	}
	
	//展示笔的颜色
	@Override
	public void showColor() {
		System.out.println("笔的颜色：" + color);
	}

}
