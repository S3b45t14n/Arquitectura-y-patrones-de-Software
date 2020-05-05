package creational.factory_Method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Sebastian
 */
/**
 * Paso 4: Genere Bill utitlizando GetPlanFactory para obtener el objeto de
 * clases concretas pasando una información como el tipo de plan DOMESTICPLAN,
 * COMMERCIALPLAN o INSTITUTIONALPLAN
 *
 * @author Sebastian
 */
public class GenerateBill {

    public static void main(String[] args) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();
        System.out.print("Enter the name of plan for which the bill will be generated: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String planName = br.readLine();
        System.out.print("Enter the number of units for bill will be calculated: ");
        int units = Integer.parseInt(br.readLine());
        Plan p = planFactory.getPlan(planName);
        // call getRate() method and calculateBill() method of DomesticPlan
        System.out.println("Bill amount for " + planName + " of " + units + " units is: ");
        p.getRate();
        p.calculateBill(units);
    }
}
