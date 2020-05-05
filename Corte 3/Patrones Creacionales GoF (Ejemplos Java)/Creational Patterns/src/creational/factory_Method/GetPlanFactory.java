package creational.factory_Method;

/**
 *
 * @author Sebastian
 */
/**
 * Paso 3: Cree un GetPlanFactory para generar objetos de clases concretas en función de
 * la información dada
 *
 * @author Sebastian
 */
public class GetPlanFactory {

    /**
     * Use getPlan method to get object of type Plan
     *
     * @param planType
     * @return
     */
    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}
