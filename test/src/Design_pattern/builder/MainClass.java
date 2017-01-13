package Design_pattern.builder;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		Citchen meal = new MealA();
		Waiter waiter = new Waiter(meal);
		waiter.getMeal();
		Meal meal2 = meal.getMeal();
		System.out.println(meal2.toString());

	}
}
