package creational.factory_Method;

/**
 *
 * @author Sebastian
 */
/**
 * Calcule la factura de electricidad:
 * Paso 1: Crear una clase abstracta de plan
 *
 * @author Sebastian
 */
public abstract class Plan {

    protected double rate;

    abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    }
}
