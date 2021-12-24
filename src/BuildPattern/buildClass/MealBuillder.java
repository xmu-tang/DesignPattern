package BuildPattern.buildClass;

import BuildPattern.Entity.ChickenBurger;
import BuildPattern.Entity.Coke;
import BuildPattern.Entity.Meal;
import BuildPattern.Entity.Pepsi;
import BuildPattern.Entity.VegBurger;

public class MealBuillder {
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	public Meal prepareNoVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
