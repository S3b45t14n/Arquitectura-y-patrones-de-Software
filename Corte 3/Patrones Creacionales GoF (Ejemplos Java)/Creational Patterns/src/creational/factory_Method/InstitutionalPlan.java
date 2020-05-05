package creational.factory_Method;

/**
 *
 * @author Sebastian
 */
/**
 * Paso 2: Cree las clases concretas que extienden de la clase abstracta Plan
 *
 * @author Sebastian
 */
public class InstitutionalPlan extends Plan {

    @Override
    void getRate() {
        rate = 5.50;
    }
}
