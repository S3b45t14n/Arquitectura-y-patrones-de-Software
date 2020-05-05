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
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
