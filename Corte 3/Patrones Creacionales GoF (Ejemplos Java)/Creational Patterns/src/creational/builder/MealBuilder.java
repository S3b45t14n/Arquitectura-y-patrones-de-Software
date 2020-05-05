package creational.builder;

/**
 *
 * @author Sebastian
 */
/**
 * Paso 6: Cree una clase MealBuilder, la clase del generador real responsable
 * de crear objetos Meal.
 *
 * @author Sebastian
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurguer());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
