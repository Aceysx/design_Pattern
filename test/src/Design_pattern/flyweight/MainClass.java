package Design_pattern.flyweight;

public class MainClass {
	public static void main(String[] args) {
		//创建一个空的笔袋
		PenFactory factory = new PenFactory();
		//依次放入三只笔
		PenFlyweight redPen = factory.getPen("红色");
		PenFlyweight bluePen = factory.getPen("蓝色");
		PenFlyweight greenPen = factory.getPen("绿色");
		System.out.println("笔袋中笔的数量：" + factory.getCount());
		System.out.println("----------------------------------------");
		
		//当从笔袋中找绿笔时，发现笔袋中有就不会再创建
		PenFlyweight greenPen1 = factory.getPen("绿色");
		System.out.println("笔袋中笔的数量：" + factory.getCount());
		System.out.println("----------------------------------------");
		//当从笔袋中找黑笔时，发现笔袋中没有，那么就会创建黑笔
		PenFlyweight blackPen = factory.getPen("黑色");
		System.out.println("笔袋中笔的数量：" + factory.getCount());

	}
}
