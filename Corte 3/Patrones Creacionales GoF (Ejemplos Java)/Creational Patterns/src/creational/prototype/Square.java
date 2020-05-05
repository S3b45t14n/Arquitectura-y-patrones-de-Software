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
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }

}
