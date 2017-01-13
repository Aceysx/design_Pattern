package Design_pattern.builder;

public class MealA implements Citchen{
	Meal meal = new Meal();
	@Override
	public void makeFood() {
		meal.setFood("�ײ�A--����ʳ��");
	}

	@Override
	public void makeDrink() {
		meal.setDrink("�ײ�A--��������");
	}

	@Override
	public Meal getMeal() {
		return meal;
	}
	
}
