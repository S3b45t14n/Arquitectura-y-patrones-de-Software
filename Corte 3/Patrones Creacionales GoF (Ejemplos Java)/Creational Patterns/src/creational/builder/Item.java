package creational.builder;

/**
 *
 * @author Sebastian
 */
/**
 * Hemos considerado un caso de negocios de restaurante de comida rápida donde
 * una comida típica podría ser una hamburguesa y una bebida fría. La
 * hamburguesa puede ser una hamburguesa vegetariana o una hamburguesa de pollo
 * y estará empacada en una envoltura. La bebida fría puede ser una coca cola o
 * una pepsi y se envasará en una botella.
 *
 * Vamos a crear un artículo de interfaz que representa alimentos como
 * hamburguesas y bebidas frías y clases concretas de aplicación del artículo
 * interfaz y un embalaje interfaz que representa el envasado de alimentos y
 * clases concretas de aplicación del Embalaje interfaz como hamburguesa sería
 * envasado en envoltura y bebida fría Sería embalado como una botella.
 *
 * Luego creamos una clase Meal que tiene ArrayList of Item y un MealBuilder
 * para construir diferentes tipos de objetos Meal combinando Item .
 * BuilderPatternDemo , nuestra clase de demostración utilizará MealBuilder para
 * crear una comida .
 *
 * Paso 1: Cree un elemento de interfaz que represente el alimento y el embalaje
 *
 * @author Sebastian
 */
public interface Item {

    public String name();
    public Packing packing();
    public float price();
}
