package Design_pattern.proxy;

//������--����
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
//	Ӫ������
	public void discount(){
		System.out.println("Ǧ�ʴ�������");
	}
	
}
