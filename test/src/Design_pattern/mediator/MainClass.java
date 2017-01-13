package Design_pattern.mediator;

public class MainClass {
	public static void main(String[] args) {
		//创建婚介所
		Mediator mediator = new Mediator();
		
		//双方信息
		Man dabai = new Man(mediator, "大白", 10000);
		
		Woman chunhua = new Woman(mediator, "春花", 5000);
		
		//婚介所配对
		mediator.setPair(dabai, chunhua);
		//配对结果
		mediator.getPair();
		
		System.out.println("---------------换个人-------------------");
		
		Woman linxuan = new Woman(mediator, "林轩", 10000);
		
		//婚介所配对
		mediator.setPair(dabai, linxuan);
		mediator.getPair();
	}
}
