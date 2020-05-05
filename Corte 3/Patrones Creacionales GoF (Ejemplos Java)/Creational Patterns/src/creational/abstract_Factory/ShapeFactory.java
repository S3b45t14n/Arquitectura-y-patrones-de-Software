package creational.abstract_Factory;

/**
 *
 * @author Sebastian
 */
/**
 * Paso 4: Cree clases Factory extendiendo AbstractFactory para generar objetos
 * de clase concreta en base a la información dada.
 *
 * @author Sebastian
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
