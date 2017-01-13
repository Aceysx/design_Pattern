package Design_pattern.simpleFactory;

public class SImpleFactoryTest {
	public static void main(String[] args) {
		Fruit apple = SimpleFactory.getApple();
		Fruit banana = SimpleFactory.getBanana();
		apple.eat();
		banana.eat();
		
		Fruit a = SimpleFactory.getFruit(Apple.class);
		a.eat();
	}
}
