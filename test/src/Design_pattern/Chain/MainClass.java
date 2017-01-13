package Design_pattern.Chain;

public class MainClass {
	public static void main(String[] args) {
		//先组装责任链
		Scholarship scholarship = new Scholarship();
		Grant grant = new Grant();
		Poor poor = new Poor();
		
		scholarship.setSuccessor(grant);
		grant.setSuccessor(poor);
		
		//学生信息
		Student xiaobai = new Student("小白", 2000, 1500, true);
		Student zifan = new Student("张子凡", 1000, 500, false);
		
		//开始减免学费
		System.out.println(xiaobai.getName()+"最终学费:"+scholarship.getTuition(xiaobai, 8000));
		System.out.println("-------------------------------------");
		System.out.println(zifan.getName()+"最终学费:"+scholarship.getTuition(zifan, 8000));
	}
}
