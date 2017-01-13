package Design_pattern.template;

public abstract class Recruit {
	
	//宣传
	public abstract void propaganda();
	
	//宣讲
	public abstract void preach();

	//报名
	public abstract void signUp();
	
	//面试
	public abstract void interview();
	
	//结果
	public abstract void result();
	
	//执行
	public final void execute(){
		propaganda();
		preach();
		signUp();
		interview();
		result();
	}
}
