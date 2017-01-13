package Design_pattern.proxy;

//零售商--代理
public class Retailer implements Pen{
	private Pen pen;
	
	public Retailer(Pen pen) {
		this.pen = pen;
	}
	
	@Override
	public void sale() {
		discount();
		this.pen.sale();
		
	}
//	营销策略
	public void discount(){
		System.out.println("铅笔打折啦。");
	}
	
}
