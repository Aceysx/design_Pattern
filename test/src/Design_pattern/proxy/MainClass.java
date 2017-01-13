package Design_pattern.proxy;

public class MainClass {
	public static void main(String[] args) {
		Retailer retailer = new Retailer(new Wholesalar());
		retailer.sale();
	}
}
