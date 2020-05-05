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
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

}
