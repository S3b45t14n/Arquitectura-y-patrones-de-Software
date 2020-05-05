package creational.abstract_Factory;

/**
 *
 * @author Sebastian
 */
/**
 * Paso 2: Crear clases concretas implementando la misma interfaz
 *
 * @author Sebastian
 */
public class RoundedRectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside RoundedRectangle::draw() method.");
    }
}
