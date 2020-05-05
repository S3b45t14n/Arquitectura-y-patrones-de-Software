package Ejemplo_principio5_D;

/**
 *
 * @author Sebastian
 */
public class Principal {

    static String gato = "gato1";
    static String perro = "perro1";

    public static void main(String[] args) {
        Gato g = new Gato(gato);
        g.getNombre();
        Perro p = new Perro(perro);
        p.getNombre();
    }
}
