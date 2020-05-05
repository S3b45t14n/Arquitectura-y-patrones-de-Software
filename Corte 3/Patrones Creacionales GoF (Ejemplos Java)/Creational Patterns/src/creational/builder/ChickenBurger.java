package creational.builder;

/**
 *
 * @author Sebastian
 */
/**
 * Paso 4: Crear clases concretas que extiendan las clases Burger y ColdDrink
 *
 * @author Sebastian
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
