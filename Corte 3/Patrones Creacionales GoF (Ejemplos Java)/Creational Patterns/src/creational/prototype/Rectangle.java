package creational.prototype;

/**
 *
 * @author Sebastian
 */
/**
 * Paso 2: Crear clases concretas que amplien la clase anterior
 *
 * @author Sebastian
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
