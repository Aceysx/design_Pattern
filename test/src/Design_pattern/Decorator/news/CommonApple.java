package Design_pattern.Decorator.news;

public class CommonApple implements Apple{

	@Override
	public void show() {
		this.func();
	}

	@Override
	public void func() {
		System.out.println("��ͨƻ��");
	}
}
