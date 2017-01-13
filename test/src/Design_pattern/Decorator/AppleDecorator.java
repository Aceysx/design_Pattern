package Design_pattern.Decorator;

public abstract class AppleDecorator implements Apple{
	private Apple apple;
	public AppleDecorator(Apple apple) {
		this.apple = apple;
	}
	public Apple getApple() {
		return apple;
	}

	public void setApple(Apple apple) {
		this.apple = apple;
	}
	
}
