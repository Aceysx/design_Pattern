package Design_pattern.factoryMethod;

public class DemoTest {
	public static void main(String[] args) {
		Fruit apple = new AppleFactory().getFruit();
		Fruit banana = new BananaFactory().getFruit();
		apple.eat();
		banana.eat();
	}
}
