package creational.abstract_Factory;

/**
 *
 * @author Sebastian
 */
/**
 * Paso 5: Cree una clase de generador / productor de Fábrica para obtener
 * fábricas pasando una información como Forma
 *
 * @author Sebastian
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}
