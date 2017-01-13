package Design_pattern.Decorator;

public class MainClass {
	public static void main(String[] args) {
		Apple apple = new CommonApple();
		apple.func();
		System.out.println("`````````````````````````````````````````");
		apple = new LetterAppleDecorator(apple);
		apple.func();
		System.out.println("`````````````````````````````````````````");
		apple = new PackingAppleDecorator(apple);
		apple.func();
		System.out.println("`````````````````````````````````````````");
	}
	
}
