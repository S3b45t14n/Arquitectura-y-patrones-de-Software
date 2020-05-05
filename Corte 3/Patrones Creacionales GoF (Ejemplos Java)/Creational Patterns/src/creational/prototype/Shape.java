package creational.prototype;

/**
 *
 * @author Sebastian
 */
/**
 * Vamos a crear una clase abstracta Forma y clases concretas que extiendan la
 * clase Forma . Una clase ShapeCache se define como el siguiente paso que
 * almacena objetos de forma en una tabla hash y devuelve su clon cuando se le
 * solicita.
 *
 * PrototypPatternDemo , nuestra clase de demostración utilizará la clase
 * ShapeCache para obtener un objeto Shape .
 *
 * Paso 1: Cree una clase abstracta implementando la interfaz Clonable
 *
 * @author Sebastian
 */
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
        }
        return clone;
    }
}
