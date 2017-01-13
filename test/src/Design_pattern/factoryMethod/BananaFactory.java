package Design_pattern.factoryMethod;

public class BananaFactory implements FruitFactory{

	@Override
	public Fruit getFruit() {
		return new Banana();
	}
}
