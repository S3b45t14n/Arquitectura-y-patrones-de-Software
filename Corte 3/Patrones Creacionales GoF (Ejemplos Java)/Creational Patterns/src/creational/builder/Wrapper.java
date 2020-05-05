package creational.builder;

/**
 *
 * @author Sebastian
 */
/**
 * Paso 2: Crear clases concretas implementando la interfaz de embalaje.
 * @author Sebastian
 */
public class Wrapper implements Packing{

    @Override
    public String pack() {
        return "Wrapper";
    }
    
}
