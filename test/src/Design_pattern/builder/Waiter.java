package Design_pattern.builder;

public class Waiter {
	private Citchen citchen;
	public Waiter (Citchen citchen) {
		this.citchen = citchen;
	}
	
	public Citchen getMeal(){
		citchen.makeFood();
		citchen.makeDrink();
		return citchen;
	}
}
