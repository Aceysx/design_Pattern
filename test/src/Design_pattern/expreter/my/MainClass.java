package Design_pattern.expreter.my;

public class MainClass {
	public static void main(String[] args) {
		//容器，存放科目及其对应分数
		Context context = new Context();
		
		//创建科目
		Subject math = new Subject();
		Subject chinese = new Subject();
		Subject english = new Subject();
		
		//保存分数
		context.addScore(math, 61);
		context.addScore(chinese, 60);
		context.addScore(english, 65);
		
		//迭代计算总分数
		Expression result = new Add(new Add(math, chinese), english) ;
		
		System.out.println("总分数为：" + result.result(context));
		
	}
}
