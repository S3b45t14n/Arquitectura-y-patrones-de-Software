package creational.singleton;

/**
 *
 * @author Sebastian
 *
 * Vamos a crear una clase SingleObject . La clase SingleObject tiene su
 * constructor como privado y tiene una instancia estática de sí mismo.
 *
 * La clase SingleObject proporciona un método estático para llevar su instancia
 * estática al mundo exterior. SingletonPatternDemo , nuestra clase de
 * demostración utilizará la clase SingleObject para obtener un objeto
 * SingleObject .
 * 
 * Paso 1: Crear una clase Singleton
 */
public class SingleObject {

// create an object of SingleObject
    private static SingleObject instance = new SingleObject();

// make the constructor private so that this class cannot be instantiated
    private SingleObject() {
    }

// Get the only object available
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }

}
