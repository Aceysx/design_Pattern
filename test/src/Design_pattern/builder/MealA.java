package Design_pattern.builder;

public class MealA implements Citchen{
	Meal meal = new Meal();
	@Override
	public void makeFood() {
		meal.setFood("套餐A--生产食物");
	}

	@Override
	public void makeDrink() {
		meal.setDrink("套餐A--生产饮料");
	}

	@Override
	public Meal getMeal() {
		return meal;
	}
	
}
