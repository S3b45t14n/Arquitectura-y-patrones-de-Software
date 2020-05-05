package creational.prototype;

/**
 *
 * @author Sebastian
 */
/**
 * Paso 4: ProtorypePatternDemo utiliza ShapeCache para obtener clones de formas
 * almacenadas en una tabla hash.
 *
 * @author Sebastian
 */
public class PrototypePatternDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedShape.getType());
        
        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape: " + clonedShape2.getType());
        
        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape: " + clonedShape3.getType());
        
    }
}
