package BuildPattern;

import BuildPattern.Entity.Meal;
import BuildPattern.buildClass.MealBuillder;

public class BuilderPatternMain {

	public static void main(String[] args) {
		MealBuillder builder = new MealBuillder();
		Meal vegMeal = builder.prepareVegMeal();
		System.out.println("veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());
		
		Meal noVegMeal = builder.prepareNoVegMeal();
		System.out.println("noVeg Meal");
		noVegMeal.showItems();
		System.out.println("Total Cost: " + noVegMeal.getCost());
	}
}
