package Design_pattern.adapter;

public class MainClass {
	public static void main(String[] args) {
		Adapter adapter = new Adapter(new Clothes());
		//����
		adapter.VIP1();
	}
}
