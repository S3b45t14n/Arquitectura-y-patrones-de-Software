package ejemplo;

/**
 *
 * @author Sebastian
 */
public class Ejemplo {

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static float division(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("Suma: "+suma(10, 10));
        System.out.println("Resta: "+resta(10, 10));
        System.out.println("Multiplicación: "+multiplicacion(10, 10));
        System.out.println("División: "+division(10, 10));
    }

}
