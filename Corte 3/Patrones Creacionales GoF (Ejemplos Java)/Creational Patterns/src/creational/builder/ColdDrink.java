package creational.builder;

/**
 *
 * @author Sebastian
 */
/**
 * Paso 3: Cree clases abstractas que implementen la interfaz del elemento
 * proporcionando funcionalidades predeterminadas.
 *
 * @author Sebastian
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
