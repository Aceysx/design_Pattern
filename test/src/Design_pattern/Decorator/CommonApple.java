package Design_pattern.Decorator;

public class CommonApple implements Apple{

	@Override
	public void show() {
		this.func();
	}
	@Override
	public void func() {
		System.out.println("Æ»¹û");
	}

}
