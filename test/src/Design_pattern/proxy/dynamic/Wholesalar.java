package Design_pattern.proxy.dynamic;

//批发商--被代理
public class Wholesalar implements Pen{
	private Integer money = 1;
	@Override
	public void sale() {
		System.out.println("铅笔1块钱");
	}
	
}
