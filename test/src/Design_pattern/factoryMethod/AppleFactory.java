package Design_pattern.factoryMethod;

public class AppleFactory implements FruitFactory{

	@Override
	public Fruit getFruit() {
		return new Apple();
	}
	
}
