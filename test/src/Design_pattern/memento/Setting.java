package Design_pattern.memento;

//相关设置
public class Setting {
	private String oper;
	
	//创建一个版本
	public Version createVersion(){
		return new Version(oper);
	}
	
	//版本回退
	public void backVersion(Version version){
         this.oper = version.getSetting();
         System.out.println("----版本回退：" + oper);
	}
	//设置操作
	public void setOper(String oper) {
		System.out.println("当前操作：" + oper);
		this.oper = oper;
	}
	public String getOper() {
		return oper;
	}
}
