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
public class VegBurguer extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burguer";
    }

}
