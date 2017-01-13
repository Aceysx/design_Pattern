package Design_pattern.strategy;

public class Context implements Strategy{
	private Strategy strategy;
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	@Override
	public void lesson() {
		this.strategy.lesson();
	}

}
