package Design_pattern.Decorator;

public class PackingAppleDecorator extends AppleDecorator{
	private Apple apple;
	public PackingAppleDecorator(Apple apple) {
		super(apple);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		this.getApple().func();
		this.func();
	}

	@Override
	public void func() {
		System.out.println("高档包装苹果");
	}
}
