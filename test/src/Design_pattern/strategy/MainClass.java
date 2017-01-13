package Design_pattern.strategy;

public class MainClass {
	public static void main(String[] args) {
		Strategy strategy = new Context(new MathStrategy());
		strategy.lesson();
	}
	
}
