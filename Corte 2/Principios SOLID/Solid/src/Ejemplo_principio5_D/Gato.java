package Ejemplo_principio5_D;

/**
 *
 * @author Sebastian
 */
public class Gato extends Animal {
    

    public Gato(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void animal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tipoAnimal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getNombre() {
        System.out.println("El nombre del animal es "+nombre);
    }

    public void gato() {
        
    }

    @Override
    public void comunicarse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
