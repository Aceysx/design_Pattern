package Design_pattern.proxy.dynamic;

public class MainClass {
	public static void main(String[] args) {
		Pen wholesalar = (Pen) new MyProxy().bind(new Wholesalar());
		wholesalar.sale();
	}
}
