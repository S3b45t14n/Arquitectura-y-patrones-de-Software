package creational.abstract_Factory;

/**
 *
 * @author Sebastian
 */
/**
 * Vamos a crear una interfaz Shape y una clase concreta para implementarla.
 * Creamos una clase abstracta de fábrica AbstractFactory como siguiente paso.
 * Se define la clase de fábrica ShapeFactory, que extiende AbstractFactory. Se
 * crea una clase de creador / generador de fábrica FactoryProducer.
 *
 * AbstractFactoryPatternDemo, nuestra clase de demostración utiliza
 * FactoryProducer para obtener un objeto AbstractFactory. Pasará información
 * (CIRCLE / RECTANGLE / SQUARE para Shape) a AbstractFactory para obtener el
 * tipo de objeto que necesita. 
 * Paso 1: Crear una interfaz para formas
 */
public interface Shape {

    void draw();
}
