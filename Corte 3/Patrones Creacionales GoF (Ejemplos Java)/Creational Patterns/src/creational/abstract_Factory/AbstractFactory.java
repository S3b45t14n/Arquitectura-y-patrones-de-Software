package creational.abstract_Factory;

/**
 *
 * @author Sebastian
 */
/**
 * Paso 3: Crear una clase abstracta para obtener fábricas para objetos de forma
 * normal y redondeada
 *
 * @author Sebastian
 */
public abstract class AbstractFactory {

    abstract Shape getShape(String shapeType);
}
