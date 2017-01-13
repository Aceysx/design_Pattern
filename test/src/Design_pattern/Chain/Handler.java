package Design_pattern.Chain;

public abstract class Handler {
	//下一环对象（使用protected，让子类可以访问）
	protected Handler handler = null;
	
	//设置当前环的下一环
	public void setSuccessor(Handler handler){
		this.handler = handler;
	}
	
	//获取当前环的下一环
	public Handler getSuccessor() {
		return handler;
	}
	
	//获取当前环的学费
	public abstract Integer getTuition(Student student, Integer tuition);

}
