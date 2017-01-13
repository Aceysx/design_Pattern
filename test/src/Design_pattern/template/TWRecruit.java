package Design_pattern.template;

//TW招聘
public class TWRecruit extends Recruit{

	//宣传
	@Override
	public void propaganda() {
		System.out.println("TW宣传---");
	}

	//宣讲
	@Override
	public void preach() {
		System.out.println("TW宣讲中------");		
	}

	//报名
	@Override
	public void signUp() {
		System.out.println("TW报名中---------");		
	}

	//面试
	@Override
	public void interview() {
		System.out.println("TW面试中------------");		
	}
	
	//结果
	@Override
	public void result() {
		System.out.println("TW的招聘结果---------------");		
	}

}
