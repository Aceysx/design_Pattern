package Design_pattern.Decorator;

public class LetterAppleDecorator extends AppleDecorator{
	private Apple apple;
	public LetterAppleDecorator(Apple apple) {
		super(apple);
	}
	@Override
	public void show() {
		this.getApple().show();
		this.func();
	}

	@Override
	public void func() {
		System.out.println("¿Ì×ÖÆ»¹û");
	}
}
