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
public class DomesticPlan extends Plan {

    @Override
    void getRate() {
        rate = 3.50;
    }

}
